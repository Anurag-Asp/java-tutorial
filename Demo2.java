import java.util.Scanner;


class Demo2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter your age");
		a = sc.nextInt();
		if(a>=18){
			System.out.println("you can vote");
		}else{
			System.out.println("you cannot vote");
		}
	}
}