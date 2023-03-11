package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print 1 to 10 using loop

		for (int num = 0; num < 10; num++) {

			System.out.println(num);
		}

		System.out.println("End of For loop");

		// Print 10 to 1 using loop

		for (int num1 = 10; num1 > 0; num1 -= 2) {

			System.out.println(num1);
		}

		System.out.println("End of SECOND For loop");

		/*
		 * output - decrement by 2 for(int num1=10;num1>0;num1-=2) 10 8 6 4 2 End of
		 * SECOND For loop
		 */

		/*
		 * output- decrement by 3 for(int num1=10;num1>0;num1-=3) 10 7 4 1 End of SECOND
		 * For loop
		 */

	//array in for loop

	int[] arr1 = {2,4,7,45,23,6}; // array index starts from 0

	for(
	int i = 0;i<arr1.length;i++)
	{

		System.out.println("Element value is " + arr1[i]);
	}

	// for each loop - can be used for Arrays only
	//- if you don't have any condition and want to print all values in the array then use this
	for(int val:arr1)
	{
		System.out.println("Value is " + val);
	}
	
	// to print letters from a string 
	String str1 = "John";
	
	for(int i=0;i<str1.length();i++) {
		System.out.println("Char value at place " +i+ " is "+str1.charAt(i));
	}
	
	//String reverse
	System.out.println("String reverse");
	for(int j=str1.length()-1;j>=0;j--) {
		System.out.print(str1.charAt(j));  //println - prints the result in new line

	}
	
	}
}

/*
 * System.out.println("Table of 2");
 * 
 * int num=2; for(int i=1;i<11;i++) { 
 * System.out.println(num*i);
 * System.out.printf("%d * %d = %d \n" , num , i, num*i); }
 * System.out.println("End Table of 2");
 */
