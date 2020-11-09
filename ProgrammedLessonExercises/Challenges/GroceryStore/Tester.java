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

        myEmp.work(10.3);
        System.out.println(myEmp);
        Paycheck myEmpPaid = myEmp.getPaid("Today!");
        System.out.println(myEmpPaid);

        myEmp.work(101);
        System.out.println(myEmp);
        myEmpPaid = myEmp.getPaid("this throws an error");


    }
}