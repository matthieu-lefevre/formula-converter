package com.mlefevre.maths.domain;

import com.sgcib.fip.common.maths.domain.enumeration.FormulaElementType;

import java.util.ArrayList;
import java.util.List;

public class FormulaElement {

    private FormulaElementType type = FormulaElementType.UNKNOWN;
    private List<FormulaElementDelimiter> delimiters = new ArrayList<FormulaElementDelimiter>(2);
    private List<FormulaElementLimit> limits = new ArrayList<FormulaElementLimit>(2);
    private String value;

    private FormulaElements elements;


    public FormulaElementType getType() {
        return type;
    }

    public void setType(FormulaElementType type) {
        this.type = type;
    }

    public List<FormulaElementDelimiter> getDelimiters() {
        return delimiters;
    }

    public void setDelimiters(List<FormulaElementDelimiter> delimiters) {
        this.delimiters = delimiters;
    }

    public void addDelimiter(FormulaElementDelimiter delimiter) {
        delimiters.add(delimiter);
    }

    public List<FormulaElementLimit> getLimits() {
        return limits;
    }

    public void setLimits(List<FormulaElementLimit> limits) {
        this.limits = limits;
    }

    public void addLimit(FormulaElementLimit limit) {
        limits.add(limit);
    }

    public FormulaElements getElements() {
        return elements;
    }

    public void setElements(FormulaElements elements) {
        this.elements = elements;
    }

    public void addElement(FormulaElement element) {
        if(null == elements) {
            elements = new FormulaElements();
        }
        elements.addElement(element);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
