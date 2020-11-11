public class Date {
    int year;
    int month;
    int day;

    public Date() {
        year = 0;
        month = 1;
        day = 1;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}