package seatAllocationSystem;

/*@author Prakhar Golania
 * Class to store the student choices
 * */
public class Student {

	private String name;
	private String[] preferedCourses;

	public Student(String stuName, String[] stuCourses){
		this.name = stuName;
		this.preferedCourses = stuCourses;
	}

	public String getName() {
		return name;
	}

	public String[] getPreferedCourses() {
		return preferedCourses;
	}
}
