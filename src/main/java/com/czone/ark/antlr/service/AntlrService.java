package com.czone.ark.antlr.service;

import com.czone.ark.antlr.entity.dto.Value;
import com.czone.ark.antlr.grammar.gen.GrammarLexer;
import com.czone.ark.antlr.grammar.gen.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AntlrService {

    public static final double DEFAULT = 0.0;
    public static final String RESULT = "RESULT";
    private VisitorService visitorService;

    @Autowired
    public AntlrService(VisitorService visitorService) {
        this.visitorService = visitorService;
    }


    public Object callParser(String parserString){
        Map<String, Value> visitor = visitor(parserString);
        if (visitor != null && visitor.size() > 0 && visitor.get(RESULT) != null) {
            Value value = visitor.get(RESULT);
            if (value.isLong()) {
                return value.asLong();
            }
            if (value.isDouble()) {
                return value.asDouble();
            }
            if (value.isBoolean()) {
                return value.asBoolean();
            }
            if (value.isInteger()) {
                return value.asInteger();
            }
            if (value.isString()) {
                return value.asString();
            }
        }
        return DEFAULT;


    }

    private Map<String, Value> visitor(String parserString) {
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(new StringBuilder().append(parserString).toString()));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        GrammarParser.ParseContext tree = parser.parse();
        visitorService.visit(tree);
        return visitorService.evaluate();
    }
}
