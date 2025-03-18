/* conditional statements 
To validate user input we need conditional statements 
1) if 
2)if...else 
3)if...else if...else 
syntax: 
if(test condition) 
{ 
//relational or comparision operator 
block of code; 
} 
*/
//WAP to welcome user on positive input. 
import java.util.Scanner;

class Ifdemo1{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		a = sc.nextInt();
		if(a>0){
			System.out.println("Welcome to world");
		}
	}
}