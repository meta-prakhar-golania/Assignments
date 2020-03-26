package seatAllocationSystem;

/*@author Prakhar Golania
 * Class to store the program alloted by school
 * */
public class Program {

	private String course;
	private int capacity;

	public Program(String course, int capacity) {
		this.course = course;
		this.capacity = capacity;
	}

	public String getCourse() {
		return course;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
}
