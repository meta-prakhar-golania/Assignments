package employee;

/*Driver class for employee list
 * @author Prakhar Golania
 *
 */
public class EmployeeOperation {

	public static void main(String[] args){
		EmployeeList.addEmployee("prakhar", 20000, 22);
		EmployeeList.addEmployee("mukul", 23000, 25);
		EmployeeList.addEmployee("rahul", 98000, 25);
		EmployeeList.addEmployee("abhay", 120000, 21);
		EmployeeList.addEmployee("uday", 19000, 27);
		EmployeeList.addEmployee("rohit", 10000, 29);
		EmployeeList.addEmployee("shubham", 23000, 20);
		EmployeeList.addEmployee("vishal", 25000, 26);
		EmployeeList.displayList();
		System.out.println("----------------");
		EmployeeList.sortList();
		EmployeeList.displayList();
	}
}
