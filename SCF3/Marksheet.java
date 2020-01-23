import java.util.Scanner;

/*Program to calculate average, max. marks
 * min. marks, percent of student pass
 * @author Prakhar Golania  
 * */
public class Marksheet {
	/*
	 * Function to calculate average marks of students
	 * 
	 * @param grade[] is array of marks obtained by students
	 * 
	 * @param n is the no. of students
	 * 
	 * @return average marks as avg/n
	 */
	public float average(int grade[], int n) {
		float avg = 0;
		for (int i = 0; i < n; i++)
			avg = avg + grade[i];
		return avg / n;
	}

	/*
	 * Function to calculate max. obtained marks
	 * 
	 * @param grade[] is array of marks obtained by students
	 * 
	 * @param n is the no. of students
	 * 
	 * @return mx is use to return max. marks
	 */
	public float max(int grade[], int n) {
		float mx = grade[0];
		for (int i = 1; i < n; i++) {
			if (mx < grade[i])

				mx = grade[i];
		}
		return mx;
	}

	/*
	 * Function to calculate min. obtained marks
	 * 
	 * @param g[] is array of marks obtained by students
	 * 
	 * @param n is the no. of students
	 * 
	 * @return mn is use to return min. marks
	 */
	public float min(int grade[], int n) {
		float mn = grade[0];
		for (int i = 1; i < n; i++) {
			if (mn > grade[i]) {
				mn = grade[i];
			}
		}
		return mn;
	}

	/*
	 * Function to percentage of students pass
	 * 
	 * @param g[] is array of marks obtained by students
	 * 
	 * @param n is the no. of students
	 * 
	 * @return perc is use to return percentage of student pass
	 */
	public float perOfStudPass(int grade[], int n) {
		float perc;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (grade[i] > 40) {
				count++;
			}
		}
		perc = count * 100 / n;
		return perc;
	}

	public static void main(String[] args) {
		Parameter p = new Parameter();
		Marksheet m = new Marksheet();
		Scanner input = new Scanner(System.in);
		int grade[] = new int[10];
		int numberOfStud;
		while (true) {
			while (true) {
				System.out.println("\nEnter the no. of students:");
				numberOfStud = p.getParam();
				if (numberOfStud == -1)
					continue;
				break;
			}
			for (int i = 0; i < numberOfStud;) {
				while (true) {
					System.out.println("Enter the grade of student no. "+ (i + 1) + ":");
					grade[i] = p.getParam();
					if (grade[i] == -1) {
						continue;
					}
					i++;
					break;
				}
			}

			break;

		}
		float avg = m.average(grade, numberOfStud);
		float maxM = m.max(grade, numberOfStud);
		float minM = m.min(grade, numberOfStud);
		float studentPass = m.perOfStudPass(grade, numberOfStud);
		System.out.println("\nThe average marks of the students is "+ String.format("%,.2f", avg));
		System.out.println("\nThe maximum marks is "+ String.format("%,.2f", maxM));
		System.out.println("\nThe minimum marks is "+ String.format("%,.2f", minM));
		System.out.println("\nThe percentage of student pass is "+ String.format("%,.2f", studentPass));
		input.close();
	}

}
