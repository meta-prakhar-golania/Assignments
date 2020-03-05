package enum_package;

import java.util.Scanner;

public class Status{
	final static public String status="*****Invalid Input*****\n";
	final static public String update="*****Cart is Updated******\n";
	final static public String add="******Item added to the cart*******\n";
	final static public String remove="******Item is removed*******\n";
	final static public String empty="*****Cart is Empty******\n";
	
	public int check(){
		Scanner input = new Scanner(System.in);
		int data; // input variable
		
		try {
			data = input.nextInt();
		} catch (Exception ex) {
			return -1;
		}
		if (data < 0) {
			return -1;
		}
		if(data==0){
			return 0;
		}
		return data;
		
	}
}