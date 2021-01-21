//Client program for Person/Employee


public class ClientEmployee {

    public static void main(String[] arg) {




        Employee prof = new Employee("John", "Doe", "COSC", 25.50, 50); //subclass alternate constructor invoked

        Employee newEmp = new Employee(); //subclass default constructor invoked
        
        System.out.println("PRINTING PROF LF, AND PRINT METHOD");
        prof.printLastFirst();
        prof.print();

        System.out.println("PRINTING NEWEMP");
        newEmp.print();
        System.out.println("STEVEN JOOB!???!");
        newEmp.setAll("Steve", "Jobs", 3, 5, "apple idk");
        newEmp.print();

        System.out.println("is newemp prof? (no)");
        System.out.println(newEmp.equals(prof)); // false

        System.out.println("copying prof to newemp");
        newEmp.copy(prof);

        System.out.println("printing newemp");
        newEmp.print();

        System.out.println("are they the same now?");
        System.out.println(newEmp.equals(prof)); // true

        System.out.println("czech m8");
    }

}