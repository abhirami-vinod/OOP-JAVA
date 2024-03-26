import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Abhirami Vinod\n 23MCA002\n 26-FEB-2024\n");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        scanner.close();
    }
}


