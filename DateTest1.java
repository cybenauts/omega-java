import java.util.*;
import java.text.*;
import java.io.*;
class DateTest1{
    public static void main(String[] args) {
        
     BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

    SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy"); 
    df.setLenient(false);

    try {
        System.out.print("ENTER DATE STRING (mm/dd/yyyy ): ");
        String dateString = reader.readLine();
        // Parse the date
        Date date = df.parse(dateString);
        System.out.println("Original string: " + dateString);
        System.out.println("Parsed date    : " + date.toString());  
    }
    catch(Exception e) {

}
    }
}