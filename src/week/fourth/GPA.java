package week.fourth;
import java.util.ArrayList;

public class GPA {
    private ArrayList<String> disciplines = new ArrayList<>();
    private ArrayList<Integer> credits = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public void addDiscipline(String disciplineName, int credit, int grade) {
        if (grade > 100 || grade < 0) {
            System.out.println("Invalid grade (0-100)");
            return;
        }
        disciplines.add(disciplineName);
        credits.add(credit);
        grades.add(grade);
    }

    public double getGPA() {
        double GPA = 0.0;
        int sumCredits = 0;
        int cnt = 0;
        for (Integer grade : grades) {
            sumCredits += credits.get(cnt);
                if (grade >= 95)
                    GPA += 4.0 * credits.get(cnt++);
                else if (grade >= 90)
                    GPA += 3.67 * credits.get(cnt++);
                else if (grade >= 85)
                    GPA += 3.33 * credits.get(cnt++);
                else if (grade >= 80)
                    GPA += 3.0 * credits.get(cnt++);
                else if (grade >= 75)
                    GPA += 2.67 * credits.get(cnt++);
                else if (grade >= 70)
                    GPA += 2.33 * credits.get(cnt++);
                else if (grade >= 65)
                    GPA += 2.0 * credits.get(cnt++);
                else if (grade >= 60)
                    GPA += 1.67 * credits.get(cnt++);
                else if (grade >= 55)
                    GPA += 1.33 * credits.get(cnt++);
                else if (grade >= 50)
                    GPA += 1.0 * credits.get(cnt++);
                else
                    GPA += 0.0 * credits.get(cnt++);
        }
        GPA = GPA / sumCredits;
        return GPA;
    }

    public String getGrades() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < disciplines.size() - 1; i++) {
            result.append(disciplines.get(i)).append(" : ").append(grades.get(i).toString()).append(",\n");
        }
        result.append(disciplines.get(disciplines.size() - 1)).append(" : ").
                append(grades.get(disciplines.size() - 1).toString()).append("]");
        return result.toString();
    }
}
