public class BonusService {

    public int calculateBonus(int accumulatedAmount, int purchaseAmount) {
        int maxAmountForBlueCard = 15_000;
        int maxAmountForSilverCard = 150_000;

        if (accumulatedAmount <= maxAmountForBlueCard) {
            int purchaseBonus = 50;
            int asManyAsThousands = purchaseAmount / 1000;
            return purchaseBonus * asManyAsThousands;
        }
        if (accumulatedAmount <= maxAmountForSilverCard) {
            int purchaseBonus = 70;
            int asManyAsThousands = purchaseAmount / 1000;
            return purchaseBonus * asManyAsThousands;
        }
            int purchaseBonus = 100;
            int asManyAsThousands = purchaseAmount / 1000;
            return purchaseBonus * asManyAsThousands;
    }
}
