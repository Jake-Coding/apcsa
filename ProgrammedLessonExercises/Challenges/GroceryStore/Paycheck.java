import java.util.*;
public class Paycheck {
    private static final double fedTax = 0.15;

    private String time;
    private boolean isErroneous = false;
    private Employee employee;
    private double total;

    public Paycheck(Employee employee, String date) {
        this.time = date;
        this.employee = employee;
        calculate();
    }
    public Paycheck(Employee employee) {
        this(employee, "NO DATE");
    }

    private void calculate(){
        if (employee.getCurrHours() > 100) {
            isErroneous = true;
            total = 0;
        }
        else {
            double beforeTax= employee.getCurrHours() * employee.getWage();
            if (beforeTax > 1500) {
                isErroneous = true;
                total = 0;
            }
            else { total = beforeTax * (1-fedTax);}
        }

    }

    public boolean isError() {
        return isErroneous;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String toString() {
        return employee.getName() + " was paid " + total + " on " + time;
    }
}