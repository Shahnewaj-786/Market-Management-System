import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Market market = new Market();
		Shop shop = new Shop();
		Product.availableQuantity = 5000;
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); // sc is an object of Scanner class, which is used to take user input
											 // nextInt() -> method to take int input.
											 // nextDouble() -> method to take double input.
											 // next() -> method to take String input.
											 // next().charAt(0) -> method to take char input.
		
		boolean repeat = true;
		
		System.out.println("-------------------");
		System.out.println("Welcome to Morjina Market");
		System.out.println("-------------------");
		
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId1 = sc.next();
							System.out.print("Enter Name: ");
							String name1 = sc.next();
							System.out.print("Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(market.insertEmployee(e1)){System.out.println("Employee Inserted..... ID: "+e1.getEmpId());}
							else{System.out.println("Oops!!.... Something is Wrong....");}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an existing Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId3 = sc.next();
							
							Employee e3 = market.searchEmployee(empId3);
							
							if(e3 != null)
							{
								if(market.removeEmployee(e3)){System.out.println("Employee Removed.... ID: "+e3.getEmpId());}
								else{System.out.println("Oops!!.... Something is wrong...");}
							}
							else{System.out.println("No employee found to remove");}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							
							market.showAllEmployees();
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId2 = sc.next();
							
							Employee e2 = market.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee Found.......");
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							else{System.out.println("No Such Employee Found....");}
								
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				case 2:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Shop Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove Existing Shop");
					System.out.println("3. Show All Shops");
					System.out.println("4. Search a Shop");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Shop");
							System.out.println("***********************************");
							
							System.out.print("Enter SID: ");
							String sid1 = sc.next();
							System.out.print("Enter Name: ");
							String name5 = sc.next();
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name5);
							
							
							if(market.insertShop(s1)){System.out.println("Shop Inserted..... ID: "+s1.getSid());}
							else{System.out.println("Oops!!.... Something is Wrong....");}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove existing Shop");
							System.out.println("***********************************");
							
							System.out.print("Enter SID: ");
							String sid3 = sc.next();
							
							Shop s3 = market.searchShop(sid3);
							
							
							if(s3 != null)
							{
								if(market.removeShop(s3)){System.out.println("Shop Removed.... ID: "+s3.getSid());}
								else{System.out.println("Oops!!.... Something is wrong...");}
							}
							else{System.out.println("No Shop found to remove");}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Shops");
							System.out.println("***********************************");
							
							market.showAllShops();
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Shop");
							System.out.println("***********************************");
														
							System.out.print("Enter SId: ");
							String sid2 = sc.next();
							
							Shop s2 = market.searchShop(sid2);
							
							if(s2 != null)
							{
								System.out.println("Shop Found.......");
								System.out.println("Shop ID: "+s2.getSid());
								System.out.println("Shop Name: "+s2.getName());
								System.out.println();
							}
							else{System.out.println("No Such Shop Found....");}
								
							System.out.println();
							break;						
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;
					
				case 3:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Shop Product Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Product");
					System.out.println("2. Remove Existing Product");
					System.out.println("3. Show All Product");
					System.out.println("4. Search a Product");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert new Product");
							System.out.println("***********************************");
							
							System.out.println("There are two Types of Products: ");
							System.out.println("1. Local Product");
							System.out.println("2. Imported Product");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							Product pdc = null;
							
							if(type == 1)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Local Product");
								System.out.println("***********************************");
								
								System.out.print("Enter Product ID: ");
								String pi = sc.next();
								System.out.print("Enter Product Name: ");
								String pn = sc.next();
								System.out.print("Enter Product Quantity: ");
								int pq = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pp = sc.nextDouble();
								System.out.print("Enter Product Discount Rate: ");
								double pd = sc.nextDouble();
								
								LocalProduct lp = new LocalProduct(pi, pn, pq, pp, pd);
								
								pdc = lp;
							}
							else if(type == 2)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Imported Product");
								System.out.println("***********************************");
								
								System.out.print("Enter Product ID: ");
								String pi = sc.next();
								System.out.print("Enter Product Name: ");
								String pn = sc.next();
								System.out.print("Enter Product Quantity: ");
								int pq = sc.nextInt();
								System.out.print("Enter Product price: ");
								double pp = sc.nextDouble();
								System.out.print("Enter Country name: ");
								String cn = sc.next();
								
								ImportedProduct ip = new ImportedProduct(pi, pn, pq, pp, cn);
								
								pdc = ip;
							}
							else if(type == 3)
							{
								System.out.println("***********************************");
								System.out.println("Going Back........");
								System.out.println("***********************************");
							}
							else
							{
								System.out.println("***********************************");
								System.out.println("Invalid Type!!........");
								System.out.println("***********************************");
							}
							
							if(pdc != null)
							{
								System.out.print("Enter Shop SID: ");
								String sid = sc.next();
								
								Shop s = market.searchShop(sid);
								
								if( s != null)
								{
									if(s.insertProduct(pdc)){System.out.println("Product Inserted.... "+ pdc.getPid() + " for "+ s.getSid());}
									else{System.out.println("Oops!!.... Something is Wrong......");}
								}
								else{System.out.println("Oops!!.... Something is Wrong......");}
							}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Product");
							System.out.println("***********************************");
							
							System.out.print("Enter PID: ");
							String pid3 = sc.next();
							
							Product p3 = shop.searchProduct(pid3);
							
							
							if(p3 != null)
							{
								if(shop.removeProduct(p3)){System.out.println("Product Removed.... ID: "+p3.getPid());}
								else{System.out.println("Oops!!.... Something is wrong...");}
							}
							else{System.out.println("No Product found to remove");}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Product");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							String sid4 = sc.next();
							
							Shop s4 = market.searchShop(sid4);
							
							if(s4 != null)
							{
								s4.showAllProducts();
							}
							else{System.out.println("Oops!!...... Something is Wrong.......");}
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a product");
							System.out.println("***********************************");
							
							System.out.print("Enter PId: ");
							String pid2 = sc.next();
							
							Product p2 = shop.searchProduct(pid2);
							
							if(p2 != null)
							{
								System.out.println("Product Found.......");
								System.out.println("Product ID: "+p2.getPid());
								System.out.println("Product Name: "+p2.getName());
								System.out.println("Product Price: "+p2.getPrice());
								System.out.println();
							}
							else{System.out.println("No Such Product Found....");}
								
							System.out.println();
							break;		
							
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;
				
				case 4:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Product Quantity Add-Sell");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add product");
					System.out.println("2. Sell Product");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Add Product");
							System.out.println("***********************************");
							
							System.out.print("Enter SID: ");
							String sid1 = sc.next();
							
							Shop s1 = market.searchShop(sid1);
							
							if(s1 != null)
							{
								System.out.print("Enter Product ID: ");
								String pi = sc.next();
								
								Product pdc = s1.searchProduct(pi);
								
								if(pdc != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Quantity: " + pdc.getAvailableQuantity());
									if(pdc.addQuantity(am))
									{
										System.out.println("Depositing Amount: "+ am + "     Successfull");
										System.out.println("New Quantity: "+pdc.getAvailableQuantity());
										frwd.writeInFile("add: "+am+" in "+pdc.getPid());
										
									}
									else
									{
										System.out.println("Oops!!... Something is Wrong....");
									}
								}
								
							}
							System.out.println("Oops!!... Something is Wrong....");
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Sell product ");
							System.out.println("***********************************");
							
							System.out.print("Enter SID: ");
							String sid2 = sc.next();
							
							Shop s2 = market.searchShop(sid2);
							
							if(s2 != null)
							{
								System.out.print("Enter Product ID: ");
								String an = sc.next();
								
								Product pdc= s2.searchProduct(an);
								
								if(pdc != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Quantity: " + pdc.getAvailableQuantity());
									if(pdc.sellQuantity(am))
									{
										System.out.println("Selling Amount: "+ am + "     Successfull");
										System.out.println("New Quantity: "+pdc.getAvailableQuantity());
										frwd.writeInFile("Sell: "+am+" from "+pdc.getPid());
									}
									else
									{
										System.out.println("Oops!!... Something is Wrong....");
									}
								}
								
							}
							System.out.println("Oops!!... Something is Wrong....");
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show Add Sell History");
							System.out.println("***********************************");
							
							frwd.readFromFile();
							
							System.out.println();
							break;
							
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				case 5:
				
					repeat = false;
					System.out.println("******************************");
					System.out.println("Thank you for using our System");
					System.out.println("******************************");
					
					System.out.println();
					break;
					
				default:
				
					System.out.println("******************************");
					System.out.println("Invalid Choice.....");
					System.out.println("******************************");
					
					System.out.println();
					break;
			}
		}
	}
}