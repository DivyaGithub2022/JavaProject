package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 33;
		
		boolean flag = true;
		
		for(int i=2;i<number/2;i++) {
			
			int Remainder = number%i; //modular operator to get the Remainder
			
//			if (i==11) {
//				System.out.println("remainder is " + Remainder);
//			}
			if(Remainder == 0) {
				
				flag = false;
			}
			break;
		}
		if(flag = false) {
			System.out.println("This is not a Prime number");
		}else
			System.out.println("This is a Prime number");
		
	}

}
