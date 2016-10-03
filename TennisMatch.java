package round2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yuriyf on 10/3/2016.
 */
public class TennisMatch
{

    public static void main(String[] args) throws IOException {
        createMatch();
    }


    public static class Judge{

        private String name;

        public String getName() {
           return name;
        }
        public void setName(String name) {
            this.name = name;
        }


    }
    public static class Player{
        private String name;

        private int score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }
        public void setScore(int score) {
            this.score = score;
        }


    }


    public static void createMatch() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Judge judge = new Judge();
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("What's the Judge name?");
        judge.setName(reader.readLine());
        System.out.println("What's the name of Player One?");
        player1.setName(reader.readLine());
        System.out.println("What's the name of Player Two?");
        player2.setName(reader.readLine());

        System.out.println("How many points did Player One get?");
        player1.setScore(Integer.parseInt(reader.readLine()));
        System.out.println("How many points did Player Two get?");
        player2.setScore(Integer.parseInt(reader.readLine()));

        if (player1.score > player2.score)
        {
            System.out.println("The winner is " + player1.getName());
        }
        else if (player1.score < player2.score)
        {
            System.out.println("The winner is " + player2.getName());
        }
        else {
            System.out.println("It's a Tie!");
        }
    }

}
