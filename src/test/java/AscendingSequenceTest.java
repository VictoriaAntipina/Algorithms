import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as; //удалила создание объекта с последнего теста testAscendingSequenceStepIsZero так как
    //используется анотация @BeforeEach

    @BeforeEach
    void SetUp() {
        as = new AscendingSequence();
    }

    @Order(1)
    @RepeatedTest(50)
    //@Test
    public void testAscendingSequenceHappyPathPosiyiveNumbers() {
        // 0,1,2,3,4,5

        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0,1,2,3,4,5};

        AscendingSequence as = new AscendingSequence ();// так как static не используем, то вызвать метод от класса
        //невозможно, а только от объекта класса,поэтому мы создаем new объект "as"и вызывать будем от него
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
        }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers() {
        // 0,1,2,3,4,5

        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10,-9,-8,-7};

        AscendingSequence as = new AscendingSequence ();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumbers() {
        // 0,1,2,3,4,5

        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5,-4,-3,-2,-1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence ();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        // 0,1,2,3,4,5

        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence ();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceHappyStartLargerThenEnd() {
        // 0,1,2,3,4,5

        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = { };

        AscendingSequence as = new AscendingSequence ();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeTest() {
        // 0,1,2,3,4,5

        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = { };

        AscendingSequence as = new AscendingSequence ();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZero() {
        // 0,1,2,3,4,5

        int start = 0;
        int end = 5;
        int step = 0;
        int[] expectedResult = { };

        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}
