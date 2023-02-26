package week.first;

import java.util.Scanner;

public class GPACalculator {

    public static String getGPA(int amountOfDisciplines) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[amountOfDisciplines];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextInt();
        }

        int sum = 0;
        double avg;
        String GPA;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        avg = sum/amountOfDisciplines;

            if (avg >= 95)
                GPA = "A";
            else if (avg >= 90)
                GPA = "A-";
            else if (avg >= 85)
                GPA = "B+";
            else if (avg >= 80)
                GPA = "B";
            else if (avg >= 75)
                GPA = "B-";
            else if (avg >= 70)
                GPA = "C+";
            else if (avg >= 65)
                GPA = "C";
            else if (avg >= 60)
                GPA = "C-";
            else if (avg >= 55)
                GPA = "D+";
            else if (avg >= 50)
                GPA = "D";
            else
                GPA = "F";

        return GPA;
    }
}

//
