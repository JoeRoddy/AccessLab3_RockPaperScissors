package RockPaperScissors;

public class Player {
    private int rockThrows=0, paperThrows=0, scissorThrows=0, levelOneThrows=0, levelTwoThrows=0;
    private char lastThrow;

    /*Level Explanations
    * Level One : A throw which counters the opponent's prior throw.
    * Level Two : A throw which counters the counter of your own previous throw (The counter to Level1 throws).
    * L2 ex: We just threw scissors.  The L2 throw would be paper, since it beats the counter of rock.
    *
    * Level Three : The counter to L2 throws. You simply match your opponent's previous throw. */

    public double[] getPlayerThrowRates() {
        double[]playerThrowRates={getRockRate(),getPaperRate(),getScissorsRate(),getLevelOneRate(),getLevelTwoRate()};
        return playerThrowRates;
    }
    public int getRockThrows() {
        return rockThrows;
    }

    public void incrementRockThrows() {
        this.rockThrows++;
    }

    public int getPaperThrows() {
        return paperThrows;
    }

    public void incrementPaperThrows() {
        this.paperThrows++;
    }

    public int getScissorThrows() {
        return scissorThrows;
    }

    public void incrementScissorThrows() {
        this.scissorThrows++;
    }

    public int getLevelOneThrows() {
        return levelOneThrows;
    }

    public void incrementLevelOneThrows() {
        this.levelOneThrows++;
    }

    public int getLevelTwoThrows() {
        return levelTwoThrows;
    }

    public void incrementLevelTwoThrows() {
        this.levelTwoThrows++;
    }

    public double getRockRate() {
        return (float)rockThrows/Game.getTotalThrows();
    }

    public double getPaperRate() {
        return (float)paperThrows/Game.getTotalThrows();
    }

    public double getScissorsRate() {
        return (float)scissorThrows/Game.getTotalThrows();
    }

    public double getLevelOneRate() {
        return (float)levelOneThrows/(Game.getTotalThrows()-1);
    }

    public double getLevelTwoRate() {
        return (float)levelTwoThrows/(Game.getTotalThrows()-1);
    }

    public char getLastThrow() {
        return lastThrow;
    }

    public void setLastThrow(char lastThrow) {
        this.lastThrow = lastThrow;
    }

    /*public void setPlayerThrowRates(double rock,double paper,double scissors,double l1, double l2){
        playerThrowRates[0]=rock; playerThrowRates[1]=paper; playerThrowRates[2]=scissors;
        playerThrowRates[3]=l1; playerThrowRates[4]=l2;
    }*/

}
