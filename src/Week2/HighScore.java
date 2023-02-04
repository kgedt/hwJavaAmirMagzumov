package Week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Amount of students: ");
        n = sc.nextInt();
        String name = "-";
        float maxScore = -1;

        while (0 != n && n-- >= 0) {
            System.out.print("Name: ");
            String currentName = sc.next();
            System.out.print("Score: ");
            float currentScore = sc.nextFloat();
            if (currentScore > maxScore) {
                maxScore = currentScore;
                name = currentName;
            }
        }

        System.out.println("Winner is " + name + " with scores " + maxScore);
    }
}
