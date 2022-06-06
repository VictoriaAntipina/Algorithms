import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValueHappyPathPositiveValue(){

        int num1 = 3333;
        int num2 = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueHappyPathNegativeValue(){

        int num1 = -3333;
        int num2 = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueZeroEquilValue(){

        int num1 = 0;
        int num2 = 0;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueEquilPositiveValue(){

        int num1 = 256660;
        int num2 = 256660;
        int expectedResult = 256660;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueEquilNegativeValue(){

        int num1 = -256660;
        int num2 = -256660;
        int expectedResult = -256660;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testBiggerValueZeroAndNegativeValue(){

        int num1 = 0;
        int num2 = -256660;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(num1, num2);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
