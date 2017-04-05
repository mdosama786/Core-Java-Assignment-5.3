/** @Inherit */
public class PermanentEmp extends Employee {

	/** @Constructor declare */
	PermanentEmp(int id, String name, int total, double sal) {
		super(id, name, total, sal);
	}

	/** @Variable initialization */
	int paid_leave = 7, sick_leave = 5, casual_leave = 2;
	double basic = 10000, hra = 4000, pfa = 1000;

	/** @Method declare */
	void print_leave_details() {
		/** @Output */
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}

	@Override
	void calculate_balance_leaves() {
		/** @Calculation */
		int total = total_leaves - (paid_leave + sick_leave + casual_leave);
		/** @Output */
		System.out.println("Leave Balance =" + total);
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		/** @if condition */
		if (no_of_leaves < total_leaves)
			return true;
		else
			return false;
	}

	@Override
	void calculate_salary() {
		/** @Calculation */
		double hra = .5f * basic;
		double da = .2f * basic;
		double totalSalary = total_salary + (hra + da) - pfa;
		/** @OutputF */
		System.out.println("Salary =" + totalSalary);
	}
}