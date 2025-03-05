public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited calls and text: " + (unliCallText ? "Available" : "Not Available");
    }
}
