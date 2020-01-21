/*Program to calculate LCM and HCF using recursion
 * @author Prakhar Golania
 * */
public class LcmHcf {
	/*
	 * find the hcf of a numbers
	 * @param number1 is use to get first no.
	 * @param number2 is use to get second no.
	 * @return hcf of a numbers
	 */
	public int hcf(int number1, int number2){
		if ( number2!=0 )
			return hcf(number2, number1%number2);
		else 
			return number1;
	}
	
	/*
	 * find the lcm of a numbers
	 * @param number1 is use to get first no.
	 * @param number2 is use to get second no.
	 * @return lcm of a numbers
	 */
	public int lcm(int number1, int number2){
		return ((number1*number2)/hcf(number1, number2));
	}
}
