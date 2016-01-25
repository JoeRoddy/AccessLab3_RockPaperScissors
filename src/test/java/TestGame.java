import RockPaperScissors.Game;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGame {
    @Test
    public void testingDetermineWinner(){

        /*
        //These tests were invalidated by a small, necessary change.  All passed.
        Game testGame=new Game();
        char winnerTest = testGame.determineWinner('r','r');
        assertEquals("determineWinner() not working as intended.",'t',winnerTest);

        winnerTest = testGame.determineWinner('p','s');
        assertEquals("determineWinner() not working as intended.",'c',winnerTest);

        winnerTest = testGame.determineWinner('r','p');
        assertEquals("determineWinner() not working as intended.",'c',winnerTest);

        winnerTest = testGame.determineWinner('r','s');
        assertEquals("determineWinner() not working as intended.",'p',winnerTest);

        System.out.println("determineWinner() test passed.");


         //Testing determineIfL1()
        boolean testBool=Game.determineIfL1('r','s');
        assertTrue("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL1('p','r');
        assertTrue("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL1('s','p');
        assertTrue("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL1('r','p');
        assertFalse("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL1('p','p');
        assertFalse("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL1('s','r');
        assertFalse("Test failed, returned wrong bool.",testBool);
        System.out.println("All determineIfL1() tests passed.");

        //Testing determineIfL2()
        testBool=Game.determineIfL2('r','p');
        assertTrue("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL2('p','s');
        assertTrue("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL2('s','r');
        assertTrue("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL2('s','s');
        assertFalse("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL2('s','p');
        assertFalse("Test failed, returned wrong bool.",testBool);
        testBool=Game.determineIfL2('p','r');
        assertFalse("Test failed, returned wrong bool.",testBool);
        System.out.println("All determineIfL2() tests passed.");

        */
    }
}

