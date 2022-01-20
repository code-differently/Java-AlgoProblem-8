package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem8Test {

    @Test
    public void testOne(){
        AlgoProblem8 algoProblem8 = new AlgoProblem8();

        double expected = 2;
        double actual = algoProblem8.smileFrownRatio("(::P(::(");

        Assertions.assertEquals(expected,actual, .001);
    }

    @Test
    public void testTwo(){
        AlgoProblem8 algoProblem8 = new AlgoProblem8();

        double expected = 0;
        double actual = algoProblem8.smileFrownRatio("|::P:P:P:P):");

        Assertions.assertEquals(expected,actual, .001);
    }

    @Test
    public void testThree(){
        AlgoProblem8 algoProblem8 = new AlgoProblem8();

        double expected = .83333;
        double actual = algoProblem8.smileFrownRatio(":):D:D:):PO:|:)::P:P:D:):P):):O:O:O:|:O::P:DO::):PO:|:|:):)::P:))::):D|::P:P):");

        Assertions.assertEquals(expected,actual, .001);
    }



}
