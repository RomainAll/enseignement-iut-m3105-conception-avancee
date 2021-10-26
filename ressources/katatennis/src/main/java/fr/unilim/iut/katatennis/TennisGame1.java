package fr.unilim.iut.katatennis;


public class TennisGame1 implements TennisGame {

    private int player1Point = 0;
    private int player2Point = 0;
    private String player1Name;
    private String player2Name;
    private String[] verbalScore={"Love","Fifteen","Thirty","Forty"};

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name) )
            player1Point += 1;
        else
            player2Point += 1;
    }

    public String getScore() {
        if (player1Point == player2Point) return getScoreForEquality();
        if (player1Point >=4 || player2Point >=4) return getScoreForAdvantageAndEndOfGame();
        return getStandardScoreAsBeginninigOfGame();
    }

    private String getStandardScoreAsBeginninigOfGame() {
        return verbalScore[player1Point] +"-"+verbalScore[player2Point];
    }

    private String getScoreForAdvantageAndEndOfGame() {
        String score;
        int minusResult = player1Point - player2Point;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String getScoreForEquality() {
        if(player1Point<=2)
            return verbalScore[player1Point]+"-All";
        else
            return "Deuce";
    }
}