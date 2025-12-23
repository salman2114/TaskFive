public class Main {
    public static void main(String[] args) {

        // 1. Print the initial number of cars
        System.out.println("Initial number of cars: " + Car.numberOfCars);

        // 2. Declare Car[] carArr = new Car[3];
        Car[] carArr = new Car[3];

        // 3. Assign objects
        // 4. carArr[0] = new VanCar();
        carArr[0] = new VanCar();

        // 5. carArr[1] = new SportCar();
        // Using constructor with arguments to demonstrate functionality
        carArr[1] = new SportCar(2023, 888);

        // 6. carArr[2] = new VanCar();
        carArr[2] = new VanCar();

        // 7. Invoke toString() on the first element
        System.out.println(carArr[0].toString());

        // 8. Change the color of all wheels to "gray"
        Wheel.setColor("gray");

        // Additional testing to demonstrate functionality described in methods
        System.out.println("\n--- Testing Descriptions ---");
        for (Car car : carArr) {
            car.describeCar();
        }

        // --- New Requirement: Test searchModel method ---
        System.out.println("\n--- Testing Search Model ---");

        // Calling static method using Class Name (Car)
        int index = Car.searchModel("Honda");

        if (index != -1) {
            System.out.println("Result: 'Honda' found at index: " + index);
        } else {
            System.out.println("Result: 'Honda' not found.");
        }

        // Print final number of cars
        System.out.println("\nFinal number of cars: " + Car.numberOfCars);
    }
}