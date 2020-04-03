package employee;

/*@author Prakhar Golania
 * Class having details of employee
 * */
public class EmployeeDetail {
	int salary;
	String empName;
	int age;
	EmployeeDetail( String name,int salary, int age){
		this.salary=salary;
		this.empName=name;
		this.age=age;
	}
	public int getEmpSalary(){
		return this.salary;
	}
	
	public String getEmpName(){
		return this.empName;
	}
	
	public int getEmpAge(){
		return this.age;
	}
	
	static String add="*****Employee added sucessfully*****";
	
}
