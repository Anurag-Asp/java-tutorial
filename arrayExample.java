import java.util.Scanner;

class arrayExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        System.out.println("Enter the first 5 array element: ");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the second 5 array element: ");
        for(int i=0;i<5;i++){
            b[i] = sc.nextInt();
        }
        System.out.println("The value of third array elements are: ");
        for(int i=0;i<5;i++){
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
    }
}