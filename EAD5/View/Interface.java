package View;
import java.util.Scanner;
import enum_package.Status;
import Controller.*;
import Facade.Product;

/*@author Prakhar Golania
 * Class for user interface
 * */
public class Interface {
	
	/*Function to display available item
	 * */
	public static void displayItemList(){
		System.out.println("Product Code\tType\t\tName\t\tPrice ");
		System.out.println("-------------------------------------------------------------");
		for(Product product : ProjectController.displayItemList())
			System.out.println(product.getProductCode()+"\t\t"+product.getType()+"\t\t"+product.getName()+"\t\t"+product.getPrice());
		System.out.println("\nWhich Item You Want You Add:");
	}
	
	/*Function to display user cart
	 * */
	public static void displayUserCart(){								
			System.out.println("your cart with items:");
			System.out.println("--------------------------------------");
			System.out.println("Item Product Code\tItem quantity");
			System.out.println("--------------------------------------");
			for ( int ProductCode : ProjectController.displayUserCart().keySet())
				System.out.println(ProductCode + "\t\t\t"+ ProjectController.displayUserCart().get(ProductCode));
			}
	
	 public static void main(String[] args){	
		Scanner ip = new Scanner(System.in);
		Status obj= new Status();
		while(true){
		System.out.println("\nselect your operation:\n1. Add item\n2. Update Cart\n3. Remove Item from cart\n4. Display User Cart\n5. Exit\n");
		System.out.println("enter your operation serial number:");
		try {
			int choice = ip.nextInt();
			switch(choice){
				case 1: displayItemList();
						while(true){
							System.out.println("Enter the code of item:");
							try{
								int productCode = obj.check();
								if ( ProjectController.checkProductCode(productCode) ){
									while(true){
										System.out.println("enter the quantity of item:");
										int item_quantity = obj.check();
										if ( item_quantity > 0 ){
											System.out.println(ProjectController.add(productCode,item_quantity));
											break;
											}
										else{
											System.out.println(Status.status);
											continue;
											}
										}
									}
								else{
									System.out.println(Status.status);
									continue;
									}
							}catch(Exception e){
								System.out.println(Status.status);
							}
						break;
						}
					break;
				
				case 2: if(ProjectController.isEmpty()){
							displayUserCart();	
							while(true){
								System.out.println("Enter the code of item you want to update:");
								try{
									int productCode = obj.check();
									if (ProjectController.containItem(productCode)){
										while(true){
											System.out.println("enter the quantity of item:");
											int itemQuantity = obj.check();
											if( itemQuantity > 0 ){
												System.out.println(ProjectController.update(productCode,itemQuantity));
												break;
											}
											else if(itemQuantity==0){
												ProjectController.remove(productCode);
												break;
											}
											else{
												System.out.println(Status.status);
												continue;
												}
											}
										}
									else{
										System.out.println(Status.status);
										continue;
										}
									break;
									}catch(Exception e){
										System.out.println(Status.status);
										}
								}
							}
						else
							System.out.println(Status.empty);
						break;
							
				case 3: if(ProjectController.isEmpty()){
							displayUserCart();	
							while(true){
								System.out.print("Enter the code of item You Want to Remove:\n");
								try{
									int productCode = obj.check();
									if(ProjectController.containItem(productCode)){
										System.out.println(ProjectController.remove(productCode));
										}
									else{
										System.out.println(Status.status);
										continue;
										}
									}catch(Exception e){
										System.out.println(Status.status);
									}
								break;
								}
							}
						else
							System.out.println(Status.empty);
						break;
						
				case 4: if(ProjectController.isEmpty()){
							displayUserCart();
							}
						else
							System.out.println(Status.empty);
						break;
				
				case 5: System.out.println("Thank You For The Purchasing");
				 		ip.close();
						System.exit(0);
						
				default: System.out.println(Status.status);
						 break;
				}
			} catch (Exception e) {
				System.out.println(Status.status);
				ip.nextLine();
			 }
		}	
	 }
}
