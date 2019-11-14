public class BonusService {

    public int asManyAsThousands(int purchaseAmount) {
        return purchaseAmount / 1000;
    }

    public int calculateBonus(int accumulatedAmount, int purchaseAmount) {
        int maxAmountForBlueCard = 15_000;
        int maxAmountForSilverCard = 150_000;

        if (accumulatedAmount <= maxAmountForBlueCard) {
            int purchaseBonus = 50;
            return purchaseBonus * asManyAsThousands(purchaseAmount);
        }
        if (accumulatedAmount <= maxAmountForSilverCard) {
            int purchaseBonus = 70;
            return purchaseBonus * asManyAsThousands(purchaseAmount);
        }
            int purchaseBonus = 100;
        return purchaseBonus * asManyAsThousands(purchaseAmount);
    }
}
