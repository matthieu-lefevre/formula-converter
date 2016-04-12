package com.mlefevre.maths;

import com.sgcib.fip.common.maths.converter.FormulaConverter;
import com.sgcib.fip.common.maths.domain.Formula;
import com.sgcib.fip.common.maths.parser.FormulaParser;

public class FormulaBuilder {

    private FormulaConverter converter;
    private FormulaParser parser;


    private FormulaBuilder() {

    }


    public static FormulaBuilder get() {
        return new FormulaBuilder();
    }


    public FormulaBuilder addConverter(FormulaConverter converter) {
        this.converter = converter;
        return this;
    }

    public FormulaBuilder addParser(FormulaParser parser) {
        this.parser = parser;
        return this;
    }

    public String build(String input) throws Exception {
        if(null == converter || null == parser) {
            throw new Exception("Wrong configuration");
        }
        Formula formula = parser.parse(input);
        return converter.convert(formula);
    }

}
