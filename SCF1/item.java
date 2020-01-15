package assignment1;

import java.util.HashMap;
import java.util.Scanner;

public class item 
	{
	String itemname[] = { "Biscuits ", "Drinks    ", "Chips     ","Fruits   ","Vegiees   " };
	int price[] = { 10, 20, 30, 20, 30 };
	HashMap<String, Integer> map = new HashMap<>();
	
	// To show the available item list
	public void show() 
		{
		int i;
		System.out.println("S.No."+"\t\t" + "Item Name" + "\t\t"+"Price");
		for (i = 0; i <= 4; i++)
			System.out.println((i + 1) + "\t\t" + itemname[i] + "\t\t"+ price[i]);
		}
	
	//To add item in cart
	public void add(int it_no, int quant)
		{
		if(map.containsKey(itemname[it_no-1]))
			{
			int a;   //to get the quantity of item from map
			a = map.get(itemname[it_no-1]);
			quant=quant+a;
			}
		map.put(itemname[it_no - 1], quant);
		}
	
	// To update item of cart
	public void update(int it_no, int quant)
		{
		if(!map.containsKey(itemname[it_no-1]))   //check whether cart contain item or not
				{
				System.out.println("*******************************");
				System.out.println("Do not have such item in cart");
				System.out.println("*******************************");
				}
		else
			map.put(itemname[it_no - 1], quant);
			
		}
	
	// To remove item from the cart
	public void remove(int it_no) 
		{
		if(!map.containsKey(itemname[it_no-1]))   //check whether cart contain item or not
			{
			System.out.println("*******************************");
			System.out.println("Do not have such item in cart");
			System.out.println("*******************************");
			}
		else
			map.remove(itemname[it_no - 1]);
		}
	
	//To remove all item from the cart
	public void empty()
		{
		if(map.isEmpty())   //check whether cart is empty or not
			{
			System.out.println("*******************************");
			System.out.println("  Your cart is already empty");
			System.out.println("********************************");
			}
		else
			{	
			map.clear();
			System.out.println("*******************************");
			System.out.println("Your cart is empty");
			System.out.println("********************************");
			}
		}
	
	// To show the item(s) in cart
	public void display() 
		{
		if(map.isEmpty())    //check whether cart is empty or not
			{
			System.out.println("*******************************");
			System.out.println("      Your cart is empty");
			System.out.println("********************************");
			}
		else
			{
			System.out.println("S.No."+"\t\t" + "Item Name" + "\t\t"+"Price"+"\t\t"+"Quantity");
			for(int j=0;j<5;j++)
				if(map.containsKey(itemname[j]))
					{
					int a;           //to get quantity of item from map
					a = map.get(itemname[j]);
					System.out.println((j+1)+"\t\t" +itemname[j] + "\t\t"+price[j]+"\t\t"+a);
					}
			}
		}
	
	// To show the final billing price
	public void bill()
		{
		int j, a, total = 0;  //j is use for indexing
							  //a is use to get quantity of mapped item
							  //total is use to get final cart price
		for (j = 0; j < 5; j++) 
			{
			if (map.containsKey(itemname[j]))   
				{
				a = map.get(itemname[j]);
				total = total + price[j] * a;
				}
			}
		System.out.println("*******************************");
		System.out.println("Your cart's Total is " + total);
		System.out.println("********************************");	
		}
			
   //Check the status of cart (i.e. empty or not)
	//if f=0  then cart is empty
	//if f=1 then cart have some item(s)
	public int check()
		{
		int f=1;
		if(map.isEmpty())    //check whether cart is empty or not
			{
			f=0;
			System.out.println("*******************************");
			System.out.println("Your cart is empty");
			System.out.println("********************************");
			}
		return f;
		}
	
	
	public static void main(String[] args) {
		System.out.println("-=-=-=-=-=-=-=-=-=-= Welcome to the cart=-=-=-=-=-=-=-=-=-=- ");
		item i = new item();
		i.show();
		int ch;
		Scanner sc = new Scanner(System.in);
		while (true) 	
			{
			int w=1;    //to check the cart status(empty or not)
			System.out.println("\n\n\n-------------What do you want to do-------------");
			System.out.println(" 1.To add item in cart\n 2.To update items of cart\n 3.To remove items from the cart\n 4.To empty cart\n 5.To Display cart \n 6.To generate bill\n 7. Exit");
			try 	
				{
				ch = sc.nextInt();
				switch (ch) 
					{
					case 1:	i.show();
							System.out.println("\nEnter the item's s.no you want to add:");
							int item_no = sc.nextInt();    //to get item s.no.
							System.out.println("\nEnter quantity of item you want to buy:");
							int quantity = sc.nextInt();   // to get item quantity
							i.add(item_no,quantity);
							break;
							
					case 2:	w=i.check();
							if(w==1)
								{
								i.display();
								System.out.println("\nEnter the item's s.no you want to update:");
								item_no = sc.nextInt();
								System.out.println("\nEnter item quantity");
								quantity = sc.nextInt();
								i.update(item_no, quantity);
								i.display();
								}
							break;
								
						
					case 3:	w=i.check();
							if(w==1)
								{
								i.display();
								System.out.println("\nEnter item's S.no. you want to remove");
								item_no = sc.nextInt();
								i.remove(item_no);
								System.out.println("\n--------------Your cart have---------------");
								i.display();
								}
							break;
								
						
					case 4:	i.empty();
							break;
						
					case 5: i.display();
							break;
						
					case 6:	w=i.check();
							if(w==1)
								{
								i.bill();
								}
							break;
							
					case 7:System.exit(0);
						
					default:System.out.println("***********************");
							System.out.println("Please enter valid key");
							System.out.println("***********************");
							break;
					}
			} catch (Exception ex)
				{
				sc.nextLine();
				System.out.println("***********************");
				System.out.println("Press enter valid key");
				System.out.println("***********************");
				}/*try catch is used to remove error when we press alphabet in switch case instead of number*/

		}

	}

}
