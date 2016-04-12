package com.mlefevre.maths.parser;

import com.sgcib.fip.common.maths.domain.Formula;
import com.sgcib.fip.common.maths.domain.FormulaElement;
import com.sgcib.fip.common.maths.domain.FormulaElements;
import com.sgcib.fip.common.maths.domain.enumeration.FormulaElementType;

public class PmpParser implements FormulaParser {

    public Formula parse(String chain) {
        Formula formula = new Formula();
        if(null == chain) {
            return formula;
        }

        FormulaElements elements = new FormulaElements();

        FormulaElement element = new FormulaElement();


        char[] characters = chain.toCharArray();

        StringBuffer buffer = new StringBuffer();
        for(char character : characters) {
            if('{' == character) {
                if("sum".equals(buffer.toString())) {
                    element.setType(FormulaElementType.SUM);
                }

            } else if('/' == character) {
                element.setType(FormulaElementType.FRACTION);

                FormulaElement start = new FormulaElement();
                start.setValue(buffer.toString());
                element.addElement(start);
                buffer = new StringBuffer();
            } else {
                buffer.append(character);
            }
        }

        FormulaElement end = new FormulaElement();
        end.setValue(buffer.toString());
        element.addElement(end);

        elements.addElement(element);
        formula.setElements(elements);
        return formula;
    }

}
