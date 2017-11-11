public class PermanentEmp extends Employee {



	int paid_leave, sick_leave, casual_leave;



	double basic, hra, pfa;



	PermanentEmp(int empId, String empName, int total_leaves, double total_Salary, double basic, int paid_leave,
			int sick_leave, int casual_leave) {

		super(empId, empName, total_leaves, total_Salary);


		this.basic = basic;

		this.paid_leave = paid_leave;

		this.sick_leave = sick_leave;

		this.casual_leave = casual_leave;

	}


	void calculate_balance_leaves() {



		int balance_leaves = total_leaves - sick_leave - casual_leave - paid_leave;

		System.out.println("Balance leave for " + empName + " is " + balance_leaves);


	}


	boolean avail_leave(int no_of_leaves, char type_of_leave) {

		if (no_of_leaves > total_leaves) {
			return false;
		} else {
			return true;
		}
	}


	void calculate_salary() {

		pfa = 12 * basic / 100;

		hra = 50 * basic / 100;

		total_Salary = basic + hra - pfa;


		System.out.println("Salary after pf and hra is " + total_Salary);
		

	}

	

	public void print_leave_details() {

		System.out.println("Total Leaves Allowed: " + total_leaves);
		

		calculate_balance_leaves();

	}

}