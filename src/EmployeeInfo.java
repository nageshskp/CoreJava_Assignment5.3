public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmp emp1 = new PermanentEmp(1, "Ram", 15, 0, 15000, 1, 3, 6);


		Employee emp2 = new TemporaryEmp(2, "Sham", 12, 15000);


		System.out.println("Employee Id: " + emp1.empId + "\n" + "Employee Name: " + emp1.empName + "\n"
				+ "Total leaves Allowed: " + emp1.total_leaves + "\n" + "Basic salary is " + emp1.basic);


		emp1.print_leave_details();


		emp1.avail_leave(5, 's');


		emp1.calculate_salary();


		System.out.println();
		System.out.println("Employee Id: " + emp2.empId + "\n" + "Employee Name: " + emp2.empName + "\n"
				+ "Total leaves Allowed: " + emp2.total_leaves);

		
		emp2.calculate_balance_leaves();


		emp2.calculate_salary();


	}

}