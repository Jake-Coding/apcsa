import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String position;
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Position: ");
        position = scanner.nextLine();


        Employee myEmp = new Employee(name, position);
        System.out.println(myEmp);
        System.out.println("ID: "+myEmp.getID());

        Employee secondEmp = new Employee("second fella", "hes second lmao", 1000, 3, 20);
        System.out.println(secondEmp);
        System.out.println("ID:" + secondEmp.getID());
        try {
            Paycheck thisThrowsAnError = secondEmp.getPaid("this should throw an error if its cool");
        } catch (Exception e) {
            System.out.println("it threw an error pog");
        }


        myEmp.work(10.3);
        System.out.println(myEmp);
        Paycheck myEmpPaid = myEmp.getPaid("Today!");
        System.out.println(myEmpPaid);

        myEmp.work(101);
        System.out.println(myEmp);

        try {
            myEmpPaid = myEmp.getPaid("this throws an error");
        } catch (Exception e) {
            System.out.println("error time");
        }


    }
}