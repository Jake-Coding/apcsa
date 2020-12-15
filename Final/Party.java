import java.util.*;
import java.io.*;
public class Party {
    private final static int partySize = 4;
    private PlayerCharacter[] players;
    private String partyName;



    // CONSTRUCTORS
    public Party(String partyName, PlayerCharacter[] players) {
        this.partyName = partyName;
        assert players.length == partySize;
        this.players = players;
    }
    public Party(Scanner scanner) {
        players = new PlayerCharacter[partySize];
        createParty(scanner);
    }
    public Party(String filename) throws Exception{
        players = new PlayerCharacter[partySize];
        File f = new File(filename);
        File fForValidation = new File(filename);
        if (!validate(new Scanner(fForValidation))) {throw new Exception("INVALID FILE");}
        Scanner fileScanner = new Scanner(f);


        parseFile(fileScanner);

        
    }


    // VALIDATION AND HELPER FUNCTIONS
    
    private static boolean validate(Scanner fileScanner){
        try {
            String[] classes = new String[partySize];
            PlayerCharacter[] tempPlayers = new PlayerCharacter[partySize];
            fileScanner.nextLine(); // party name
            for (int i = 0; i < partySize; i++) {
                tempPlayers[i] = PlayerCharacter.parseString(fileScanner.nextLine());
                classes[i] = tempPlayers[i].getThisArchetype();
                if (!PlayerCharacter.validate(tempPlayers[i])) {return false;}
            }
            if (!validateClassList(classes)) {return false;}
            if (fileScanner.hasNextInt()) {
                throw new Exception("File is too long.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
        
    }
    
    private static boolean validateClassList(String[] classes) {
        for (int i = 0; i < classes.length; i++) {
            String c = classes[i];
            if (c != null && count(classes, c) > 2) {
                return false;
            }
        }
        return true;
    }

        // helper for validating the class list
    private static int count(String[] arr, String v) {
        int count = 0;
        for (String val : arr) {
            if (v.equals(val)) {
                count++;
            }
        }
        return count;
    } 


    // Reroll a character with a given name
    public boolean rerollChar(String name) {
        for (PlayerCharacter player : players) {
            if (player.getName().equals(name)) {
                player.createArchetype(PlayerCharacter.getHighestScoreFromArchetypeName(player.getThisArchetype()));
                return true;
            }
        }
        return false;
    }

    
        
    
    // toString and file methods
    public String toString() {
        String s = "";
        s += partyName + "\n";
        for (PlayerCharacter player : players) {
            s += player.toString() + "\n";
        }
        return s;
    }

    public String toFileString() {
        String s = "";
        s += partyName + "\n";
        for (PlayerCharacter player : players) {
            s += player.reprString() + "\n";
        }
        return s.strip();

    }

    public void toFile(String filename) throws IOException {
        File f = new File(filename);
        f.createNewFile();
        FileWriter fWriter = new FileWriter(f);
        fWriter.write(toFileString());
        fWriter.close();
    

    }

    private void parseFile(Scanner fileScanner) throws Exception {
        this.partyName = fileScanner.nextLine();
        for (int i = 0; i < partySize; i++) {
            players[i] = PlayerCharacter.parseString(fileScanner.nextLine());
        }

    }


    // User input and display

    public String displayOptionString() {
        String s = "";
        for (int i = 0; i < partySize; i++) {
            if (players[i] != null) {
                s += i + ": " + players[i];
            }
        }
        return s;
    }

    private void createParty(Scanner scanner) {
        Scanner scan = scanner;
        String[] classes = new String[partySize];
        
        System.out.print("Name of your party\n> ");
        String pName = scan.nextLine();
        this.partyName = pName;
        for (int i = 0; i < partySize; i++) {
            // VALIDATE ARCHETYPE
            System.out.println("Character #" + (i + 1));
            System.out.print("Class (Knight, Peasant, Cleric, Mage, Courtier, with correct capitalization): ");
            String archetype = scan.nextLine();
            while (!PlayerCharacter.isValidArch(archetype)) {
                System.out.print("Invalid\nClass (Knight, Peasant, Cleric, Mage, Courtier, with correct capitalization): ");
                archetype = scan.nextLine();
            }
            String[] temp = Arrays.copyOf(classes, partySize);
            temp[i] = archetype;
            while (!validateClassList(temp)) {
                System.out.println("Already 2 of that class!\nClass (Knight, Peasant, Cleric, Mage, Courtier, with correct capitalization): ");
                archetype = scan.nextLine();
                while (!PlayerCharacter.isValidArch(archetype)) {
                    System.out.print("Invalid\nClass (Knight, Peasant, Cleric, Mage, Courtier, with correct capitalization): ");
                    archetype = scan.nextLine(); 
                }
                temp[i] = archetype;
            }
            classes = Arrays.copyOf(temp, partySize);
            
            // MAKE CHARACTER

            PlayerCharacter tempChar = PlayerCharacter.generateCharacter(archetype);
            System.out.println(tempChar);
            System.out.print("Do you like this character? (y/n)\n> ");
            String likes = scan.nextLine();
            while (!likes.equalsIgnoreCase("y")) {
                tempChar = PlayerCharacter.generateCharacter(archetype);
                System.out.println(tempChar);
                System.out.print("Do you like this character? (y/n)\n> ");
                likes = scan.nextLine();
            }
            System.out.print("Give them a name\n> "); 
            String name = scan.nextLine();
            tempChar.setName(name);
            players[i] = tempChar;
            System.out.println("Character set!\n\n\n");

        }
            
    }


}