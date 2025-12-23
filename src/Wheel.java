public class Wheel {
    private int size;
    private static String color;

    // Setters and Getters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Wheel.color = color;
    }
}