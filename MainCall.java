import java.util.Scanner;

class AddDemo1{
	int a,b,sum;
	Scanner sc = new Scanner(System.in);
	public void accept(){
		System.out.println("Enter two number");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void display(){
		sum = a+b;
		System.out.println("The sum of two digit is: " + sum);
	}
}

class MainCall{
	public static void main(String srgs[]){
		AddDemo1 obj = new AddDemo1();
		obj.accept();
		obj.display();
	}
}