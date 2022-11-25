public class MethodChallenge {

    public static void main(String[] args){

        int HighScorePosition = CalculateHighScorePosition(1500);
        displayHighScorePosition("Ajay", HighScorePosition);

        HighScorePosition = CalculateHighScorePosition(900);
        displayHighScorePosition("Yash", HighScorePosition);

        HighScorePosition = CalculateHighScorePosition(400);
        displayHighScorePosition("Ronit", HighScorePosition);

        HighScorePosition = CalculateHighScorePosition(50);
        displayHighScorePosition("Ronit", HighScorePosition);

    }
    public static void displayHighScorePosition(String PlayerName, int HighScorePosition) {

        System.out.println(PlayerName + " managed to get into position" + HighScorePosition + " on the high score table.");
    }
    public static int CalculateHighScorePosition(int PlayerScore){

        if(PlayerScore >= 1000) {
            return 1;
        }
        else if(PlayerScore >= 500 && PlayerScore < 1000) {
            return 2;
        }
        else if (PlayerScore >= 100 && PlayerScore < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
