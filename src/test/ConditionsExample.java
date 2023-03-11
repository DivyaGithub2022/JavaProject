package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int age = 16; boundary value analysis - 17-1, 17 and 17+1
		//int age = 17;
		//int age = 18;
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Enter the Age ");
		
		age = scanner.nextInt();
		
		if(age<17) {
			
			System.out.println("you are not eligible for voting");
		}else if(age==17) {
			
			System.out.println("you will be eligible for voting next year");
		}else
			
			System.out.println("You are eligible for voting");
		
		
		//-----------
		
		int age1 = age;
		
		if(age1>=30 || age1<18) {  //here it cannot be AND (&&) condition because Age cannot be satisfying both the conditions
		//OR (||) condiion - it'll execute if any of the condition satisfies
		//AND (&&) condiion - it'll execute only if both of the condition satisfies
			
		System.out.println("You are not eligible to write the Bank Exams");

	}else
		
		System.out.println("You are eligible for Bank exam appearance");

}
}
