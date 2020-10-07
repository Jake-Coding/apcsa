public class LogTable
{
  public static void main ( String[] args )
  {
    System.out.println( "x" + "\t ln(x)" );

    for ( int j = 1; j <= 20; j++ )
    {
      double x = j/10.0 ;
      System.out.println( x + "\t" + Math.log( x ) );
    }
  } 
}