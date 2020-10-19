public class BoxTest {
    public static void main(String[] args) {
        Box ogBox = new Box(2,3,4);
        System.out.println("Area: "+ogBox.area());
        System.out.println("Volume: "+ ogBox.volume());
        Box newerBox = new Box(ogBox);
        System.out.println("New box is old box? " + (newerBox == ogBox));
        Box biggerBox = Box.biggerBox(newerBox);
        Box smallerBox = Box.smallerBox(newerBox);
        System.out.println("Does small box fit in big box? " + (smallerBox.nests(biggerBox)));
        System.out.println("What about big box in small box? " + (biggerBox.nests(smallerBox)));
    }
}