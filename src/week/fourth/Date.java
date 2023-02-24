package week.fourth;

public class Date {
    private final short[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day < 1 || day > monthDays[month - 1] || year < 0) {
            System.out.println("Invalid date");
            return;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date nextDay() {
        int nextD = day;
        int nextM = month;
        int nextY = year;
        if (nextD + 1 > monthDays[month - 1]) {
            if (nextM + 1 > 12)
                return new Date(1, 1, ++nextY);
            return new Date(1, ++nextM, nextY);
        }
        return new Date(++nextD, nextM, nextY);
    }

    public String toString() {
        return String.format("%02d", this.day) + '/' + String.format("%02d", this.month) + '/' + String.format("%04d", this.year);
    }
}
