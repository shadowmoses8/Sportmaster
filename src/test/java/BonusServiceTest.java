import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonusBlueCard() {
        BonusService service = new BonusService();
        assertEquals(150, service.calculateBonus(5_100, 3_900));
    }

    @Test
    void calculateBonusArgentumCard() {
        BonusService service = new BonusService();
        assertEquals(210, service.calculateBonus(15_100, 3_900));
    }

    @Test
    void calculateBonusGoldCard() {
        BonusService service = new BonusService();
        assertEquals(300, service.calculateBonus(151_000, 3_900));
    }
}