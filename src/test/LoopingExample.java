package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int num3 = 1;
		
		int i = num++;
		int j = ++num3;
		
		System.out.println(i);
		System.out.println(j);
		
		//print 1 to 10 using loop
		while(num<11) {
			
			System.out.println(num);
			num++;
		}
		
		System.out.println("End of first while loop");
		
		//print 10 to 1 using loop
		
		int num1 = 10;
		
		while (num1>0) {
			
			if (num1==5) {
				
				System.out.println("skip");
				num1--;
				//continue;
				//break;
			}
			
			System.out.println(num1);
			num1--;
		}
		System.out.println("End of second loop");
	}

}
