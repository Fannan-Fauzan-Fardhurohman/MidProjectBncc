package id.fannan.model;

public class Car extends Vehicle {
    private String type;
    private int entertainmentSystem;

    public Car(String vehicleType, String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel, String type, int entertainmentSystem) {
        super(vehicleType, brand, name, licenseNumber, topSpeed, gasCap, wheel);
        this.type = type;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public void setEntertainmentSystem(int entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }

    @Override
    public void showInfo() {
        System.out.println("Vehicle Type:" + getVehicleType());
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getName());
        System.out.println("License Number: " + getLicenseNumber());
        System.out.println("Top Speed: " + getTopSpeed());
        System.out.println("Gas Capacity: " + getGasCap());
        System.out.println("Wheel: " + getWheel());
        System.out.println("Type: " + getType());
        System.out.println("Entertainment System:" + getEntertainmentSystem());
    }

}
