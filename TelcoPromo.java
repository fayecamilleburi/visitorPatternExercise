public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 15, 500, false);
        TelcoSubscription globe = new Telco("Globe", 10, 450, true);
        TelcoSubscription ditto = new Telco("Ditto", 8, 400, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, 500));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, 450));
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo, 400));

        System.out.println("\n" + smart.accept(unli, false));
        System.out.println(globe.accept(unli, true));
        System.out.println(ditto.accept(unli, true));
    }
}
