class ForNat{
	public static void main(String args[]){
		int i, sum=0;
		for(i=1; i<=10; i++){
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println("The sum of first natural Numbers is" + sum);
	}
}