import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 
/**
  * Java SimpleDateFormat - convert a Java String to a Date
  *
  * Uses a String pattern to define the expected date format.
  *
  */
public class DateTest2
{
  public static void main(String[] args)
  {
    // (1) create a SimpleDateFormat object with the desired format.
    // this is the format/pattern we're expecting to receive.
    String expectedPattern = "MM/dd/yyyy";
    SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
    try
    {
      // (2) give the formatter a String that matches the SimpleDateFormat pattern
      String userInput = "09/22/2009";
      Date date = formatter.parse(userInput);
 
      // (3) prints out "Tue Sep 22 00:00:00 EDT 2009"
      System.out.println(date);
    }
    catch (ParseException e)
    {
      // execution will come here if the String that is given
      // does not match the expected format.
      e.printStackTrace();
    }
  }
}