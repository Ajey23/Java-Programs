public class Method {

    public static void main(String[] args)
    {

        calculateScore(true, 2000, 8, 200);

    }
   public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=200;
            System.out.println("Your Final Score : " + finalScore);
            return finalScore;
        }
   return 0;
    }
}
