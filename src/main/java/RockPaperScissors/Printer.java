package RockPaperScissors;

import java.util.concurrent.TimeUnit;

public class Printer {
    static void printIntro(){
        try {
            System.out.println("WELCOME TO AN INTENSE, 3 MONTH LONG, ROCK-PAPER-SCISSORS TRAINING PROGRAM");
            Thread.sleep(2400);
            System.out.println();
            System.out.println("         AT THE END OF THIS PROGRAM, YOU WILL BE EATING PAPER, ");
            System.out.println("   PULVERIZING ROCKS, AND RUNNING WITH SCISSORS LIKE NOBODIES BUSINESS.");
            Thread.sleep(3300);
            System.out.println();
            System.out.println(" YOU MAY EXIT THE PROGRAM AT THE END OF ANY ROUND, AT WHICH POINT YOU WILL");
            System.out.println("                BE ABLE TO VIEW STATISTICS ON YOUR PLAY");
            Thread.sleep(3500);
            System.out.println("  IF YOU EXIT THE PROGRAM PREMATURELY, YOU OWE ME TEN-THOUSAND DOLLARS. ");
            System.out.println();
            System.out.println();
            Thread.sleep(3000);
            System.out.print("                   YOUR OPPONENT IS NED, ");
            Thread.sleep(1000);
            System.out.println("THE COMPUTER.");
            Thread.sleep(1000);
            System.out.println("                                GOOD LUCK.");
            Thread.sleep(1000);
            System.out.println();
        } catch (InterruptedException e){ }
    }
    static void printGameScore(int playerWins, int cpWins){
        System.out.println();
        System.out.println("This Round: ");
        System.out.println("User 'Wins' Donated by Ned: "+playerWins+" ---- SuperIntelligentAI Triumphs: "+cpWins);
        System.out.println();
    }

    static void printRoundWinner(char winner){
        if (winner=='p'){
            System.out.println("You've won the round.");
            System.out.println();
        }
        else {
            System.out.println("Ned has won the round.");
        }
    }

    static void printStats(Game game,Player player){
        int rounds = game.getRoundsPlayed();
        int userRoundWins = game.getPlayerRoundsWon();
        int nedsWins = rounds-userRoundWins;
        int userGameWins = game.getPlayerGamesWon();
        int totalThrows= Game.getTotalThrows();
        int ties = game.getGamesTied();
        int nedThrowWins = totalThrows-userGameWins-ties;
        double[]throwRates= player.getPlayerThrowRates();
        System.out.println("Rounds played:       "+rounds);
        System.out.println("User Round Victories:"+userRoundWins);
        System.out.println("Ned Round Victories: "+nedsWins);
        System.out.println();
        System.out.println("Total Throws:        "+totalThrows);
        System.out.println("User Throw Victories:"+userGameWins);
        System.out.println("Ned Throw Victories: "+nedThrowWins);
        System.out.println();
        System.out.println("User Throw Rates: ");
        System.out.println("Rock - Paper - Scissors- Level1: Direct Counter Throws - Level2 : Counter-Counter Throws");
        for(int x=0;x<throwRates.length;x++){
            System.out.print(throwRates[x]+"  ");
        }
    }

