package com.czone.ark.antlr.service;

import com.czone.ark.antlr.entity.dto.Value;
import com.czone.ark.antlr.grammar.gen.GrammarBaseVisitor;
import com.czone.ark.antlr.grammar.gen.GrammarParser;
import lombok.SneakyThrows;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VisitorService extends GrammarBaseVisitor<Value> {


    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<>();

    // assignment/id overrides
    @Override
    public Value visitAssignment(GrammarParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        Value record = memory.put(id, value);
        evaluate();
        return record;
    }

    public Map<String, Value> evaluate() {
        return memory;
    }

    @SneakyThrows
    @Override
    public Value visitIdAtom(GrammarParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if (value == null) {
            throw new Exception();
        }
        return value;
    }

    // atom overrides
    @Override
    public Value visitStringAtom(GrammarParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(GrammarParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(GrammarParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(GrammarParser.NilAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(GrammarParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPowExpr(GrammarParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override
    public Value visitUnaryMinusExpr(GrammarParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(GrammarParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @SneakyThrows
    @Override
    public Value visitMultiplicationExpr(@NotNull GrammarParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case GrammarParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case GrammarParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case GrammarParser.MOD:
                return new Value((left.asDouble() * right.asDouble()) / 100);
            default:
                throw new Exception();
        }
    }

    @SneakyThrows
    @Override
    public Value visitAdditiveExpr(@NotNull GrammarParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case GrammarParser.SUM:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case GrammarParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new Exception();
        }
    }


    @Override
    public Value visitSum(@NotNull GrammarParser.SumContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() + right.asDouble());
    }

    @Override
    public Value visitMinus(@NotNull GrammarParser.MinusContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() - right.asDouble());
    }

    @Override
    public Value visitDiv(@NotNull GrammarParser.DivContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() / right.asDouble());
    }

    @Override
    public Value visitMult(@NotNull GrammarParser.MultContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() * right.asDouble());
    }

    @SneakyThrows
    @Override
    public Value visitRelationalExpr(@NotNull GrammarParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case GrammarParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case GrammarParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case GrammarParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case GrammarParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new Exception();
        }
    }

    @SneakyThrows
    @Override
    public Value visitEqualityExpr(@NotNull GrammarParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case GrammarParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case GrammarParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new Exception();
        }
    }

    @Override
    public Value visitAndExpr(GrammarParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(GrammarParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    // log override
    @Override
    public Value visitLog(GrammarParser.LogContext ctx) {
        return this.visit(ctx.expr());
    }


    // if override
    @Override
    public Value visitIf_stat(GrammarParser.If_statContext ctx) {

        List<GrammarParser.Condition_blockContext> conditions = ctx.condition_block();

        boolean evaluatedBlock = false;

        for (GrammarParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if (evaluated.asBoolean().booleanValue()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if (!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(GrammarParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());
        while (value.asBoolean().booleanValue()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }
}
