package com.mlefevre.maths.parser;

import com.mlefevre.maths.domain.Formula;

public interface FormulaParser {

    /**
     * Convert the given chain into a formula
     *
     * @param chain
     * @return the parsed formula
     */
    Formula parse(String chain);

}
