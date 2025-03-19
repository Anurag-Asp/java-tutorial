import java.util.Scanner;

class switchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        

        int result = 0,num1, num2;
        switch (choice) {
            case 1:
		System.out.print("Enter the first number: ");
        	num1 = scanner.nextInt();
        	System.out.print("Enter the second number: ");
        	num2 = scanner.nextInt();
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case 2:
		System.out.print("Enter the first number: ");
        	num1 = scanner.nextInt();
        	System.out.print("Enter the second number: ");
        	num2 = scanner.nextInt();
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
		System.out.print("Enter the first number: ");
        	num1 = scanner.nextInt();
        	System.out.print("Enter the second number: ");
        	num2 = scanner.nextInt();
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case 4:
		System.out.print("Enter the first number: ");
        	num1 = scanner.nextInt();
        	System.out.print("Enter the second number: ");
        	num2 = scanner.nextInt();
                System.out.println("Result of division: " + result);
               
                break;
            default:
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
                break;
        }

        scanner.close();
    }
}