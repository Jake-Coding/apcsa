//Class Employee: subclass of Person

public class Employee extends Person {

    private double payRate;    

    private double hoursWorked;

    private String department;

   

    public final int HOURS = 40;

    public final double OVERTIME = 1.5;

   

     //default constructor

     public Employee() {
        super();
        payRate = 0;
        hoursWorked = 0;
        department = "";
     }

     public Employee(String firstname, String lastname, String dept, double payrate, double hoursworked) {
         super(firstname, lastname);
         department = dept;
         payRate = payrate;
         hoursWorked = hoursworked;
     }

     public Employee(String firstname, String lastname) {
         this(firstname, lastname, "", 0, 0);
     }

     public Employee(String firstname, String lastname, String dept, double payrate) {
         this(firstname, lastname, dept, payrate, 0);
     }
    

    

     public String toString() {

         //should return a String like this:

         //The wages for xxxx from the xxxx department are: $xxxxx.xx"
        return "The wages for " + super.toString() + "from the " + department + " department are " + calculatePay();


     }

 

     public void print() {

       //Should print output like this (same line):

       //The employee xxxx from the xxxx department worked xx hours

       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx

        String s = "The employee " + super.toString();
        s += " worked " + hoursWorked + " hours with a pay rate of " + payRate;
        s += ". The wages for this employee are " + calculatePay();
        System.out.println(s);
     }

 

    

     public double calculatePay() {

        //Method to calculate and return the wages

        //handle both regular and overtime pay
        if (hoursWorked <= HOURS) {
            return (double) hoursWorked * payRate;
        }
        return (double) HOURS * payRate + ((double) (hoursWorked-HOURS) * payRate * OVERTIME);

     }

 

 

     public void setAll(String first, String last, double rate, double hours, String dep){

        super.setfl(first, last);
        payRate = rate;
        hoursWorked = hours;
        department = dep;

     }

 

     public double getPayRate() {

         return payRate;

     }

 

    

     public double getHoursWorked() {

         return hoursWorked;

     }

    

    

     public String getDepartment() {

         return department;

     }

    

     public boolean equals(Object o) {

       if (o instanceof Employee) {
        Employee o_c = (Employee) o;
        return (o_c.getPayRate() == this.getPayRate() && o_c.getHoursWorked() ==  this.getHoursWorked()
         && this.getDepartment().equals(o_c.getDepartment()) && super.equals(o));
       }
       return false;

     }

    

     public Employee getCopy() {
        return new Employee(getFirst(), getLast(), department, payRate, hoursWorked);

     }

    

     public void copy(Employee e) {
        super.copy(e);
        department = e.getDepartment();
        hoursWorked = e.getHoursWorked();
        payRate = e.getPayRate();
       

     }

      

}