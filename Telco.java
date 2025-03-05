public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, int dataAllowance, double promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean hasUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(this.telcoName, price, this.dataAllowance);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(this.telcoName, unliCallText);
    }
}
