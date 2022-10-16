package com.xworkz.things.boot;

import com.xworkz.things.*;

public class ChainingRunner {

	public static void main(String[] args) {
		
		Tractor tractor=new Tractor("Power tractor",48,20000.0,"ohhpaji","yellow","2020");
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.color);
		System.out.println(tractor.price);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		
		System.out.println(System.lineSeparator());

		TexttileShope texttileShope=new TexttileShope(1258963, 9900099000L);
		System.out.println(texttileShope.ownerName);
		System.out.println(texttileShope.ownerWifeName);
		System.out.println(texttileShope.ownerDaughterName);
		System.out.println(texttileShope.ownerDaughterNumber);
		System.out.println(texttileShope.ownerNoOfWifes);
		System.out.println(texttileShope.shopNo);
		System.out.println(texttileShope.contactNo);
		
		System.out.println(System.lineSeparator());

		Chain chain=new Chain(7,"commit thef","dog",'Y');
		
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.matirial);
		System.out.println(chain.weight);
		System.out.println(chain.stolen);
		System.out.println(chain.usedFor);
		System.out.println(chain.fresh);

			
	}

}
