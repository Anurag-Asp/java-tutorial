import java.util.Scanner;


class Demo3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int team1Score;
		int team2Score;
		System.out.println("Enter first team score ");
		team1Score = sc.nextInt();
		System.out.println("Enter second team score ");
		team2Score = sc.nextInt();
		
		if(team1Score > team2Score){
			System.out.println("Team 1 is the winner");
		}else if(team1Score == team2Score){
			System.out.println("The Match is a Draw");
		}else{
			System.out.println("Team 2 is the winner");
		}
	}
}