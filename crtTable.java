import java.util.Scanner;

class crtTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("Enter the Number to print the table ");
		n = sc.nextInt();
		for(i=1;i<=10;i++){
			System.out.println(n*i);
		}		
	}
}