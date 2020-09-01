import java.util.*;
public class Nurse {
    public static void main(String[] args) {
        // Name, age, temp, bp, diabetesHistory, discomfort(1-10), symptoms (list)\
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double temp;
        int bpH;
        int bpL;
        boolean diabetesHistory = false;
        int discomfort;
        String[] symptoms;

        System.out.print(prompt("name"));
        name = scanner.nextLine();
        System.out.print(prompt("age"));
        age = scanner.nextInt();
        System.out.print(prompt("temperature"));
        temp = scanner.nextFloat();
        System.out.print(prompt("blood pressure (first num)"));
        bpH = scanner.nextInt();
        System.out.print(prompt("blood pressure (second num)"));
        bpL = scanner.nextInt();

        System.out.print("Do you have a history of diabetes?\n> ");
        String diabetesInput = scanner.next();
        String[] goodInputs = new String[] {"yes", "1", "true", "y"};
        for (int i = 0; i < goodInputs.length; i++) {
            // System.out.println(diabetesInput);
            // System.out.println(goodInputs[i]);
            // System.out.println(diabetesInput.equalsIgnoreCase(goodInputs[i]));
            if (diabetesInput.equalsIgnoreCase(goodInputs[i])) {
                // System.out.println("OK ITS TRUE");
                diabetesHistory = true;
            }
        }

        System.out.print(prompt("discomfort (1-10)"));
        discomfort = scanner.nextInt();

        System.out.print("How many symptoms do you have?\n> ");
        int symptomCount = scanner.nextInt();
        symptoms = new String[symptomCount];
        // System.out.println(symptoms);
        scanner.nextLine();
        for (int i = 0; i < symptoms.length; i++) {
            System.out.print(prompt("symptom #" + (i+1)));
            symptoms[i] = scanner.nextLine();
        }
        scanner.close();
        pString("Name", name);
        pString("Age", age + "");
        pString("Temperature", temp + "");
        pString("Blood Pressure", bpH+"/"+bpL);
        pString("Diabetes history", Boolean.toString(diabetesHistory));
        pString("Discomfort level", discomfort+"");
        pString("Symptoms", Arrays.toString(symptoms));



    }
    public static String prompt(String promptStr) {
        return "What is your " + promptStr + "?\n> ";
    }

    public static void pString(String title, String value) {
        System.out.println(title + ": " + value);
    }
}