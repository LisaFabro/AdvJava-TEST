import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    //aggiungi un anno
    //sottrai un mese
    //aggiungi 7 giorni
    //Stampa il risultato localizzata per l'Italia
    //Crea dei test per questo esercizio
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("Data finale con aggiunta anno: " + aggiuntaAnno(data));
        System.out.println("Data finale con sottrazione di 1 mese: " + sottraiMese(data));
        System.out.println("Data finale con aggiunta settimana: " + aggiuntaSettimana(data));
    }
    public static String aggiuntaAnno(OffsetDateTime data){
        return dataIta(data.plusYears(1));
    }
    public static String sottraiMese(OffsetDateTime data){
        return dataIta(data.minusMonths(1));
    }
    public static String aggiuntaSettimana(OffsetDateTime data){
        return dataIta(data.plusDays(7));
    }
    public static String dataIta(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }
}