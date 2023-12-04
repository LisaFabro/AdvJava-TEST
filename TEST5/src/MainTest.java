import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.testng.AssertJUnit.assertEquals;

class MainTest {
    private Main testing = new Main();

    @Test
    void aggiuntaAnno() {
        String result = testing.aggiuntaAnno(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("La data che deve risultare è 01 marzo 2024", result, "01 marzo 2024");
    }

    @Test
    void sottraiMese() {
        String result = testing.sottraiMese(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("La data che deve risultare è 01 febbraio 2023", result, "01 febbraio 2023");
    }

    @Test
    void aggiuntaSettimana() {
        String result = testing.aggiuntaSettimana(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("La data che deve risultare è 08 marzo 2023", result, "08 marzo 2023");
    }

    @Test
    void dataIta() {
        String result = testing.dataIta(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("La data che deve risultare è 01 marzo 2023", result, "01 marzo 2023");
    }
}