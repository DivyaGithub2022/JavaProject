package test;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// also refer 'ForLoopExample.java as well
		String str1 = "Hello World";

		String result = "";

		for (int j = str1.length() - 1; j >= 0; j--) {
			// System.out.print(str1.charAt(j));
			result = result + str1.charAt(j);

		}
		System.out.println("Reversed string is " + result);

		// check String for the Palindrom
		String str2 = "Malayalam";

		String result1 = "";

		for (int i = str2.length() - 1; i >= 0; i--) {
			result1 = result1 + str2.charAt(i);
		}
		System.out.println("check");

		// ========to compare String========

		// when we do 'if(str2 == result1)' it compares the address of data stored in
		// the memory and not the exact string
		// if(str2.equals(result1))
		if (str2.equalsIgnoreCase(result1)) {
			System.out.println("The given string is Palendrome");
		} else
			System.out.println("The given string is not Palendrome");
		
		// ========Swap the words in the string========
		
		String str3 = "David meets John and Lilly";
		
		String[] arr = str3.split(" ");
		
		String result2 = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			
			result2 = result2 + arr[i] + " ";
		}
		System.out.println(result2.trim());

	}

}
