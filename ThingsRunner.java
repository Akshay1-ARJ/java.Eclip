package com.xworkz.things.boot;

import com.xworkz.things.*; 

public class ThingsRunner {
	
	public static void main(String[] args) {
		
		Tea tea=new Tea();
		
		System.out.println(tea.name);
		System.out.println(tea.brand);
		System.out.println(tea.company);
		System.out.println(tea.mfgDate);
		System.out.println(tea.expDate);
		System.out.println(tea.Price);
		System.out.println(tea.packet);
		System.out.println(tea.teaShop);
		System.out.println(tea.nameTeaShop);
		
		
		
		tea.teaSweet=true;
		tea.noOfBoxes=10;
		tea.conatiner="50ml";
		tea.weight="1KG";
		tea.height="1feet";	
		tea.location="kodagu";
		tea.teaStartedDate="01-07-1998";
		tea.state="Karnataka";
		tea.rate="10 RS";
		System.out.println(tea.teaSweet);
		System.out.println(tea.noOfBoxes);
		System.out.println(tea.conatiner);
		System.out.println(tea.weight);
		System.out.println(tea.height);
		System.out.println(tea.location);
		System.out.println(tea.teaStartedDate);
		System.out.println(tea.state);
		System.out.println(tea.rate);
		
		System.out.println("===============================================");
		
		RMD rmd=new RMD();
		
		
	System.out.println(rmd.name);
	System.out.println(rmd.color);
	System.out.println(rmd.packaging);
	System.out.println(rmd.packagecontent);
	System.out.println(rmd.noOfRmdPackage);
	System.out.println(rmd.brand);
	System.out.println(rmd.location);
	System.out.println(rmd.expDate);
	System.out.println(rmd.mfgDate);
	
	
	rmd.width="3mm";
	rmd.heigtht="3mm";
	rmd.state="Karnataka";
	rmd.country="india";
	rmd.founder="Mr Rasiklal Manikchand Dhariwal";
	rmd.noofLocation=786;
	rmd.flaver="pan masala";
	rmd.betelnut=true;
	rmd.year=2022;
	System.out.println(rmd.width);
	System.out.println(rmd.heigtht);
	System.out.println(rmd.state);
	System.out.println(rmd.country);
	System.out.println(rmd.founder);
	System.out.println(rmd.noofLocation);
	System.out.println(rmd.flaver);
	System.out.println(rmd.betelnut);
	System.out.println(rmd.year);
	
	System.out.println("===================================================");
	
	Cigarete cigarete=new Cigarete();
	
	System.out.println(cigarete.name);
	System.out.println(cigarete.company);
	System.out.println(cigarete.barnd);
	System.out.println(cigarete.length);
	System.out.println(cigarete.tobaco);
	System.out.println(cigarete.price);
	System.out.println(cigarete.quality);
	System.out.println(cigarete.difTypesofCigarate);
	System.out.println(cigarete.color);

	
	
	cigarete.noofCigarets=10;
	cigarete.Packagetype="Box";
	cigarete.mfgDate="19-02-2022";
	cigarete.expDate="25-12-20222";
	cigarete. location="Banglore";
	cigarete.state="karnataka";
	cigarete.county="India";
	cigarete.available=true;
	cigarete.weight=10;

	System.out.println(cigarete.noofCigarets);
	System.out.println(cigarete.Packagetype);
	System.out.println(cigarete.mfgDate);
	System.out.println(cigarete.expDate);
	System.out.println(cigarete.location);
	System.out.println(cigarete.state);
	System.out.println(cigarete.county);
	System.out.println(cigarete.available);
	System.out.println(cigarete.weight);

System.out.println("=================================================");

Dustbin dustbin=new Dustbin();


System.out.println(dustbin.name);
System.out.println(dustbin.brand);
System.out.println(dustbin.company);
System.out.println(dustbin.mfgDate);
System.out.println(dustbin.expdate);
System.out.println(dustbin.location);
System.out.println(dustbin.state);
System.out.println(dustbin.country);
System.out.println(dustbin.sticker);

dustbin.metal="fiber";
dustbin.price=200;
dustbin.weight="1KG";
dustbin.height="100cm";
dustbin.quantity=500;
dustbin.density="50pices";
dustbin.setBox=20;
dustbin.type="Box";
dustbin.color="blue green white";

System.out.println();

System.out.println(dustbin.metal);
System.out.println(dustbin.price);
System.out.println(dustbin.weight);
System.out.println(dustbin.height);
System.out.println(dustbin.quantity);
System.out.println(dustbin.density);
System.out.println(dustbin.setBox);
System.out.println(dustbin.type);
System.out.println(dustbin.color);
		
		


		
		
		
	}

}
