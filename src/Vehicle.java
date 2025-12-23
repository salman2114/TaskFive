public class RegularMember extends Member {

    public RegularMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public double calculateDiscount(double amount) {
        // Regular members get 0 discount [cite: 66]
        return 0.0;
    }
}