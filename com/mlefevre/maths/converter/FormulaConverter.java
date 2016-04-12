package com.mlefevre.maths.converter;

import com.mlefevre.maths.domain.Formula;

public interface FormulaConverter {

    /**
     * Convert the given formula into a string
     *
     * @param formula
     * @return the converted formula
     */
    String convert(Formula formula);

}
