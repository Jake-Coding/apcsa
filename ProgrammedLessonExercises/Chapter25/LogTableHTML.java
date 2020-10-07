
public class LogTableHTML
{
  public static void main ( String[] args )
  {
    System.out.print("<html>\n<body>\n<table>");
    System.out.print("\n<tr><th>x</th><th>ln(x)</th></tr>");
    for ( int j = 1; j <= 20; j++ )
    {
      double x = j/10.0 ;
      System.out.println( "<tr><td>" + x + "</td><td>" + Math.log( x ) + "</td></tr>");
    }
    System.out.println("</table>\n</body>\n</html>");
  } 
}