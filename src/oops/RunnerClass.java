package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.EmpId = 1000;
		emp1.Name = "Swetha";
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.EmpId = 1001;
		emp2.Name = "David";
		emp2.DisplayName();
		
		//calling the Employee class - parameterized constructor here and initializing the values
		Employee emp3 = new Employee("Surya", 1003); 
		emp3.DisplayName();
		//emp3.Salary= 50000;
		
		Employee.DisplaySal();
		
		//when salary is 'Public static int'
		//then anyone can change the Salary value outside of the class
		/*Employee.Salary = 60000;
		
		Employee.DisplaySal();*/

	}

}
