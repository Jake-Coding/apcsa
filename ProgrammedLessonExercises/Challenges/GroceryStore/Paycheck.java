import java.util.*;
public class Paycheck {
    private double wage;
    final double minWage = 7.25;
    private String time;
    private boolean isErroneous = false;
    private double hours;

    public Paycheck(double wage, String date, double hours) {
        this.wage = wage < minWage ? minWage : wage;
        this.time = date;
        this.hours = hours;
        calculate();
    }

    private double calculate(){
        if (hours > 100) {
            isErroneous = true;
            return 0;
        }
        else {
            double total = hours * wage;
            if (total > 1500) {
                isErroneous = true;
                return 0;
            }
            return total;
        }

    }

    public boolean isError() {
        return isErroneous;
    }
}