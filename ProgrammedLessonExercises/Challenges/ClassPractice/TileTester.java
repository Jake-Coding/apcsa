public class TileTester {
    public static void main(String[] args) {
        Tile z = new Tile('z', 10);
        Tile.printTile(z);

        System.out.println(z.equals(new Tile('z',10)));
    }
}