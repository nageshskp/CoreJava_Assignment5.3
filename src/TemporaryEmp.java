public class TemporaryEmp extends Employee {



	int no_of_leaves;



	TemporaryEmp(int empId, String empName, int total_leaves, double total_Salary) {

		super(empId, empName, total_leaves, total_Salary);


	}


	void calculate_balance_leaves() {


		int balance_leaves = total_leaves - no_of_leaves;

		System.out.println("Balance leave for " + empName + " is " + balance_leaves);


	}


	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		this.no_of_leaves = no_of_leaves;

		if (no_of_leaves > total_leaves) {
			return false;
		} else {
			return true;
		}

	}


	void calculate_salary() {

		System.out.println("Total salary for " + empName + " is " + total_Salary);


	}

}
