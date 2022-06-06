import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices odd = new OddIndices();
        int[] actualResult = odd.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddIndicesEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        OddIndices odd = new OddIndices();
        int[] actualResult = odd.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddIndicesNegativeNumber() {

        int[] array = {-45, -590, -234, -985, -12, -68};
        int[] expectedResult = {-590, -985, -68};

        OddIndices odd = new OddIndices();
        int[] actualResult = odd.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddIndicesPositiveNumber() {

        int[] array = {45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices odd = new OddIndices();
        int[] actualResult = odd.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }



}
