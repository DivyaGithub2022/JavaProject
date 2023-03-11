package test;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		//int result = num1+num2;
		
		int result = subtraction(num1,num2);
		
		System.out.println("The sum is : " + result);
/*datatype decides the action to be taken by the + symbol - 
in line11 int takes care of summing up the numbers while 
in line 13 sysout command takes care of string concatenation in the output print.*/
		
	}
	
	public static int addition (int a, int b) {
		
		return a+b;
	}
	
	public static int subtraction (int a, int b) {
		
		return a-b;
	}

}
