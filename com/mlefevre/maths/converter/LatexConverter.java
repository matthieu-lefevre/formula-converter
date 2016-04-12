package com.mlefevre.maths.converter;

import com.sgcib.fip.common.maths.domain.Formula;
import com.sgcib.fip.common.maths.domain.FormulaElement;
import com.sgcib.fip.common.maths.domain.FormulaElements;

public class LatexConverter implements FormulaConverter {

    public String convert(Formula formula) {
        if(null == formula || null == formula.getElements()) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        FormulaElements elements = formula.getElements();
        while(elements.hasNextElement()) {
            build(elements.next(), builder);
        }



        return builder.toString();
    }


    private void build(FormulaElement element, StringBuilder builder) {
        switch(element.getType()) {
            case FRACTION:
                builder.append("\\frac");
                break;
            case UNKNOWN:
            default:
                builder.append("{");
                builder.append(element.getValue());
                builder.append("}");
                break;
        }
        if(null != element.getElements()) {
            while (element.getElements().hasNextElement()) {
                build(element.getElements().next(), builder);
            }
        }
    }

}
