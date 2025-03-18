/* to repeate particular block of code again and again we are using loop concept 
there are three types of loops: 
1) for 
2) while 
3)do...while(Exit loop) 
syntax:1 for (initialization; test condition; inc/dec) 
{ 
block of code; 
} 
*/
//WAP to print hello world 10 times

class fordemo1{
	public static void main(String args[]){
		int i;
		for (i=1 ;i<=10;i++){
			System.out.println("hello world " + i);
		}
	}
}