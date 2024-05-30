public class Cylinder {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return this.height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }
}