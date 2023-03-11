package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Divya";
		String name1 = "Kanhiyampurayidath is my last name";
		
		
		System.out.println("Number of chars in string is " + name1.length());
		System.out.println("the 4th character is " + name1.charAt(3));
		//not a good practice to give hard-coded values in the index place - ".charAt(index)"
		
		System.out.println("the last character is " + name1.charAt(name1.length()-1));
		
		System.out.println("the string in upper case is " + name1.toUpperCase());
		System.out.println("the string in upper case is " + name1.toLowerCase());

	}

}
