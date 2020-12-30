package classes;

import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
	protected String pid;
	protected String name;
	public static int availableQuantity;
	protected double price;
	
	public Product(){}
	public Product(String pid, String name,int availableQuantity, double price)
	{
		this.pid = pid;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;

	}
	
	public void setPid(String pid)
	{
		this.pid = pid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static void setAvailableQuantity(int aq)
	{
		availableQuantity = aq;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getPid()
	{
		return pid;
	}
	public String getName()
	{
		return name;
	}
	public static int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			availableQuantity = availableQuantity + amount;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			availableQuantity = availableQuantity - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract void showInfo();
	
}