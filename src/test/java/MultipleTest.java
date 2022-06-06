import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultipleTest {

    @Test
    public void testMultipleHappyPathMultipleBoth(){

        int m = 15;
        String expectedResult = "Good Number";

        Multiple mu = new Multiple();
        String actualResult = mu.MultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleHappyPathMultipleThreeOnly(){

        int m = 3;
        String expectedResult = "Bad Number";

        Multiple mu = new Multiple();
        String actualResult = mu.MultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleHappyPathMultipleFiveOnly(){

        int m = 25;
        String expectedResult = "Poor Number";

        Multiple mu = new Multiple();
        String actualResult = mu.MultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleHappyPathNoSatisfy(){

        int m = -1;
        String expectedResult = "-1";

        Multiple mu = new Multiple();
        String actualResult = mu.MultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleZero(){

        int m = 0;
        String expectedResult = "Good Number";

        Multiple mu = new Multiple();
        String actualResult = mu.MultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



