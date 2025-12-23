import q1_b.Seat;

public class Vehicle implements PriceAdmin, VehicleAdmin {
    // Data Fields
    protected Wheel[] warr = new Wheel[4];
    protected Seat[] sarr = new Seat[5];
    protected Engine e;

    // Constructor
    public Vehicle() {
        // Initialize all elements of warr using a loop
        for (int i = 0; i < warr.length; i++) {
            warr[i] = new Wheel();
        }

        // Initialize all elements of sarr using a loop
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = new Seat();
        }

        // Instantiate the Engine object
        e = new Engine();
    }

    // Default implementations for interface methods to be overridden by subclasses
    @Override
    public double calculatePrice() {
        return 0.0;
    }

    @Override
    public void describeCar() {
    }
    // tostring mth
}