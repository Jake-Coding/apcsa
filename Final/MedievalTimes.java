import java.util.*;
import java.io.*;
public class MedievalTimes {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("> ");
            String uInput = userScanner.nextLine();
            handleInput(uInput, userScanner);
        }

        
    }

    public static void displayMenu() {
        System.out.println("\n\n\n\nMENU");
        System.out.println("Create a game\t c");
        System.out.println("Validate a save\t v");
        System.out.println("Randomize a character\t r");
        System.out.println("View a save\t vi");
        System.out.println("Quit\t q");
    }

    public static void handleInput(String input, Scanner s) {
        switch(input) {
            case "c":
                makeParty(s);
                break;
            case "v":
                validateSave(s);
                break;
            case "r":
                randomizeChar(s);
                break;
            case "vi":
                viewSave(s);
                break;
            case "q":
                System.exit(1);
            default:
                System.out.println("Invalid input");
                break;
        }

    }

    public static void makeParty(Scanner s) {
        Party userParty = new Party();
        System.out.print("Save to which file? (type no to not save)\n> ");
        String fName = s.nextLine();
        if (!fName.equals("no")) {
            try {
                userParty.toFile(fName);
                System.out.println("Done!");
            } catch (Exception e) {System.out.println("Something went wrong! Please try again.");}
        }
    }

    public static void validateSave(Scanner s) {
        System.out.print("Which file would you like to validate?\n> ");
        String fName = s.nextLine();
        try {
            new Party(fName);
            System.out.println("Your file is valid :)");
        } catch (IOException e) {
            System.out.println("Invalid file name.");
        } catch (Exception e) {
            System.out.println("Your file is not a valid Medieval Times save file");
        }
    }

    public static void randomizeChar(Scanner s) {
        System.out.print("Which save would you like to load?\n> ");
        String fName = s.nextLine();
        try {
            Party p = new Party(fName);
            System.out.println(p);
            System.out.print("Which character would you like to randomize?\n> ");
            String cName = s.nextLine();
            if (p.rerollChar(cName)) {
                System.out.println("Success!");
            } else {
                System.out.println("Character name not found. Be sure to match the case and spelling exactly.");
            }
            p.toFile(fName);
        } catch (IOException e) {
            System.out.println("Invalid file name.");
        } catch (Exception e) {
            System.out.println("Your file is not a valid Medieval Times save file");
        }
    }

    public static void viewSave(Scanner s) {
        System.out.print("Which save would you like to load?\n> ");
        String fName = s.nextLine();
        try {
            Party p = new Party(fName);
            System.out.println(p);
        } catch (IOException e) {
            System.out.println("Invalid file name.");
        } catch (Exception e) {
            System.out.println("Your file is not a valid Medieval Times save file");
        }
    }
}