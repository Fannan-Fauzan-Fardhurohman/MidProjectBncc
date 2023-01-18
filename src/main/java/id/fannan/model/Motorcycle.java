package id.fannan.model;

public class Motorcycle extends Vehicle {
    private String type;
    private int helmet;

    public Motorcycle(String vehicleType,String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel, String type, int helmet) {
        super(vehicleType,brand, name, licenseNumber, topSpeed, gasCap, wheel);
        this.type = type;
        this.helmet = helmet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHelmet() {
        return helmet;
    }

    public void setHelmet(int helmet) {
        this.helmet = helmet;
    }

    @Override
    public void showInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getName());
        System.out.println("License Number: " + getLicenseNumber());
        System.out.println("Top Speed: " + getTopSpeed());
        System.out.println("Gas Capacity: " + getGasCap());
        System.out.println("Wheel: " + getWheel());
        System.out.println("Type: " + getType());
        System.out.println("Helmet: " + getHelmet());
    }
}