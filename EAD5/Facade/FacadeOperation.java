package Facade;

import java.util.ArrayList;
import java.util.HashMap;

import Dao.ProjectDao;
import enum_package.*;

/*class to perform different operation
 * @author Prakhar Golania
 * */
public class FacadeOperation {
	HashMap<Integer, Integer> userCart = new HashMap<Integer, Integer>();
	
	/*Function to check whether product code is available or not
	 * @param product to get the input product code
	 * @return boolean value  
	 * */
	public boolean checkProductCode(int productCode) {
		for ( Product product : ProjectDao.getItemList() )
			if ( product.getProductCode() == productCode )
				return true;
		return false;
	}
	
	/*Function to get the list of item
	 * @return list of item available
	 * */
	public ArrayList<Product> displayItemList(){				
		return ProjectDao.getItemList();	
		}
	
	/*Function to add item in cart
	 * @param productCode to get the input product code
	 * @param quantity to get the quantity to add
	 * return string as status
	 * */
	public String add(int productCode,int quantity){			
		if ( userCart.containsKey(productCode)){
			int add_quantity = quantity + userCart.get(productCode);
			userCart.put(productCode,add_quantity);
			return Status.add;
		}
		else{
			userCart.put(productCode,quantity);
			return Status.add;
		}
	}
	
	/*Function to update item in cart
	 * @param productCode to get the input product code
	 * @param quantity to get the quantity to add
	 * return string as status
	 * */
	public String update(int productCode,int quantity){			
		if ( userCart.containsKey(productCode)){
			userCart.put(productCode,quantity);
			return Status.update;
		}
		else{
			return Status.update;
		}
	}
	
	/*Function to remove item from cart
	 * @param productCode to get the input product code
	 * return string as status
	 * */
	public String remove(int ProductCode){					
		if ( userCart.containsKey(ProductCode)){
			userCart.remove(ProductCode);
			return Status.remove;
			}
		else 
			return Status.remove;
		}	
	
	/*Function to check whether user cart is empty or not
	 * @returm boolean value
	 * */
	public boolean isEmpty(){
		if(userCart.isEmpty()){
			return false;
		}
		return true;
		}
	
	/*Function to get the user cart status
	 * @return list of item in cart
	 * */
	public HashMap<Integer, Integer> displayUserCart(){							
		return userCart;
	}
	
	/*Function to check whether cart contain item or not
	 * @param productCode to get the input product code
	 *  @returm boolean value
	 * */
	public boolean containItem(int ProductCode){
		if(userCart.containsKey(ProductCode))
			return true;
		else
			return false;
	}
}
