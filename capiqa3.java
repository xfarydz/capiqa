public class Sphere {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
}
public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());
    }
}