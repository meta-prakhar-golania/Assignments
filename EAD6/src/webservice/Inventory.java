package webservice;
import javax.xml.bind.annotation.XmlRootElement;

/*Pojo Class
 * @author Prakhar Golania
 * */
@XmlRootElement
public class Inventory {
	
	private String name;
	private int quantity;
	
	Inventory(){}
	
	Inventory(String itemName, int quant){
		this.name=itemName;
		this.quantity=quant;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
