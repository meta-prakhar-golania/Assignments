package employee;

import java.util.Collections;
import java.util.LinkedList;

/*@author Prakhar Golania
 * Main class 
 * */
public class EmployeeMain {
	public static LinkedList<EmployeeDetail> listOfEmp = new LinkedList<EmployeeDetail>(); 
	  
	/*function to add employee
	 * @param empId,empName,empAddress 
	 * */
	public static void addEmployee( String empName,int salary, int age){
		EmployeeDetail emp = new EmployeeDetail(empName,salary, age);
		listOfEmp.add(emp);
		System.out.println(EmployeeDetail.add);
	}
	
	/*function to display employee list
	 * */
	public static void displayEmployeeList(){
		System.out.println("\n\nEmp Name.\t"+"Emp Salary\t"+"Emp. Age");
		for(int i=0;i<listOfEmp.size();i++){
			System.out.println(listOfEmp.get(i).getEmpName()+"\t\t"+listOfEmp.get(i).getEmpSalary()+"\t\t"+listOfEmp.get(i).getEmpAge());
		}
	}
	
	/*function to display employee list sorted by salary
	 * */
	public static void sortEmpList(){
		for(int i=1;i<listOfEmp.size();i++){
			for(int j=1;j<listOfEmp.size();j++)
				if(listOfEmp.get(j-1).getEmpSalary()<listOfEmp.get(j).getEmpSalary()){
					Collections.swap(listOfEmp, j, j-1);
				}
		}
		
		for(int i=1;i<listOfEmp.size();i++)
		for(int j=1;j<listOfEmp.size();j++)
			if(listOfEmp.get(j-1).getEmpSalary() == listOfEmp.get(j).getEmpSalary()){
				if(listOfEmp.get(j-1).getEmpAge()<listOfEmp.get(j).getEmpSalary()){
					Collections.swap(listOfEmp, j, j-1);
				}
			}

		displayEmployeeList();
	}

	public static void main(String[] args){
		EmployeeMain.addEmployee("prakhar", 20000, 22);
		EmployeeMain.addEmployee("mukul", 23000, 25);
		EmployeeMain.addEmployee("rahul", 98000, 25);
		EmployeeMain.addEmployee("abhay", 120000, 21);
		EmployeeMain.addEmployee("uday", 19000, 27);
		EmployeeMain.addEmployee("rohit", 10000, 29);
		EmployeeMain.addEmployee("shubham", 23000, 20);
		EmployeeMain.addEmployee("vishal", 25000, 26);
		EmployeeMain.displayEmployeeList();
		System.out.println("----------------");
		EmployeeMain.sortEmpList();
	}
}

