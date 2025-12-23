public class SportCar extends Car {
    private int modelYear;
    private int modelNumber;

    // Default Constructor
    public SportCar() {
        super();
    }

    // One-argument constructor
    public SportCar(int modelYear) {
        this();
        this.modelYear = modelYear;
    }

    // Two-argument constructor using chaining
    public SportCar(int modelYear, int modelNumber) {
        this(modelYear);
        this.modelNumber = modelNumber;
    }

    // Calculate Price: Base 2000 + 20% Tax
    @Override
    public double calculatePrice() {
        double basePrice = 2000;
        double tax = 0.20;
        return basePrice + (basePrice * tax);
    }

    // Describe Car
    @Override
    public void describeCar() {
        System.out.println("SportCar - Model Number: " + modelNumber + ", Model Year: " + modelYear);
    }

    // Equals method based on engine power
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SportCar) {
            SportCar other = (SportCar) obj;
            return this.e.getPowerEngine() == other.e.getPowerEngine();
        }
        return false;
    }
}