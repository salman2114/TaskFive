public class PremiumMember extends Member {
    private double membershipFee;

    public PremiumMember(int memberId, String name, double membershipFee) {
        super(memberId, name);
        this.membershipFee = membershipFee;
    }

    @Override
    public double calculateDiscount(double amount) {
        // Premium members get 10% discount [cite: 66]
        return amount * 0.10;
    }

    @Override
    public void displayMemberInfo() {
        super.displayMemberInfo();
        System.out.println("Type: Premium | Membership Fee: $" + membershipFee);
    }
}