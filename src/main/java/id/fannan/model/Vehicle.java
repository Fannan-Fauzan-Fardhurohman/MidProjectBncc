package id.fannan.model;

public abstract class Vehicle {
    private String vehicleType;
    private String brand;
    private String name;
    private String licenseNumber;
    private int topSpeed;
    private int gasCap;
    private int wheel;

    public Vehicle(String vehicleType, String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.topSpeed = topSpeed;
        this.gasCap = gasCap;
        this.wheel = wheel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getGasCap() {
        return gasCap;
    }

    public void setGasCap(int gasCap) {
        this.gasCap = gasCap;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public abstract void showInfo();
}