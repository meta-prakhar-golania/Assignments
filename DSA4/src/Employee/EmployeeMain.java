package Employee;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*@author Prakhar Golania
 * Main class 
 * */
public class EmployeeMain {
	public static LinkedList<EmployeeDetail> listOfEmp = new LinkedList<EmployeeDetail>(); 
	  
	/*function to add employee
	 * @param empId,empName,empAddress 
	 * */
	public static void addEmployee(int empId, String empName, String empAddress){
		EmployeeDetail emp = new EmployeeDetail(empId,empName, empAddress);
		listOfEmp.add(emp);
		System.out.println(EmployeeDetail.add);
	}
	
	/*function to display employee list
	 * */
	public static void displayEmployeeList(){
		System.out.println("\n\nEmp Id.\t"+"Emp Name\t"+"Emp. Address");
		for(int i=0;i<listOfEmp.size();i++){
			System.out.println(listOfEmp.get(i).getEmpId()+"\t"+listOfEmp.get(i).getEmpName()+"\t\t"+listOfEmp.get(i).getEmpAddress());
		}
	}
	
	/*function to display employee list sorted by id
	 * */
	public static void displayEmployeeListById(){
		for(int i=1;i<listOfEmp.size();i++){
			for(int j=1;j<listOfEmp.size();j++)
				if(listOfEmp.get(j-1).getEmpId()>listOfEmp.get(j).getEmpId()){
					Collections.swap(listOfEmp, j, j-1);
			}
		}
		displayEmployeeList();
	}
	
	/*function to display employee list sorted by name
	 * */
	public static void displayEmployeeListByName(){
		for(int i=1;i<listOfEmp.size();i++){
			for(int j=1;j<listOfEmp.size();j++)
				for(int k=1;k<listOfEmp.size();k++){
					if(listOfEmp.get(j-1).getEmpName().charAt(k)>listOfEmp.get(j).getEmpName().charAt(k)){
						Collections.swap(listOfEmp, j, j-1);
						break;
					}
					else if(listOfEmp.get(j-1).getEmpName().charAt(k)==listOfEmp.get(j).getEmpName().charAt(k)){
						continue;
					}
					else{
						break;
					}
				}
		}
		displayEmployeeList();
	}
	
	public static boolean isIdAvailable(int id){
		for(int i=0;i<listOfEmp.size();i++){
			if(id==listOfEmp.get(i).getEmpId() || id<1){
				System.out.println(EmployeeDetail.idNotAvailable);
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		char choice='y';
		String name,address;
		int empId;
		boolean check=true;
		Scanner input = new Scanner(System.in);
		while(choice=='y'){
			System.out.println("Enter the Employee Detail:");
			System.out.println("Enter the Employee Id:");
			try{
				empId=input.nextInt();
			check=isIdAvailable(empId);
			if(check==true){
				System.out.println("Enter the Employee name:");
				name=input.next();
				System.out.println("Enter the Employee address");
				address=input.next();
				addEmployee(empId,name,address);
				System.out.println("Do yo want to enter more employee(Enter y for yes)");
				choice=input.next().charAt(0);
			}
			}catch(Exception e){
				System.out.println(EmployeeDetail.wrongEntry);
				input.nextLine();
			}
		}
		displayEmployeeList();
		displayEmployeeListById();
		displayEmployeeListByName();
		
	}

}

