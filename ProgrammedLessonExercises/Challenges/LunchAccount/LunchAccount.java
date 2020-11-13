public class LunchAccount {
    private int id;
    private static int globalIDCounter = 1000;
    private static int studentsWithMoneyAdded = 0;
    private double balance;
    private String student;
    private int lunchesBought;
    private double totalSpent;
    private boolean moneyAddedYet = false;

    public LunchAccount(String student, double balance) {
        this.balance = 0;
        this.id = globalIDCounter;
        this.student = student;
        addMoney(balance);
        globalIDCounter++;
        lunchesBought = 0;
        totalSpent = 0;
        
    }

    public LunchAccount(String student) {
        this(student, 0);
    }

    public double getBalance() {return balance;}
    public String getStudent() {return student;}
    public int getLunchesBought() {return lunchesBought;}
    public double getTotSpent() {return totalSpent;}

    public void addMoney(double money) {
        if (money > 0) {
            if (!moneyAddedYet) {
                studentsWithMoneyAdded++;
                this.moneyAddedYet = true;
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
            lunchesBought++;
            totalSpent += price;
            return true;
        }
        return false;
    }

    public String toString() {
        return student + " #" + id + " has " + "$" + balance +". They have bought " + lunchesBought + " lunches and have spent $" + totalSpent + " in total.";
    }


}