package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.source.constant.PizzaSize;
import com.source.dto.PizzaDTO;
import com.source.service.Pizza;
import com.source.service.PizzaService;

public class PizzaRunner {

	public static void main(String[] args) {
		

		PizzaDTO pizzaDto = new PizzaDTO();	
		Pizza pizza = new PizzaService();
		
		pizzaDto.setPrice(200);
		pizzaDto.setType("Veg");
		pizzaDto.setFlavour("Tomato");
		pizzaDto.setCheese(true);
		pizzaDto.setSize(PizzaSize.Large);
		pizzaDto.setCompany("Dominos");
		pizzaDto.setName("Mergarita");
	    pizzaDto.setCreatedby("Akshay");
	    pizzaDto.setCreatedDateTime(LocalDateTime.now());
	    pizzaDto.setUpdatedBy("Akshay");
	    pizzaDto.setUpdatedDateTime(LocalDateTime.now());
			
	    pizza.pizzaCreate(pizzaDto);
			
			
			
			
		}

	}


