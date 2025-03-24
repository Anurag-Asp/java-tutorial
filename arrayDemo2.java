import java.util.Scanner;

class arrayDemo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] Marks = new int[5];
        System.out.println("Entered Marks : ");
        for (int i=0;i<5;i++){
            Marks[i]=sc.nextInt();
        }
        System.out.println("You have entered: ");
        for (int i=0;i<5;i++){
            System.out.println(Marks[i]);
        }
    }
}