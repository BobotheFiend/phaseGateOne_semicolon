import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TargetArrayTest{


    @Test
    public void thatTheArrayReturnTwoItemsWhenItSeesANumberThatGivesATArget(){
        int [] input = {8,6,12,4,-2};
        int target = 6;
        int [] expected = TargetArray.numberToAdd(input,target);
        int[] actual = {8,-2};

        assertArrayEquals(actual,expected);

    }


    @Test
    public void thatTheArrayReturnTwoItemsWhenItSeesANumberThatGivesATarget(){
        int [] input = {1,2,5,7,6,8,9};
        int target = 12;
        int [] expected = TargetArray.numberToAdd(input,target);
        int[] actual = {5,7};

        assertArrayEquals(actual,expected);

    }

        @Test
    public void thatTheArrayReturnTwoAfreeDuplicateList(){
        int [] input = {9,5,1,9,4,5,1,7};
        int [] expected = TargetArray.duplicates(input);
        int[] actual = {5,1,9,4,7};

        assertArrayEquals(actual,expected);

    }

            @Test
    public void thatTheTheElementsAreSeperatedByVowelsAndConsonants(){
        String [] input = {"fly","bug","ant"};
        String [][] expected = TargetArray.items(input);
        String[][] actual = {{"bug","ant"},{"fly"}};

        assertEquals(actual,expected);

    }

}
