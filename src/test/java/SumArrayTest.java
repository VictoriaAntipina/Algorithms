import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPath(){

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayEmptyArray(){

        int[] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayHappyPathNegativeNumbers(){

        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testSumArrayHappyPathDiffrentNumbers(){

        int[] array = {0, -7, 500};
        int expectedResult = 493;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testSumArrayHappyPathTwoNegativeNumbers(){

        int[] array = {0, -7, -100};
        int expectedResult = -107;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    public void testSumArrayHappyPathTwoZeroAndNegativeNumber(){

        int[] array = {0, 0, -100};
        int expectedResult = -100;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(7)
    @Test
    public void testSumArrayHappyPathTwoZeroAndPositiveNumber(){

        int[] array = {0, 545, 0};
        int expectedResult = 545;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
