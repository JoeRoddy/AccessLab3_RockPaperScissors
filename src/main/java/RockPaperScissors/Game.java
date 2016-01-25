package RockPaperScissors;
import java.util.Scanner;

public class Game {
    private int roundsPlayed=0, gamesTied=0, playerGamesWon=0, playerRoundsWon=0;
    private static int totalThrows=0;
    private Scanner input=new Scanner(System.in);
    Player player = new Player();
    ComputerPlayer cp = new ComputerPlayer();

    public Game() {
        matchManager();
    }

    public void matchManager() {
        boolean playing=true;

            Printer.printIntro();
        while (playing){
            roundManager();

            String response = promptToQuit("Enter 'q' or 'Q' to quit.  Enter anything else to continue playing.");
            if(response.equals("q")){playing=false;}
        }
        Printer.printStats(this,player);

    }

    public void roundManager(){
        int playerWinsThisRound=0, cpWinsThisRound=0;
        while (playerWinsThisRound<2&&cpWinsThisRound<2) {
            char gameWinner = throwManager();
            if (gameWinner=='p'){playerWinsThisRound++;}
            else if(gameWinner=='c'){cpWinsThisRound++;}
            Printer.printGameScore(playerWinsThisRound,cpWinsThisRound);
        }
        char w;
        if(playerWinsThisRound>1){w='p';}
        else{w='c';}
        roundsPlayed++;
        Printer.printRoundWinner(w);
        if(w=='p'){playerRoundsWon++;}
    }
    public char throwManager(){ //returns the winner (c or p)
        char userThrow=prompter("Please enter your move for the turn.  Rock (r), Paper (p), or Scissors(s).");
        char cpThrow=cp.throwGenerator(player,this);
        Printer.printResult(userThrow,cpThrow);

        if(userThrow=='r'){player.incrementRockThrows();}
        else if(userThrow=='p'){player.incrementPaperThrows();}
        else{player.incrementScissorThrows();}

        //Determines if player's throw is an L1 or L2 throw, if so, increments it
        char cpPrev = cp.getCpLastThrow();
        char pPrev = player.getLastThrow();
        if (totalThrows>0&&((userThrow=='r'&&cpPrev=='s')||(userThrow=='p'&&cpPrev=='r')||(userThrow=='s'&&cpPrev=='p'))){
            player.incrementLevelOneThrows();}
        if (totalThrows>0&&((userThrow=='r'&&pPrev=='p')||(userThrow=='p'&&pPrev=='s')||(userThrow=='s'&&pPrev=='r'))){
            player.incrementLevelTwoThrows();}

        char winner=determineWinner(userThrow,cpThrow);
        totalThrows++;
        if (winner=='p'){
            playerGamesWon++;
        }
        else if(winner=='t'){gamesTied++;}
        cp.setCpLastThrow(cpThrow);
        player.setLastThrow(userThrow);
        return winner;
    }

    public char determineWinner(char playerThrow, char cpThrow){
        if (playerThrow==cpThrow){return 't';}
        else if (playerThrow=='p'&&cpThrow=='r'){return 'p';}
        else if (cpThrow=='p'&&playerThrow=='r'){return 'c';}
        else if (playerThrow=='s'&&cpThrow=='p'){return 'p';}
        else if (cpThrow=='s'&&playerThrow=='p'){return 'c';}
        else if (playerThrow=='r'&&cpThrow=='s'){return 'p';}
        else if (cpThrow=='r'&&playerThrow=='s'){return 'c';}
        else {
            System.out.println("Incompatible char throw argument in gameObj.determineWinner(). playerThrow: "
                    +playerThrow+" cpThrow: "+cpThrow);
            return '!';}
    }

    char prompter(String message){
        System.out.println(message);
        String userPlay = input.next().toLowerCase();
        while (!userPlay.equals("r")&&!userPlay.equals("p")&&!userPlay.equals("s")){
            System.out.println("Please enter only r, p, or s.");
        }
        return userPlay.charAt(0);
    }
    String promptToQuit(String message){
        System.out.println(message);
        String userPlay = input.next().toLowerCase();
        return userPlay;
    }

    /*
    public static boolean determineIfL1(char thisThrow,char opponentLastThrow){
        //Using if && elif over a long if(x||y) for readablity
        if(thisThrow=='r'){if(opponentLastThrow=='s'){return true;}}
        else if(thisThrow=='p'){if(opponentLastThrow=='r'){return true;}}
        else if(thisThrow=='s'){if(opponentLastThrow=='p'){return true;}}
        return false;

    }

    public static boolean determineIfL2(char thisThrow,char userLastThrow){
        if(thisThrow=='r'){if(userLastThrow=='p'){return true;}}
        else if(thisThrow=='p'){if(userLastThrow=='s'){return true;}}
        else if(thisThrow=='s'){if(userLastThrow=='r'){return true;}}
        return false;
    }
    */
    public static int getTotalThrows() {
        return totalThrows;
    }

    public void setTotalThrows(int totalThrows) {
        this.totalThrows = totalThrows;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }

    public int getPlayerGamesWon() {
        return playerGamesWon;
    }

    public void setPlayerGamesWon(int playerGamesWon) {
        this.playerGamesWon = playerGamesWon;
    }

    public int getPlayerRoundsWon() {
        return playerRoundsWon;
    }

    public void setPlayerRoundsWon(int playerRoundsWon) {
        this.playerRoundsWon = playerRoundsWon;
    }
}
