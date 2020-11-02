import java.util.*;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        setRed((red));
        setGreen((green));
        setBlue((blue));
    }

    public Color() {
        setRed(getRand());
        setGreen(getRand());
        setBlue(getRand());
    }

    public Color(String hex) {
        setRed(hexToInt(hex.substring(0,2)));
        setGreen(hexToInt(hex.substring(2,4)));
        setBlue(hexToInt(hex.substring(4,6)));
    }


    private int getRand() {
        return (int) Math.floor(Math.random() * 256);
    }

    private int hexToInt(String hexval) {
        return (int) Integer.parseInt(hexval, 16);
    }

    public void randomize() {
        setRed(getRand());
        setGreen(getRand());
        setBlue(getRand());
    }

    private int correctColor(int input) {
        return input > 255 ? 255 : input < 0 ? 0 : input;
    }

    public void setRed(int red) { this.red = correctColor(red); }
    public void setGreen(int green) { this.green = correctColor(green); }
    public void setBlue(int blue) { this.blue = correctColor(blue); }
    public int getRed() {return red;}
    public int getGreen() {return green;}
    public int getBlue() {return blue;}


    public String toString() {
        return "[" + red +", " + green + ", " + blue + "]";
    }

    private void changeBy(double percentage) {
        // percentage is 0-1
        this.red *= 1 + percentage;
        this.green *= 1 + percentage;
        this.blue *= 1 + percentage;
    }

    public void darken(double percentage) {
        changeBy(-1 * percentage);
    }

    public void lighten(double percentage) {
        changeBy(percentage);
    }

    public Color blend(Color otherColor) {
        return new Color((this.red + otherColor.getRed()) / 2, (this.green + otherColor.getGreen()) / 2, (this.blue + otherColor.getBlue()) /2);
    }
}