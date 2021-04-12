package com.czone.ark.antlr.entity.dto;


import java.util.List;

public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public List<?> asList() {
        return (List<?>) value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public Double asDouble() {
        return (Double) value;
    }

    public Long asLong() {
        return (Long) value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public boolean isLong() {
        return value instanceof Long;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    @Override
    public int hashCode() {

        if (value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if (value == o) {
            return true;
        }

        if (value == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Value that = (Value) o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}