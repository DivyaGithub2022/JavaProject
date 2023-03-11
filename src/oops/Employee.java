package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	private int Sal;
	
	private static int Salary = 50000;
	
	//Default constructor - if there is a parameterized constructor then there should be a default constructor as well.
	public Employee() {
		
		System.out.println("Inside the default constructor");
	}
	
	//Constructor - this is a parameterized constructor
	public Employee(String Name, int var2) {
		
		System.out.println("Inside the Parameterized constructor");
		
		this.Name = Name; //this.Name is the Class variable which can be accessed throughout inside the class while the function variable Name will be alive only during the function in called.
		this.EmpId = var2;
	}
	
	public void DisplayName(){
		
		System.out.println("Name of the Employee is " + Name);
	}
	
	public static void DisplaySal() {
		System.out.println("Salary of the Employee " + Salary);
	}

}
