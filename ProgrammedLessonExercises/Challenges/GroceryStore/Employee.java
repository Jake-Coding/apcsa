
public class Employee {
    final static double minwage = 7.25;

    private String name;
    private String position;
    private double wage;
    private static int currId = 1;
    private double currHours;
    private double overallHours;
    private int id;

    public Employee(String name, String position, double wage, double currHours, double overallHours) {
        this.name = name;
        this.position = position;
        this.wage  = wage < minwage ? minwage : wage;
        this.currHours = currHours;
        this.overallHours = overallHours;
        id = currId;
        currId++;
    }

    public Employee(String name, String position, double wage) {
        this(name, position, wage, 0, 0);
    }

    public Employee(String name, String position) {
        this(name, position, minwage, 0, 0);
    }

    public String getName() {return name;}
    public String getPos() {return position;}
    public double getWage() {return wage;}
    public double getCurrHours() {return currHours;}
    public double getTotalHours() {return overallHours;}

    public void setWage(double wage) {this.wage = wage;}
    

    public void work(double hours) {
        overallHours += hours;
        currHours += hours;
    }

    public Paycheck getPaid(String date) throws RuntimeException {
        Paycheck paycheck = new Paycheck(this, date);
        if (paycheck.isError()) {throw new RuntimeException("Erroneous paycheck");}
        currHours = 0;
        return paycheck;
    }

    public String toString() {
        return name + " works as a " + position + " and gets paid " + wage + "/hour. They have worked for " + overallHours + " in total and " + currHours + " since their last paycheck.";
    }
}