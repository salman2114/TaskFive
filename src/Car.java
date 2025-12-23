public class Car extends Vehicle {
    // Static counter for number of cars
    public static int numberOfCars = 0;

    // 1 (Static Array)
    private static String[] manufacturerName = {"Toyota", "BMW", "Ford", "Honda", "Mercedes"};

    public Car() {
        super();
        numberOfCars++;
    }

    @Override
    public String toString() {
        return "This is a Car object.";
    }

    //  (Static Method)
    public static int searchModel(String m) {
        // Search inside the array
        for (int i = 0; i < manufacturerName.length; i++) {
            // Use equalsIgnoreCase() as requested
            if (manufacturerName[i].equalsIgnoreCase(m)) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
}