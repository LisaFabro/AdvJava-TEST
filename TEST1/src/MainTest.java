import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private Main testing = new Main();

    @Test
    void
    funPotenza() {
        double result = testing.funPotenza(3,2);
        assertEquals(9,result, "3 elevato a 2 dovrebbe risultare 9");
    }
    @Test
    void
    funPotenza_esponente_zero() {
        double result = testing.funPotenza(3,0);
        assertEquals(1,result, "3 elevato a 0 dovrebbe risultare 1");
    }
    @Test
    void
    funPotenza_esponente_negativo() {
        double result = testing.funPotenza(3,-2);
        assertEquals(0.1111111111111111,result, "3 elevato a -1 dovrebbe risultare 0,1 con tanti 1");
    }
    @Test
    void
    funPotenza_base_negativa_esp_dispari() {
        double result = testing.funPotenza(-3,3);
        assertEquals(-27,result, "-3 elevato a 3 dovrebbe risultare -27");
    }
    @Test
    void
    funPotenza_base_negativa_esp_pari() {
        double result = testing.funPotenza(-3,2);
        assertEquals(9,result, "-3 elevato a 2 dovrebbe risultare 9");
    }
}