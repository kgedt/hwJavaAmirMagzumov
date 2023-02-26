package week.fivs;

public class Date {
    private int day;
    private int month;
    private int year;


    private final String invalidMessage = "Invalid parameters. Was set to the default value = 0";
    public Date(int day, int month, int year) {
        if (day < 1 || day > 31) {
            this.day = 0;
            System.out.println(invalidMessage);
        } else {
            this.day = day;
        }

        if (month < 1 || month > 12) {
            this.month = 0;
            System.out.println(invalidMessage);
        } else {
            this.month = month;
        }

        if (year < 1900 || year > 9999) {
            this.year = 0;
            System.out.println(invalidMessage);
        } else {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            this.day = 0;
            System.out.println(invalidMessage);
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = 0;
            System.out.println(invalidMessage);
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 9999) {
            this.year = 0;
            System.out.println(invalidMessage);
        } else {
            this.year = year;
        }
    }

    public void setDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            this.day = 0;
            System.out.println(invalidMessage);
        } else {
            this.day = day;
        }

        if (month < 1 || month > 12) {
            this.month = 0;
            System.out.println(invalidMessage);
        } else {
            this.month = month;
        }

        if (year < 1900 || year > 9999) {
            this.year = 0;
            System.out.println(invalidMessage);
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", getDay(), getMonth(), getYear());
    }
}
