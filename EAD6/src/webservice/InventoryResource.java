package webservice;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*Class to perform different webservice operation
 * @author Prakhar Golania
 * */
@Path("/inventory")
public class InventoryResource {
	
	InventoryRepository repo=new InventoryRepository();
	
	
	/*Get list of all item
	 * @return list of item
	 * */
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Inventory> getInventories(){
		return repo.getInventories();
	}

	/*Get details of item
	 * @return details of item
	 * */
	@GET
	@Path("/{name}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Inventory getInventory(@PathParam("name") String name){
		return repo.getInventory(name);	
	}
	
	/*Add new item in inventory
	 * @param item of type inventory
	 * @return list of items
	 * */
	@POST
	public List<Inventory> createInventory(Inventory item){
		repo.create(item);
		return repo.getInventories();
	}
	
	/*Update inventory
	 * @return list of items 
	 * */
	@PUT
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Inventory> updateInventory(ArrayList<Inventory> newInventory){
		repo.update(newInventory);
		return repo.getInventories();
	}
	
	/*Update an item of inventory
	 * @return list of items
	 * */
	@PUT
	@Path("/{name}")
	public List<Inventory> updateOneInventory(@PathParam("name") String name,Inventory item){
		repo.updateOne(name,item);
		return repo.getInventories();		
	}
	
	/*Delete complete inventory
	 * @return empty list
	 * */
	@DELETE
	public List<Inventory> deleteInventory(){
		repo.deleteAll();
		return repo.getInventories();
	}
	
	/*Delete an item from inventory
	 * @parm name of item
	 * @return list of remaining items
	 * */
	@DELETE
	@Path("/{name}")
	public List<Inventory> deleteOneInventory(@PathParam("name") String name){
		repo.deleteOne(name);
		return repo.getInventories();
	}
}
