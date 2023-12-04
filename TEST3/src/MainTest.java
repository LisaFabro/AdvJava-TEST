import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private Main testing = new Main();

    @Test
    void dataIta() {
        String result = testing.dataIta(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("01 marzo 2023", result, "La data che si ottiene deve essere 01 marzo 2023");
    }
}