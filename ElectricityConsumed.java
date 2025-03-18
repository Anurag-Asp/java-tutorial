import java.util.Scanner;

class ElectricityConsumed{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int unitsConsumed;
		int totoalAmount;
		System.out.println("Enter the number of unit consumed :");
		unitsConsumed = sc.nextInt();
		
		if(unitsConsumed <= 100){
			totoalAmount = (unitsConsumed * 10);
			System.out.println("the total ammout for unit consumed is "+totoalAmount);
		}else if(unitsConsumed <= 200){
			totoalAmount = (100*10) + (unitsConsumed * 15);
			System.out.println("the total ammout for unit consumed is "+totoalAmount);
		}else if(unitsConsumed <= 300){
			totoalAmount = (100*10) + (100*15) + (unitsConsumed * 20);
			System.out.println("the total ammout for unit consumed is "+totoalAmount);
		}else{
			totoalAmount= (100*10) + (100*15) + (100*20) + (unitsConsumed * 25);
			System.out.println("the total ammout for unit consumed is "+totoalAmount);
		}
	}
}