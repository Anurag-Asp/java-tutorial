class FuncDemo1{
	static void greet(){
		System.out.println("Hello Everyone !!!");
	}
	public void sayHi(){
		System.out.println("HI Public!!!");
	}
	public static void main(String args[]){
		greet();
		FuncDemo1 obj = new FuncDemo1();
		obj.sayHi();
	}
}