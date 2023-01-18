package id.fannan.run;

import id.fannan.model.Car;
import id.fannan.model.Motorcycle;
import id.fannan.model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                input.nextLine();
                System.out.print("Tipe Kendaraan (Car / Motorcycle): ");
                String vehicleType = input.nextLine();
                System.out.print("Brand: ");
                String brand = input.nextLine();
                if (brand.length() < 5) {
                    System.out.println("Brand minimal 5 character");
                    continue;
                }
                System.out.print("Name: ");
                String name = input.nextLine();
                if (name.length() < 5) {
                    System.out.println("Name minimal 5 character");
                    continue;
                }

                System.out.print("License Number (A-Z 1-4 digit 0-9 A-Z): ");
                String licenseNumber = input.nextLine();
                if (!licenseNumber.matches("[A-Z] [0-9]{1,4} [A-Z]{1,3}")) {
                    System.out.println("License Number tidak valid");
                    continue;
                }

                System.out.print("Top Speed (100-250): ");
                int topSpeed = input.nextInt();
                if (topSpeed < 100 || topSpeed > 250) {
                    System.out.println("Top Speed tidak valid");
                    continue;
                }

                System.out.print("Gas Capacity (30-60): ");
                int gasCap = input.nextInt();
                if (gasCap < 30 || gasCap > 60) {
                    System.out.println("Gas Capacity tidak valid");
                    continue;
                }

                System.out.print("Wheel (Motorcycle: 2-3, Car: 4-6): ");
                int wheel = input.nextInt();

                if (vehicleType.equalsIgnoreCase("car") && (wheel < 4 || wheel > 6)) {
                    System.out.println("Jumlah wheel untuk Car minimal 4 dan maksimal 6");
                    continue;
                } else if (vehicleType.equalsIgnoreCase("motorcycle") && (wheel < 2 || wheel > 3)) {
                    System.out.println("Jumlah wheel untuk Motorcycle minimal 2 dan maksimal 3");
                    continue;
                }

                if (vehicleType.equalsIgnoreCase("car")) {
                    System.out.print("Jenis Tipe Kendaraan (SUV / Supercar / Minivan): ");
                    String type = input.next();
                    System.out.print("Entertainment System (minimal 1): ");
                    int entertainmentSystem = input.nextInt();
                    if (entertainmentSystem < 1) {
                        System.out.println("Jumlah Entertainment System minimal 1");
                        continue;
                    }
                    Car car = new Car(vehicleType, brand, name, licenseNumber, topSpeed, gasCap, wheel, type, entertainmentSystem);
                    if (vehicleType.equalsIgnoreCase("Supercar")) {
                        car.useNitro();
                    }
                    vehicles.add(car);
                    car.turnOnEntertainmentSystem();
                } else if (vehicleType.equalsIgnoreCase("motorcycle")) {
                    System.out.print("Jenis Tipe Kendaraan (Automatic / Manual): ");
                    String type = input.next();
                    System.out.print("Jumlah Helm (minimal 1): ");
                    int helmet = input.nextInt();
                    if (helmet < 1) {
                        System.out.println("Jumlah Helm minimal 1");
                        continue;
                    }
                    Motorcycle motorcycle = new Motorcycle(vehicleType, brand, name, licenseNumber, topSpeed, gasCap, wheel, type, helmet);
                    vehicles.add(motorcycle);
                    motorcycle.stand();
                } else {
                    System.out.println("Tipe kendaraan tidak valid");
                }
            } else if (menu == 2) {
                if (vehicles.size() == 0) {
                    System.out.println("+------+------------+----------------+");
                    System.out.println("| No.  |   Brand    |     Name       |");
                    System.out.println("+------+------------+----------------+");
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.printf("| %-4d | %-10s | %-14s |\n", i + 1, vehicles.get(i).getVehicleType(), vehicles.get(i).getName());
                    }
                    System.out.println("+------+------------+----------------+");
                } else {
                    System.out.println("+------+------------+----------------+");
                    System.out.println("| No.  |   Brand    |     Name       |");
                    System.out.println("+------+------------+----------------+");
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.printf("| %-4d | %-10s | %-14s |\n", i + 1, vehicles.get(i).getVehicleType(), vehicles.get(i).getName());
                    }
                    System.out.println("+------+------------+----------------+");
                    System.out.print("Masukkan nomor untuk melihat informasi kendaraan: ");
                    int vehicleNumber = input.nextInt();
                    if (vehicleNumber > 0 && vehicleNumber <= vehicles.size()) {
                        vehicles.get(vehicleNumber - 1).showInfo();

                        System.out.println();
                    } else {
                        System.out.println("Nomor kendaraan tidak valid");
                    }
                }

            } else {
                System.out.println("Menu tidak valid");
            }
        }
    }
}