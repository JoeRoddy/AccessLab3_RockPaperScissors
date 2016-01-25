import RockPaperScissors.ComputerPlayer;
import RockPaperScissors.Game;
import RockPaperScissors.Player;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestComputerPlayer {

    @Test
    public void cpTest(){
        Game testGame=new Game();
        testGame.setTotalThrows(10);
        Player testPlayer = new Player();
        ComputerPlayer testCP = new ComputerPlayer();

        /*
        //Testing .generateLevel1Throw() on all possible outcomes
        testPlayer.setPlayerThrowRates(.4,.2,.2,.3,.3);
        char testThrow = testCP.generateLevel1Throw(testPlayer);
        assertEquals("generateLevel1Throw() failed.",'p',testThrow);

        testPlayer.setPlayerThrowRates(.2,.4,.2,.3,.3);
        testThrow = testCP.generateLevel1Throw(testPlayer);
        assertEquals("generateLevel1Throw() failed.",'s',testThrow);

        testPlayer.setPlayerThrowRates(.2,.2,.4,.3,.3);
        testThrow = testCP.generateLevel1Throw(testPlayer);
        assertEquals("generateLevel1Throw() failed.",'r',testThrow);

        System.out.println("All level 1 throws generated successfully.");


        //Testing .generateLevel2Throw() on all possible outcomes
        testCP.setCpLastThrow('p');
        testThrow = testCP.generateLevel2Throw();
        assertEquals("generateLevel2Throw() failed.",'r',testThrow);

        testCP.setCpLastThrow('s');
        testThrow = testCP.generateLevel2Throw();
        assertEquals("generateLevel2Throw() failed.",'p',testThrow);

        testCP.setCpLastThrow('r');
        testThrow = testCP.generateLevel2Throw();
        assertEquals("generateLevel2Throw() failed.",'s',testThrow);

        System.out.println("All level 2 throws generated successfully.");

        //Testing .generateLevel3Throw() on all possible outcomes
        testPlayer.setLastThrow('r');
        testThrow = testCP.generateLevel3Throw(testPlayer);
        assertEquals("generateLevel3Throw('r') failed.",'r',testThrow);

        testPlayer.setLastThrow('p');
        testThrow = testCP.generateLevel3Throw(testPlayer);
        assertEquals("generateLevel3Throw('p') failed.",'p',testThrow);

        testPlayer.setLastThrow('s');
        testThrow = testCP.generateLevel3Throw(testPlayer);
        assertEquals("generateLevel3Throw('s') failed.",'s',testThrow);

        System.out.println("All level 3 throws generated successfully.");
        */
    }
}
