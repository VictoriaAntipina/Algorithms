import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveValue() {

        long num = 1;
        String expectedResult = "Odd";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathPositiveEvenValue () {

        long num = 2;
        String expectedResult = "Even";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNegativeValue () {

        long num = -1;
        String expectedResult = "Odd";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathNegativeEvenValue () {

        long num = -2;
        String expectedResult = "Even";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathZeroValue () {

        long num = 0;
        String expectedResult = "Even";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddEvenUndefinedNegativeValue () {

        long num = -2147483649L;
        String expectedResult = "Undefined";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddEvenUndefinedPositiveValue () {

        long num = 2147483649L;
        String expectedResult = "Undefined";

        OddEven od = new OddEven();
        String actualResult = od.OddEvenAlgorithm(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}


