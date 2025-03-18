import java.util.Scanner;

class sumofDigit{
	public static void main(String args[]){
		int n, sum=0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to sum of digits: ");
		n = sc.nextInt();
		while(n>0){
			rem = n%10;
			n=n/10;
			sum =  sum+rem;
		}
		System.out.println("the sum of digits are "+ sum);
	}
}