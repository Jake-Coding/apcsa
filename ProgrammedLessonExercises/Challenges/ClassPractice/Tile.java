public class Tile {
    char letter;
    int value;
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    
    public static void printTile(Tile t) {
        System.out.println(t);
    }
    public char getLetter() {return letter;}
    public int getValue() {return value;}

    public String toString() {
        return String.valueOf(letter) + ":" + value;
    }

    public boolean equals(Tile otherTile) {
        return this.letter == otherTile.getLetter() && this.value == otherTile.getValue();
    }
}