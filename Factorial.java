import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		int i, n, factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++){
			factorial=factorial*i;
		}
		System.out.print("The Factorial of "+ n +"number is "+factorial);
	}
}