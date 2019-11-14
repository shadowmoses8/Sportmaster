public class BonusService {

    public int calculateBonus(int accumulatedAmount, int purchaseAmount) {
        if (accumulatedAmount <= 15_000) {
            int purchaseBonus = 50;
            int asManyAsThousands = purchaseAmount / 1000;
            return purchaseBonus * asManyAsThousands;
        }
        if (accumulatedAmount <= 150_000) {
            int purchaseBonus = 70;
            int asManyAsThousands = purchaseAmount / 1000;
            return purchaseBonus * asManyAsThousands;
        }
            int purchaseBonus = 100;
            int asManyAsThousands = purchaseAmount / 1000;
            return purchaseBonus * asManyAsThousands;
    }
}
