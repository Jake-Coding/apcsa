import java.util.*;


public class TriangleTester
{
  public static void main ( String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("TRI: ");
    int input = s.nextInt();
    int result = Triangle( input );
    System.out.println("Triangle(" +input+ ") is " + result );
  }

  public static int Triangle(int N) {
    if (N < 1) {return 0;}
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}