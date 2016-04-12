package com.mlefevre.maths.domain;

import com.mlefevre.maths.domain.enumeration.FormulaElementDelimiterPosition;
import com.mlefevre.maths.domain.enumeration.FormulaElementDelimiterType;

public class FormulaElementDelimiter {

    private FormulaElementDelimiterPosition position;
    private FormulaElementDelimiterType type;


    public FormulaElementDelimiterPosition getPosition() {
        return position;
    }

    public void setPosition(FormulaElementDelimiterPosition position) {
        this.position = position;
    }

    public FormulaElementDelimiterType getType() {
        return type;
    }

    public void setType(FormulaElementDelimiterType type) {
        this.type = type;
    }
}
