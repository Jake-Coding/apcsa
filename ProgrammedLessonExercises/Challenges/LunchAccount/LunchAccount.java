public class LunchAccount {
    private int id;
    private static int globalIDCounter = 1000;
    private static int studentsWithMoneyAdded = 0;
    private double balance;
    private String student;

    public LunchAccount(String student, double balance) {
        this.balance = 0;
        this.id = globalIDCounter;
        this.student = student;
        addMoney(balance);
        globalIDCounter++;
        
    }

    public LunchAccount(String student) {
        this(student, 0);
    }

    public double getBalance() {return balance;}
    public String getStudent() {return student;}

    public void addMoney(double money) {
        if (money > 0) {
            if (this.balance == 0) {
                studentsWithMoneyAdded++;
                if (studentsWithMoneyAdded < 100) {
                    this.balance += 20;
                }
            }
            this.balance += money;
        }
    }

    public boolean getLunch(double price) {
        if (price <= balance) {
            balance -= price;
            return true;
        }
        return false;
    }

    public String toString() {
        return student + " #" + id + " has " + "$" + balance;
    }


}