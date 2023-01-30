package Week1;

public class GPACalculator {

    public static double getGPA(int amountOfDisciplines, String[] marks, int[] credits) {
        double GPA = 0.0;
        if (amountOfDisciplines != marks.length && amountOfDisciplines != credits.length) {
            System.out.println("Different amount of disciplines and marks, credits");
            return -1;
        }

        int sumCredits = 0;
        int cnt = 0;
        for (String mark : marks) {
            sumCredits += credits[cnt];
            switch (mark) {
                case "A":
                    GPA += 4.0 * credits[cnt++];
                    break;
                case "A-":
                    GPA += 3.67 * credits[cnt++];
                    break;
                case "B+":
                    GPA += 3.33 * credits[cnt++];
                    break;
                case "B":
                    GPA += 3.0 * credits[cnt++];
                    break;
                case "B-":
                    GPA += 2.67 * credits[cnt++];
                    break;
                case "C+":
                    GPA += 2.33 * credits[cnt++];
                    break;
                case "C":
                    GPA += 2.0 * credits[cnt++];
                    break;
                case "C-":
                    GPA += 1.67 * credits[cnt++];
                    break;
                case "D+":
                    GPA += 1.33 * credits[cnt++];
                    break;
                case "D":
                    GPA += 1.0 * credits[cnt++];
                    break;
                case "F":
                    GPA += 0.0 * credits[cnt++];
                    break;
                default:
                    System.out.println("undefined mark");
            }
        }
        GPA = GPA / sumCredits;
        return GPA;
    }
}
