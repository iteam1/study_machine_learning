import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){

        LocalDate myDate = LocalDate.now();
        System.out.println("LocalDate:" + myDate); // Display current data

        LocalTime myTime = LocalTime.now();
        System.out.println("LocalTime:" + myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime before format:" + myDateTime);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println("After formatting: "  + formattedDate);

    }
}