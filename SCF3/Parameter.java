import java.util.Scanner;

/*Program to get the input value ad check its end cases
 * @return -1 if input is not valid
 * @return data if input is valid
 * */
public class Parameter {

	public int getParam() {
		Scanner input = new Scanner(System.in);
		int data; // input variable
		try {
			data = input.nextInt();
		} catch (Exception ex) {
			System.out.println("************************");
			System.out.println("Enter the valid input");
			System.out.println("************************");
			return -1;
		}
		if (data <= 0) {
			System.out.println("************************");
			System.out.println("Enter the valid input");
			System.out.println("************************");
			return -1;
		}
		return data;
	}

	public static void main(String[] args) {

	}
}
