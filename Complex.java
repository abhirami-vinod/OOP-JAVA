import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        // Adding the complex numbers
        double sumReal = real1 + real2;
        double sumImaginary = imaginary1 + imaginary2;

        // Displaying the result
        System.out.println("Sum of the complex numbers: " + sumReal + " + " + sumImaginary + "i");

        scanner.close();
    }
}
