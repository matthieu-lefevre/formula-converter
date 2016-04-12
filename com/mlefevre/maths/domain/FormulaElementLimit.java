package com.mlefevre.maths.domain;

import com.mlefevre.maths.domain.enumeration.FormulaElementLimitType;

public class FormulaElementLimit {

    private FormulaElementLimitType type;
    private String value;

    public FormulaElementLimitType getType() {
        return type;
    }

    public void setType(FormulaElementLimitType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
