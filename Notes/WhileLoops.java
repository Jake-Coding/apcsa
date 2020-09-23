import java.util.*;
public class WhileLoops {
    public static void main(String[] args) {

        /**
         * pseudocode
         * 
         * while (condition) {
         *  repeat me
         * }
         * 
         */ 

        // EXAMPLE - COUNT
        int count = 0; // start

        while (count < 10) { // stopping condition
            System.out.println(count); // action

            count++; // increment

        }

        // use for loop in most cases. just an example
        

        // EXAMPLE - PASSWORD (uncountable)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the w o r d:");
        String password = scanner.next();

        while (!"password".equals(password)) { // check for valid input
            System.out.println("Enter the w o r d:");
            password = scanner.next();
        }

        scanner.close();

        //MONKE BRAIN MISTAKES

        // cond timing
            int x = 1;
            while (x > 0) {
                x = 0; // doesn't change condition timing
                System.out.println("In loop");
                x = 1;
            }

        
        // not incrementing
            int z = 0;
            while (z < 100) {
                System.out.println("Z doesn't change you absolute monkey buffoon");
            }


    }
}