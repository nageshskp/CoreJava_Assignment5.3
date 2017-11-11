public abstract class Employee {


	int empId;



	String empName;



	int total_leaves;



	double total_Salary;



	Employee(int empId, String empName, int total_leaves, double total_Salary) {

		this.empId = empId;

		this.empName = empName;

		this.total_leaves = total_leaves;

		this.total_Salary = total_Salary;

	}



	abstract void calculate_balance_leaves();



	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);



	abstract void calculate_salary();

}