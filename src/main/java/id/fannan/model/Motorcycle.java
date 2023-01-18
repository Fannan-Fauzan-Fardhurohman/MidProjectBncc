package id.fannan.model;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    private String type;
    private int helmet;

    private int price;


    public Motorcycle(String vehicleType, String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel, String type, int helmet) {
        super(vehicleType, brand, name, licenseNumber, topSpeed, gasCap, wheel);
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        stand();
        priceCalculate();
    }


    public void stand() {
        System.out.println(getName() + " is standing!");
    }

    public void priceCalculate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Price : ");
        int price = input.nextInt();
        setPrice(price);
        System.out.println("Price : " + getPrice());

}
}