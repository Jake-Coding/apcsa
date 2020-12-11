import java.util.*;

public class PlayerCharacter {
    private HashMap<String, Integer> scores = new HashMap<>();
    private String[] scoreNames = new String[] { "strength", "toughness", "intelligence", "magic", "influence" };
    private String name;
    private Random r = new Random();

    // CONSTRUCTORS
    public PlayerCharacter(String charName, String highestAbility) {
        name = charName;
        resetScores();
        createArchetype(highestAbility);
    }

    public PlayerCharacter(String charName, int[] scoreValues) {
        name = charName;
        setAllScores(scoreValues);
    }

    // GETTERS / SETTERS
         // LOCAL
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {return name;}   

    private void setScore(String scoreName, int value) {
        scores.put(scoreName, value);
    }

    private void setAllScores(int[] scoreValues) {
        int i = 0;
        for (String scoreName : scoreNames) {
            setScore(scoreName, scoreValues[i]);
            i++;
        }

    }
    
    private void resetScores() {
        setAllScores(new int[] { 0, 0, 0, 0, 0 });
    }

    public int getScoreTotal() {
        int t = 0;
        for (String scoreName : scoreNames) {
            t += scores.get(scoreName);
        }
        return t;
    }
    public String getThisArchetype() {
        String maxScore = "";
        int max = 0;
        for (String scoreName : scoreNames) {
            if (scores.get(scoreName) > max) {
                max = scores.get(scoreName);
                maxScore = scoreName;
            }

        }
        return getArchetypeName(maxScore);
    }   

        // STATIC GETTERS
    public static String[] getPlayableClasses() {
        return new String[] {"Knight", "Peasant", "Cleric", "Mage", "Courtier"};
    }
    
    public static String getArchetypeName(String highestAbility) {
        switch (highestAbility) {
            case "strength":
                return "Knight";
            case "toughness":
                return "Peasant";
            case "intelligence":
                return "Cleric";
            case "magic":
                return "Mage";
            case "influence":
                return "Courtier";
            default:
                return "NONE";
        }
    }

    public static String getHighestScoreFromArchetypeName(String archetypeName) {
        switch (archetypeName) {
            case "Knight":
                return "strength";
            case "Peasant":
                return "toughness";
            case "Cleric":
                return "intelligence";
            case "Mage":
                return "magic";
            case "Courtier":
                return "influence";
            default:
                return "NONE";

        }
    }

    // HELPER FUNCTIONS
    public int getRandLow() {
        return r.nextInt(6);
    }

    public int getRandHigh() {
        return r.nextInt(3) + 7;
    }

    public void createArchetype(String highestAbility) {
        for (String scoreName : scoreNames) {
            if (scoreName.equals(highestAbility)) {
                setScore(scoreName, getRandHigh());
            } else {
                setScore(scoreName, getRandLow());
            }
        }
        while (!validate(this)) {
            for (String scoreName : scoreNames) {
                if (scoreName.equals(highestAbility)) {
                    setScore(scoreName, getRandHigh());
                } else {
                    setScore(scoreName, getRandLow());
                }

            }
        }
    }

    // VALIDATION FUNCTIONS
    public static boolean validate(PlayerCharacter pChar) {
        return (pChar.getScoreTotal() >= 8 && pChar.getScoreTotal() <= 28);
    }
    
    public static boolean isValidArch(String archetypeName) {
        for (String c : new String[] {"Knight", "Peasant", "Cleric", "Mage", "Courtier"}) {
            if (c.equals(archetypeName)) {
                return true;
            }

        }
        return false;
    }


    // toString and reprString methods
    public String toString() {
        return name + " (" + getThisArchetype() + ")" + " : " + scores.toString();
    }

    public String reprString() {
        String[] arr = new String[7];
        arr[0] = name;
        arr[1] = getThisArchetype();
        int i = 2;
        for (String scoreName : scoreNames) {
            arr[i] = scores.get(scoreName).toString();
            i++;
        }

        return (String.join(",", arr));

    }

    // parse from String
    public static PlayerCharacter parseString(String s) {
        String[] arr = s.split(",");
        String[] scoreArrStr = Arrays.copyOfRange(arr, 2, 7);
        int[] scoreArrInt = new int[5];
        int i = 0;
        for (String score : scoreArrStr) {
            scoreArrInt[i] = Integer.parseInt(score);
            i++;
        }
        return new PlayerCharacter(arr[0], scoreArrInt);
    }

    // Generate a character of a given archetype
    public static PlayerCharacter generateCharacter(String archetype) {
        return new PlayerCharacter("", getHighestScoreFromArchetypeName(archetype));

    }


}