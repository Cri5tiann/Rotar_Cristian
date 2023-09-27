package homework_nr_6;

public class Date {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31) {
            this.day = day;
        } else {
            System.out.println("Invalid date number!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month number!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2000 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println("Invalid year number!");
        }

    }

    public void displayDate() {
        System.out.println("Today's date is: " +
                this.day + "/" +
                this.month + "/" +
                this.year);
    }
}
