import java.util.*; 
class MaxArr{ 
	public static void main(String s[]){ 
		int max,i; 
		int a[]=new int[5]; 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter five elements"); 
		for(i=0;i<5;i++) { 
			a[i]=sc.nextInt(); 
		} 
		max=a[0]; 
		for(i=0;i<5;i++){ 
			if(a[i]>max) { 
				max=a[i]; 
			}
		}
		System.out.println("the max Number is "+ max);
	}
}