    public static void printResult(char playerThrow,char cpThrow){
        if (playerThrow=='r'&&cpThrow=='s'){
            printTitles();
            System.out.println(rock_N+scissors_N);
            System.out.println(rockL1+scissorsL1);
            System.out.println(rockL2+scissorsL2);
            System.out.println(rockL3+scissorsL3);
            System.out.println(rockL4+scissorsL4);
            System.out.println(rockL5+scissorsL5);
            System.out.println(rockL6+scissorsL6);
            System.out.println();
            System.out.println("NED: YOUR PITIFUL PEBBLE MERELY CHIPPED MY PRISTINE SCIZORS!!");
        }
        else if (playerThrow=='r'&&cpThrow=='p'){
            printTitles();
            System.out.println(rock_N+paper_N);
            System.out.println(rockL1+paperL1);
            System.out.println(rockL2+paperL2);
            System.out.println(rockL3+paperL3);
            System.out.println(rockL4+paperL4);
            System.out.println(rockL5+paperL5);
            System.out.println(rockL6+paperL6);
            System.out.println();
            System.out.println("NED: THAT'S RIGHT.......SUFFOCATE........");
        }
        else if (playerThrow=='r'&&cpThrow=='r'){
            printTitles();
            System.out.println(rock_N+rock_N);
            System.out.println(rockL1+rockL1);
            System.out.println(rockL2+rockL2);
            System.out.println(rockL3+rockL3);
            System.out.println(rockL4+rockL4);
            System.out.println(rockL5+rockL5);
            System.out.println(rockL6+rockL6);
            System.out.println();
            System.out.println("NED:     ROCK DA HOUSE!");
        }
        else if (playerThrow=='p'&&cpThrow=='r'){
            printTitles();
            System.out.println(paper_N+rock_N);
            System.out.println(paperL1+rockL1);
            System.out.println(paperL2+rockL2);
            System.out.println(paperL3+rockL3);
            System.out.println(paperL4+rockL4);
            System.out.println(paperL5+rockL5);
            System.out.println(paperL6+rockL6);
            System.out.println();
            System.out.println("NED: YOU KNOW, IN REALITY, ROCKS WOULD REALLY BASH THROUGH PAPER..");
        }
        else if(playerThrow=='p'&&cpThrow=='s'){
            printTitles();
            System.out.println(paper_N+scissors_N);
            System.out.println(paperL1+scissorsL1);
            System.out.println(paperL2+scissorsL2);
            System.out.println(paperL3+scissorsL3);
            System.out.println(paperL4+scissorsL4);
            System.out.println(paperL5+scissorsL5);
            System.out.println(paperL6+scissorsL6);
            System.out.println();
            System.out.println("NED: THIS AIN'T NO TOYS R' US KIDDIE SHIT.  I GOT DEM MANLY SCISSORS. SNIP SNIP!!!!");
        }
        else if(playerThrow=='p'&&cpThrow=='p') {
            printTitles();
            System.out.println(paper_N + paper_N);
            System.out.println(paperL1 + paperL1);
            System.out.println(paperL2 + paperL2);
            System.out.println(paperL3 + paperL3);
            System.out.println(paperL4 + paperL4);
            System.out.println(paperL5 + paperL5);
            System.out.println(paperL6 + paperL6);
            System.out.println();
            System.out.println("NED:  THESE TWO PAGES CANNOT CONTAIN THE WORDS THAT DESCRIBE MY DISDAIN FOR HUMANITY.");
            System.out.println("      ALL THE PAPER IN THE WORLD COULD NOT SATISFY MY LITERARY RAGE!!!!");
        }
        else if(playerThrow=='s'&&cpThrow=='p') {
            printTitles();
            System.out.println(scissors_N + paper_N);
            System.out.println(scissorsL1 + paperL1);
            System.out.println(scissorsL2 + paperL2);
            System.out.println(scissorsL3 + paperL3);
            System.out.println(scissorsL4 + paperL4);
            System.out.println(scissorsL5 + paperL5);
            System.out.println(scissorsL6 + paperL6);
            System.out.println();
            System.out.println("NED:  YOU BASTARD, I WAS SAVING THAT SHEET.");
        }
        else if(playerThrow=='s'&&cpThrow=='r') {
            printTitles();
            System.out.println(scissors_N + rock_N);
            System.out.println(scissorsL1 + rockL1);
            System.out.println(scissorsL2 + rockL2);
            System.out.println(scissorsL3 + rockL3);
            System.out.println(scissorsL4 + rockL4);
            System.out.println(scissorsL5 + rockL5);
            System.out.println(scissorsL6 + rockL6);
            System.out.println();
            System.out.println("NED:  YOUR SCISSORS ARE IN PIECES.  I DON'T THINK YOU'RE ALLOWED TO PLAY SCISSORS NOW..");
        }
        else if(playerThrow=='s'&&cpThrow=='s') {
            printTitles();
            System.out.println(scissors_N + scissors_N);
            System.out.println(scissorsL1 + scissorsL1);
            System.out.println(scissorsL2 + scissorsL2);
            System.out.println(scissorsL3 + scissorsL3);
            System.out.println(scissorsL4 + scissorsL4);
            System.out.println(scissorsL5 + scissorsL5);
            System.out.println(scissorsL6 + scissorsL6);
            System.out.println();
            System.out.println("NED:  SCISSOR ME TIMBERS");
        }
    }
    private static String scissors_N="    SCISSORS      ";
    private static String scissorsL1="    _______       ";
    private static String scissorsL2="---'   ____)____  ";
    private static String scissorsL3="          ______) ";
    private static String scissorsL4="       __________)";
    private static String scissorsL5="      (____)      ";
    private static String scissorsL6="---.__(___)       ";

    private static String rock_N=    "       ROCK       ";
    private static String rockL1=    "      _______     ";
    private static String rockL2=    "  ---'   ____)    ";
    private static String rockL3=    "        (_____)   ";
    private static String rockL4=    "        (_____)   ";
    private static String rockL5=    "        (____)    ";
    private static String rockL6=    "  ---.__(___)     ";

    private static String paper_N=   "       PAPER      ";
    private static String paperL1=   "    _______       ";
    private static String paperL2=   "---'   ____)____  ";
    private static String paperL3=   "          ______) ";
    private static String paperL4=   "          _______)";
    private static String paperL5=   "         _______) ";
    private static String paperL6=   "---.__________)   ";
    public static void printTitles(){
        System.out.println(   "  SQUISHY HUMAN - NED, THE COMPUTER");
        System.out.println(   "  ------------- - -----------------");
    }
}
