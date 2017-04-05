/**
 * Create an class Employee with following properties and function
 */
/** @Creating abstract class */
public abstract class Employee {
	/** @Cariable declare */
	int empId;
	String empName;
	int total_leaves;
	double total_salary;

	/** @Creating constructor */
	Employee(int id, String name, int total, double sal) {
		empId = id;
		empName = name;
		total_leaves = total;
		total_salary = sal;
	}

	/** @Creating abstract method */
	abstract void calculate_balance_leaves();

	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);

	abstract void calculate_salary();
}