import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FaceBookLikeSystemTest{


    @Test
    public void thatTheFunctionReturnsTheRightMessageWhenNoLikeIsAvaIlabe(){

    String [] friends = {};

    String expected = FaceBookLikeSystem.textDisplay(friends);
    String actual = "no one likes this";
    
    assertEquals(actual, expected);
    }

    @Test
    public void thatTheFunctionReturnsTheRightMessageWhenWeHaveLikes(){

    String [] friend = {"x0_sad"};
    String [] friends = {"NAmdi", "jrejge"};
    String [] littleFriends = {"Nnnamdi", "jge", "hiergje"};
    String [] goodFriends = {"ieeff", "ddfge", "hiergje", "fhti"};
    String [] greatFriends = {"dess", "xcedd", "hiergje", "esxx", "hiergje", "hiergje"};


    String expected = FaceBookLikeSystem.textDisplay(friend);
    String actual = "x0_sad likes this";
    assertEquals(actual, expected);

    String expecteds = FaceBookLikeSystem.textDisplay(friends);
    String actuals = "NAmdi and jrejge likes this";
    assertEquals(actuals, expecteds);

    String expectedLittleFriends = FaceBookLikeSystem.textDisplay(littleFriends);
    String actualLittleFriends = "Nnnamdi, jge and hiergje likes this";
    assertEquals(actualLittleFriends, expectedLittleFriends);

    String expectedGoodFriends = FaceBookLikeSystem.textDisplay(goodFriends);
    String actualGoodFriends = "ieeff, ddfge and 2 others likes this";
    assertEquals(actualGoodFriends, expectedGoodFriends);

    String expectedGreatFriends = FaceBookLikeSystem.textDisplay(greatFriends);
    String actualGreatFriends = "dess, xcedd and 4 others likes this";
    assertEquals(actualGreatFriends, expectedGreatFriends);
    }



}
