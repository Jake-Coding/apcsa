import java.util.*;
public class Exercise1
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );
    Scanner scanner = new Scanner(System.in);
    System.out.print("Selection (1, 2, or 3)");
    int selection = scanner.nextInt();
    while (selection != -1) {
        if (selection > 0 && selection < 4) {
            hubbard.select(selection);
            System.out.print("Enter amount to spread: ");
            int spreadAmt = scanner.nextInt();
            hubbard.spread(spreadAmt);
        } else {
            System.out.println("Invalid selection.");
        }
        System.out.println(hubbard);
        System.out.print("Selection (1, 2, or 3)");
        selection = scanner.nextInt();

    }
    
  }
}
