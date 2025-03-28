import java.util.Scanner;

class areacal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int choice,num1,num2;
		double res=0;
        System.out.println("Enter your choice to calculate area of : \n1.Rectangle\n2.Square\n3.circle :");
		choice = sc.nextInt();
		switch (choice) {
            case 1:
				System.out.print("Enter the first Side length: ");
				num1 = sc.nextInt();
				System.out.print("Enter the second Side length: ");
				num2 = sc.nextInt();
				res = num1*num2;
				System.out.println("the area of rectangel is: "+res);
				break;
            case 2:
				System.out.print("Enter the Side length: ");
				num1 = sc.nextInt();
				res = num1*num1;
				System.out.println("the area of square is: "+res);
				break;
            case 3:
				System.out.print("Enter the Radius: ");
				num1 = sc.nextInt();
				res = num1*num1*3.14;
				System.out.println("the area of circle is: "+res);
				break;
			default:
			System.out.println("Invalid Input");
		}
    }
}
