import java.util.Scanner;

/*Program to calculate different areas
 * @author Prakhar Golania
 * */
public class Area {

	/*
	 * Function to calculate area of triangle
	 * 
	 * @param width is use to get width of triangle
	 * 
	 * @param height is use to get height of triangle
	 * 
	 * @return ar is use return calculated area
	 */
	public double triArea(double width, double height) {
		double ar;
		ar = 0.5 * width * height;
		return ar;
	}

	/*
	 * Function to calculate area of rectangle
	 * 
	 * @param width is use to get width of rectangle
	 * 
	 * @param height is use to get height of rectangle
	 * 
	 * @return ar is use return calculated area
	 */
	public double rectArea(double width, double height) {
		double ar;
		ar = width * height;
		return ar;
	}

	/*
	 * Function to calculate area of square
	 * 
	 * @param width is use to get width of square
	 * 
	 * @return ar is use return calculated area
	 */
	public double sqrArea(double width) {
		double ar;
		ar = width * width;
		return ar;
	}

	/*
	 * Function to calculate area of cicle
	 * 
	 * @param radius is use to get radius of circle
	 * 
	 * @return ar is use return calculated area
	 */
	public double cirArea(double radius) {
		double ar;
		ar = 3.14 * radius * radius;
		return ar;
	}

	public static void main(String[] args) {
		Parameter p = new Parameter();
		Area a = new Area();
		double width, height, radius;
		Scanner input = new Scanner(System.in);
		int choice = 0;
		while (true) {

			while (true) {
				System.out.println("---Which area you want to calculate---");
				System.out
						.println("Press\n1.For triangle\n2.For rectangle\n3.For square\n4.For circle \n5.For exit");
				choice = p.getParam();
				if (choice != -1)
					break;
			}
			switch (choice) {

			case 1:
				while (true) {
					System.out.println("Enter the width of triangle:");
					width = p.getParam();
					if (width == -1)
						continue;
					System.out.println("Enter the heigth of triangle:");
					height = p.getParam();
					if (height == -1)
						continue;
					double tArea = a.triArea(width, height);
					System.out.println("\nArea=" + tArea);
					break;
				}
				break;
			case 2:
				while (true) {
					System.out.println("Enter the width of rectangle:");
					width = p.getParam();
					if (width == -1)
						continue;
					System.out.println("Enter the heigth of rectangle:");
					height = p.getParam();
					if (height == -1)
						continue;
					double rArea = a.rectArea(width, height);
					System.out.println("\nArea=" + rArea);
					break;
				}
				break;
			case 3:
				while (true) {
					System.out.println("Enter the width of square:");
					width = p.getParam();
					if (width == -1)
						continue;
					double sArea = a.sqrArea(width);
					System.out.println("\nArea=" + sArea);
					break;
				}
				break;
			case 4:
				while (true) {
					System.out.println("Enter the radius of circle:");
					radius = p.getParam();
					if (radius == -1)
						continue;
					double cArea = a.cirArea(radius);
					System.out.println("\nArea=" + cArea);
					break;
				}
				break;
			case 5:
				System.exit(0);
				input.close();

			default:
				System.out.println("Enter the valid input");
				break;
			}

		}
	}
}
