import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
    //Formatta la data ottenuta in FULL, MEDIUM e SHORT
    //Stampa le varie versioni -Crea dei test per questo esercizio
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println("Full date without time:" + fullDate(date));
        System.out.println("Medium date with time:" + mediumDate(date));
        System.out.println("Short date with time:" + shortDate(date));
    }
     public static String fullDate(OffsetDateTime date){
         String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
         return dateFull;
     }
     public static String mediumDate(OffsetDateTime date){
         String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
         return dateMedium;
     }
     public static String shortDate(OffsetDateTime date){
         String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
         return dateShort;
     }
}