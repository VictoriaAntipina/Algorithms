import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualHappyPathEqualsNumbers(){

        int nun1 = 89;
        int nun2 = 89;
        int expectedResult = 0;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithms(nun1, nun2);

        Assertions.assertEquals(expectedResult,actualResult);
    }



    @Test
    public void testAreNumbersEqualHappyPathNum1LessNum2(){

        int nun1 = -89;
        int nun2 = 89;
        int expectedResult = -1;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithms(nun1, nun2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathNum1BiggerNum2(){

        int nun1 = 89;
        int nun2 = -89;
        int expectedResult = 1;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithms(nun1, nun2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathZeroBoth(){

        int nun1 = 0;
        int nun2 = 0;
        int expectedResult = 0;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.AreNumbersEqualAlgorithms(nun1, nun2);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

