import  java.util.*;


public class Factorial
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    long N; 
    long f;

    System.out.print( "N: " );
    N = scan.nextLong();
    f = fact(N);
    System.out.print(f);

    
  }
  public static long fact(long n) {
    long fact = 1;
    if ( n >= 0 ) {
      while ( n > 1 ) {
        fact = fact * n;
        n--;
      }
      return fact;
    }
    else
    {
        throw new IllegalArgumentException("Bruh thats negative. We don't do that here");
    }
  }

}