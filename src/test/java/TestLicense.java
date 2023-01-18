import java.util.Scanner;

public class TestLicense {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String licenseNumber = input.next();
            if (licenseNumber.matches("[A-Z] [0-9]{4} [A-Z]{3}")) {
                System.out.println("License Number tidak valid");
        }
    }
}
