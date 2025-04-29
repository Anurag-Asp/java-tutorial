import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (type -1 to stop):");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Exiting loop...");
                break; 
            }
            System.out.println("You entered: " + number);
        }

        scanner.close();
    }
}