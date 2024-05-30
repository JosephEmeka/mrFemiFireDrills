import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class stringTaskTest {

    @Test
    void testReverseStringSentenceFunction() {
            String result = "world beautiful a still is it";
            assertEquals(result, StringTask.reverseStringSentence("it is still a beautiful world"));
    }

    @Test
    void testLargestNumberInArray(){
        int [] numbers = { 3,9,8,4,5,-3,2};
        assertEquals(9, StringTask.findTheLargestElementInAnArray(numbers));
    }

    @Test
    void testRoundOffNumber(){
        int [] numbers = { 5,2,3,1,2};
       int [] output ={5,2,3,1,3};
        assertArrayEquals(output, StringTask.roundOffNumber(numbers));
        int[] input2 = {2,4,0,9, 9};
        int[] output2 ={2,4,1,0,0};
        assertArrayEquals(output2, StringTask.roundOffNumber(input2));
    }

    }