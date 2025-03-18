import java.util.Scanner;

class armstrongNumber {
	public static void main(String args[]){
		int n, sum=0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check : ");
		n = sc.nextInt();
		temp =n;
		while(n>0){
			rem = n%10;
			n=n/10;
			sum =  sum+(rem*rem*rem);
		}
		if (temp==sum){
			System.out.println("The number is a armstrong number");
		}
		else{
			System.out.println("The number is not a armstrong ");

		}
	}
}