import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber(){

        int num = 555;
        boolean expectedResult = true;

        IsPositiveNumber na = new IsPositiveNumber();
        boolean actualResult = na.IsPositiveNumber(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathNegativeNumber(){

        int num = -555;
        boolean expectedResult = false;

        IsPositiveNumber na = new IsPositiveNumber();
        boolean actualResult = na.IsPositiveNumber(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathZero(){

        int num = 0;
        boolean expectedResult = true;

        IsPositiveNumber na = new IsPositiveNumber();
        boolean actualResult = na.IsPositiveNumber(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
