package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    // Fields
    private double weightKg;
    private String dimensions;

    // No-argument constructor
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(int id, String name, double price,
                           double weightKg, String dimensions) {

        super((long) id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public PhysicalProduct(Integer o, String laptop, double price, double weightKg, String dimensions) {
    }

    // Getters
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}