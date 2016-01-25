package RockPaperScissors;
import RockPaperScissors.Roddy.Joe.Array;
import java.util.Random;

public class ComputerPlayer {
    private char cpLastThrow;

    public char throwGenerator(Player player,Game game){
        if (game.getTotalThrows()<4){  //Throws a random move for the first 3 games
            return generateRandomThrow();
        }

        char throwToReturn;
        double[]throwArray=player.getPlayerThrowRates();
        //throwArray: {rockRate,paperRate,scissorsRate,levelOneRate,levelTwoRate}
        Random random=new Random();
        if (random.nextDouble()>=.3){  //70% likely to simply counter the opponent's greatest habit.
            int playerTell = Array.maxValuePosition(throwArray);
            throwToReturn=throwMapper(playerTell,player);
            return throwToReturn;
        }
        else{  //Otherwise, counters the next greatest habit.
            int secondTell = Array.secondHighestValuePosition(throwArray);
            throwToReturn = throwMapper(secondTell,player);
            return throwToReturn;
        }
    }

    public char throwMapper(int tellIndex,Player player){
        if(tellIndex>5) {
            System.out.println("Error @ throwMapper().  Passed array index out of range: " + tellIndex);
        }
        if (tellIndex<3){
            return generateLevel1Throw(player);
        }
        else if (tellIndex==3){
            return generateLevel2Throw();
        }
        else {return generateLevel3Throw(player);}
    }

    public char generateRandomThrow(){
        Random rand=new Random();
        double num = rand.nextDouble();
        if(num<.33){
            return 'r';
        }
        else if(num<.66){
            return 'p';
        }
        else {
            return 's';
        }
    }

    public char generateLevel1Throw(Player player){ //Counters a specific throw type
        double rockRate=player.getRockRate();
        double paperRate=player.getPaperRate();
        double scissorsRate=player.getScissorsRate();
        if (rockRate>=scissorsRate&&rockRate>=paperRate){return 'p';}
        else if(scissorsRate>=rockRate&&scissorsRate>=paperRate){return 'r';}
        else {return 's';}
    }

    public char generateLevel2Throw(){ //Counters Level1 throws
        if (cpLastThrow=='r'){return 's';}
        else if(cpLastThrow=='p'){return 'r';}
        else if(cpLastThrow=='s'){return 'p';}
        else {
            System.out.println("Incompatible throw type @ cpLastThrow used in generateLevel2Throw() -- " +
                    " char cpLastThrow: " + cpLastThrow);
            return '!';
        }
    }

    public char generateLevel3Throw(Player player){ //Counters Level3 throws
        return player.getLastThrow();
    }

    public char getCpLastThrow() {
        return cpLastThrow;
    }

    public void setCpLastThrow(char cpLastThrow) {
        this.cpLastThrow = cpLastThrow;
    }
}
