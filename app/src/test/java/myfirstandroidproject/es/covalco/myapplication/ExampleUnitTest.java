package myfirstandroidproject.es.covalco.myapplication;

import org.junit.Test;

import static junit.framework.Assert.*;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        ICalculator iCalculator = new Calculator(2,2);

        assertEquals(4, iCalculator.add());
    }

    @Test
    public void multiply_isCorrect() throws Exception {
        ICalculator iCalculator = new Calculator(2,2);

        assertEquals(4, iCalculator.multiply());
    }

    @Test
    public void divide_isCorrect() throws Exception {
        ICalculator iCalculator = new Calculator(2,2);

        assertEquals(1, iCalculator.divide());
    }

    @Test
    public void substract_isCorrect() throws Exception {
        ICalculator iCalculator = new Calculator(2,2);

        assertEquals(0, iCalculator.substract());
    }
}

