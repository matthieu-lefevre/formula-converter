package com.mlefevre.maths;

import com.mlefevre.maths.converter.LatexConverter;
import com.mlefevre.maths.parser.PmpParser;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaBuilderTest {

    private static FormulaBuilder builder;

    @BeforeClass
    public static void setUp() {
        builder = FormulaBuilder.get()
                .addParser(new PmpParser())
                .addConverter(new LatexConverter());
    }



    @Test
    @Ignore
    public void should_convert_complex_formula() {
        try {
            String inputFormula = "{1/M}{1/N}{sum{k=1}{M}{} sum{i=0}{N}{X(k,i)}}";
            String outputFormula = builder.build(inputFormula);

            assertEquals("\\frac{1}{M}\\frac{1}{N}{\\sum\\limits_{k=1}^M{}{\\sum\\limits_{i=1}^N{X(k,i)}}", outputFormula);

        } catch(Exception e) {
            fail();
        }
    }

    @Test
     public void should_convert_fraction_formula() {
        try {
            String inputFormula = "1/N";
            String outputFormula = builder.build(inputFormula);

            assertEquals("\\frac{1}{N}", outputFormula);

        } catch(Exception e) {
            fail();
        }
    }

    @Test
    public void should_convert_sum_formula() {
        try {
            String inputFormula = "sum{i=0}{N}{i}";
            String outputFormula = builder.build(inputFormula);

            assertEquals("\\sum\\limits {i=0}^N{i}", outputFormula);

        } catch(Exception e) {
            fail();
        }
    }


}
