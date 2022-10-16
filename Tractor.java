package com.xworkz.things;

public class Tractor{
	
	public String name;
	public String brand;
	public double price;
	public String color;
	public int hp;
	public String model;
	
		
	
	public Tractor(String name)
	{
		super();
		this.name=name;
		
	}
	public Tractor( double price,String brand)
	{
		this("HMT");
		this.price=price;
		this.brand=brand;
	}
	public Tractor( String color,String brand,double price)
	{
		this(350.0,brand);
		this.color=color;
	}
	public Tractor( double price ,String color,String brand,int hp)
	{
		this(color,"national",price);
		this.hp=hp;
	}
	public Tractor( String model,int hp,double price,String brand)
	{
		this(price,"YELLOW",brand,50);
		this.hp=hp;
		
		this.model=model;
	}
	public Tractor( String name ,int hp,double price,String brand,String color,String model)
	{
		this(model,hp,price,brand);
		
			
	}
	
	

}
