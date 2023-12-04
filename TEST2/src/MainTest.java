import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private Main testing = new Main();
    @Test
    void fullDate() {
        String resut = testing.fullDate(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2002", resut, "Il formato della data sarà venerdì 1 marzo 2002");
    }

    @Test
    void mediumDate() {
        String result = testing.mediumDate(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("1 mar 2002", result, "Il formato della data sarà 1 mar 2002");
    }

    @Test
    void shortDate() {
        String result = testing.shortDate(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("01/03/02", result, "Il formato della data sarà 01/03/02");
    }
}