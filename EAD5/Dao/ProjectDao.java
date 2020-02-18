package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Facade.Product;

/*Class to connect code with data base
 * @Prakhar Golania
 * */
public class ProjectDao {
	static ArrayList<Product> itemList = new ArrayList<Product>();
	
	/*Function to get the list of available item
	 * @return the list of item 
	 * */
	public static ArrayList<Product> getItemList(){
		try {
			itemList.clear();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","123Asdfg12");
			PreparedStatement ps=con.prepareStatement("select * from itemlist");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product item = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				itemList.add(item);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return itemList;
	}
	
}
