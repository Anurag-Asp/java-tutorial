import java.util.Scanner;

class TableWhile{
	public static void main(String args[]){
		int n, i=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		while(i<=10){
			System.out.print(n+"X"+i);
			System.out.println("="+n*i);
			i++;
		}
	}
}