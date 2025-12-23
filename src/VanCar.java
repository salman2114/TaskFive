public class VanCar extends Car {

    // Method to calculate price based on engine power
    @Override
    public double calculatePrice() {
        int power = e.getPowerEngine();
        double tax;
        double baseAmount = 35000;

        if (power <= 1500) {
            tax = 0.14;
            baseAmount = 1000;
        } else if (power == 2000) {
            tax = 0.16;
            baseAmount = 1500;
        } else {
            tax = 0.18;
            baseAmount = 2000;
        }

        return baseAmount + (baseAmount * tax);
    }

    // Method to describe car
    @Override
    public void describeCar() {
        System.out.println("VanCar Price: " + calculatePrice() + " JD");
    }

    // Custom equals method
    public boolean equals(VanCar r) {
        if (r == null) return false;
        return this.calculatePrice() == r.calculatePrice();
        //instance of
    }
}