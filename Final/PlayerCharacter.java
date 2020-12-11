import java.util.*;

public class PlayerCharacter {
    private HashMap<String, Integer> scores = new HashMap<>();
    private String[] scoreNames = new String[] { "strength", "toughness", "intelligence", "magic", "influence" };
    private String name;
    private Random r = new Random();

    public PlayerCharacter(String charName, String highestAbility) {
        name = charName;
        resetScores();
        createArchetype(highestAbility);
    }

    public PlayerCharacter(String charName, int[] scoreValues) {
        name = charName;
        setAllScores(scoreValues);
    }

    public int getRandLow() {
        return r.nextInt(6);
    }

    public int getRandHigh() {
        return r.nextInt(3) + 7;
    }

    private void resetScores() {
        setAllScores(new int[] { 0, 0, 0, 0, 0 });
    }

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

    public int getScoreTotal() {
        int t = 0;
        for (String scoreName : scoreNames) {
            t += scores.get(scoreName);
        }
        return t;
    }

    public void createArchetype(String highestAbility) {
        while (getScoreTotal() < 8 || getScoreTotal() > 28) {
            for (String scoreName : scoreNames) {
                if (scoreName.equals(highestAbility)) {
                    setScore(scoreName, getRandHigh());
                } else {
                    setScore(scoreName, getRandLow());
                }

            }
        }
    }
    public static String[] getPlayableClasses() {
        return new String[] {"Knight", "Peasant", "Cleric", "Mage", "Courtier"};
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

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {return name;}

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

    public static boolean validate(PlayerCharacter pChar) {
        return (pChar.getScoreTotal() >= 8 && pChar.getScoreTotal() <= 28);
    }

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

    public static PlayerCharacter generateCharacter(String archetype) {
        return new PlayerCharacter("", getHighestScoreFromArchetypeName(archetype));

    }

    public static boolean isValidArch(String archetypeName) {
        for (String c : new String[] {"Knight", "Peasant", "Cleric", "Mage", "Courtier"}) {
            if (c.equals(archetypeName)) {
                return true;
            }

        }
        return false;
    }
}