import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    //ottieni l'anno
    //ottieni il mese
    //ottieni il giorno
    //ottieni il giorno della settimana
    //Stampa i risultati sulla console -Crea dei test per questo esercizio
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("Year: " + ottieniAnno(date));
        System.out.println("Month: " + ottieniMese(date));
        System.out.println("Day of month: " + ottieniGiorno(date));
        System.out.println("Day of week: " + ottieniGiornoSett(date));
    }
    public static int ottieniAnno(OffsetDateTime date){
        return date.getYear();
    }
    public static Month ottieniMese(OffsetDateTime date){
        return date.getMonth();
    }
    public static int ottieniGiorno(OffsetDateTime date){
        return date.getDayOfMonth();
    }
    public static DayOfWeek ottieniGiornoSett(OffsetDateTime date){
        return date.getDayOfWeek();
    }
}