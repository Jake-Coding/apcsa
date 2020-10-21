public class ColorTester {
    public static void main(String[] args) {
        Color firstColor = new Color(-1,55,257);
        System.out.println(firstColor); // [0,55,255]
        firstColor.setBlue(3);
        System.out.println(firstColor); // [0,55,3]
        firstColor.randomize();
        System.out.println(firstColor); // random ints
        firstColor.darken(0.1); 
        System.out.println(firstColor); // slightly lower values than above random ints
        Color hexColor = new Color("ffffff");
        System.out.println(hexColor); // [255,255,255]

        Color blendedColor = hexColor.blend(firstColor);
        System.out.println(blendedColor); // firstColor but shifted halfway darker (towards 255s)
    }
}