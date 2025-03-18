import java.util.Scanner;

class RevWhile{
	public static void main(String args[]){
		int n, rev=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		n = sc.nextInt();
		while(n>0){
			rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		System.out.println("the reverse of the number is "+rev);
	}
}