import org.junit.jupiter.api.Test;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private Main testing = new Main();

    @Test
    void ottieniAnno() {
        int result = testing.ottieniAnno(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals(2023, result, "L'anno corretto è 2023");
    }

    @Test
    void ottieniMese() {
        Month result = testing.ottieniMese(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("MARCH", result, "Il mese corretto è MARCH");
    }

    @Test
    void ottieniGiorno() {
        int result = testing.ottieniGiorno(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals(1, result, "Il giorno corretto è 1");
    }

    @Test
    void ottieniGiornoSett() {
        DayOfWeek result = testing.ottieniGiornoSett(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("WEDNESDAY", result, "L'anno corretto è 2023");
    }
}