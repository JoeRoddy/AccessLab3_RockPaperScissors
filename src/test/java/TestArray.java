import RockPaperScissors.Game;
import RockPaperScissors.Roddy.Joe.Array;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestArray {
    @Test
    public void testingArrayMethods(){
        double[]testArray={.2,.5,.2,.6,.1};
        int testThrow = Array.maxValuePosition(testArray);
        int secondThrow = Array.secondHighestValuePosition(testArray);

        assertEquals("Error: maxValuePosition() failed.",3,testThrow);
        System.out.println("maxValuePosition() working as intended.");

        assertEquals("Error: secondHighestValuePosition() failed.",1,secondThrow);
        System.out.println("secondHighestValuePosition() working as intended.");

    }
}

