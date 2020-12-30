package classes;

import java.lang.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
	public LocalProduct()
	{
		super();
	}
	public LocalProduct(String pid, String name, int availableQuantity , double price, double discountRate)
	{
		super(pid, name, availableQuantity, price);
		this.discountRate = discountRate;
		
	}
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}
	public void showInfo()
	{
		System.out.println("Product Id: "+pid);
		System.out.println("product Name: "+name);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Discount Rate: "+discountRate);
	}
	
}