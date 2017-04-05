/** @main class */
public class Mj {
	/** @Main method */

	public static void main(String[] args) {
		/** @Creating object */
		Employee obj1 = new PermanentEmp(25, "Sakib", 24, 50000);
		/** @Output */
		System.out.println("Parmanent Employee detail.");
		/** @Calling id,name,no of leaves */
		System.out.println("Id  =" + obj1.empId);
		System.out.println("Name =" + obj1.empName);
		System.out.println("Leave =" + obj1.total_leaves);
		/** @Calling method */
		obj1.calculate_balance_leaves();
		obj1.avail_leave(21, (char) 0);
		obj1.calculate_salary();
		System.out.println("..................................");

		Employee obj2 = new TemporaryEmp(29, "Huzaifa", 20, 50001);
		System.out.println("Temporary Employee detail.");
		/** @Calling id,name,no of leaves */
		System.out.println("Id  =" + obj2.empId);
		System.out.println("Name =" + obj2.empName);
		System.out.println("Leave =" + obj2.total_leaves);
		/** @Calling method */
		obj1.calculate_balance_leaves();
		obj1.avail_leave(20, (char) 0);
		obj1.calculate_salary();

	}

}