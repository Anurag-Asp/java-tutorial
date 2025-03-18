import java.util.Scanner;

class ifdemo4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the number a :");
		a = sc.nextInt();
		System.out.println("Enter the number a :");
		b = sc.nextInt();
		System.out.println("Enter the number a :");
		c = sc.nextInt();
		
		if(a > b & a > c){
			System.out.println("the number a is greatest: "+a);
		}else if(b > a & b > c){
			System.out.println("the number b is greatest: "+b);
		}else{
			System.out.println("the number c is greatest: "+c);
		}
	}
}