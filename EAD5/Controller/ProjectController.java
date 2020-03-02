package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import Facade.*;

/*Controller class
 * @author Prakhar Golania
 * */
public class ProjectController {
	static FacadeOperation Obj = new FacadeOperation();
	
	/*Function to direct to facade layer 
	 * @param productCode to get input product code
	 * @return boolean value whether product code is available or not
	 * */
	public static boolean checkProductCode(int productCode) {
		return Obj.checkProductCode(productCode);
	}
	
	/*Function to directed at facade layer
	 * @param productCode to get input product code
	 * @return item list
	 * */
	public static ArrayList<Product> displayItemList(){				
		return Obj.displayItemList();
	}

	/*Function to directed at facade layer
	 * @param productCode to get input product code
	 * @param quantity to get quantity to add
	 * @return a String as status
	 * */
	public static String add(int productCode,int quantity){			
		return Obj.add(productCode, quantity);
	}

	/*Function to directed at facade layer
	 * @param productCode to get input product code to update
	 * @param quantity to get quantity to update
	 * @return a String as status
	 * */
	public static String update(int productCode,int quantity){			
		return Obj.update(productCode, quantity);
	}	
	
	/*Function to directed at facade layer
	 * @return list of items in cart
	 * */
	public static HashMap<Integer, Integer> displayUserCart(){		
		return Obj.displayUserCart();
	}
	
	/*Function to directed at facade layer
	 *@param productCode to get input product code to update
	 *@return boolean value whether item is in cart or not
	 * */
	public static boolean containItem(int productCode){
		return Obj.containItem(productCode);
	}
	
	/*Function to directed at facade layer
	 * @param productCode to get input product code to update
	 * @return String as status
	 * */
	public static String remove(int ProductCode){		
		return Obj.remove(ProductCode);
	}
	
	/*Function to directed at facade layer
	 * @return boolean value whether cart is empty or not
	 * */
	public static boolean isEmpty(){
		return Obj.isEmpty();
	}
	
}
