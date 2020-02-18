package Facade;

/*Pojo class
 * @author Prakhar Golania
 * */
public class Product {
	private int productCode;
	private String type;
	private String name;
	private int price;
	
	/*Function to initiallize item(s)  
	 * */
	public Product(int productCode, String type, String name, int price) {
		this.productCode = productCode;
		this.type = type;
		this.name = name;
		this.price = price;
	}
	
	/*Getter function 
	 * @return product code
	 * */
	public int getProductCode() {
		return productCode;
	}
	
	/*Setter function
	 * */
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
	/*Getter function 
	 * @return type
	 * */
	public String getType() {
		return type;
	}
	
	/*Setter function
	 * */
	public void setType(String type) {
		this.type = type;
	}
	
	/*Getter function 
	 * @return product name
	 * */
	public String getName() {
		return name;
	}
	
	/*Setter function
	 * */
	public void setName(String name) {
		this.name = name;
	}
	
	/*Getter function 
	 * @return product price
	 * */
	public int getPrice() {
		return price;
	}
	
	/*Setter function
	 * */
	public void setPrice(int price) {
		this.price = price;
	}
	
}
