package Employee;

/*@author Prakhar Golania
 * Class having details of employee
 * */
public class EmployeeDetail {
	int empId;
	String empName;
	String empAddress;
	EmployeeDetail(int empId, String name, String address){
		this.empId=empId;
		this.empName=name;
		this.empAddress=address;
	}
	public int getEmpId(){
		return this.empId;
	}
	
	public String getEmpName(){
		return this.empName;
	}
	
	public String getEmpAddress(){
		return this.empAddress;
	}
	
	static String add="*****Employee added sucessfully*****";
	static String idNotAvailable="**********Employee Id not Available*********";
	static String wrongEntry="******Invalid Input*********";
}
