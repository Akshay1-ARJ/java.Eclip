package com.xworkz.theater.repository;

import com.xworkz.theater.dto.TheaterDTO;

public class TheaterRepositiryImpl implements TheaterRepository{
	
	private TheaterDTO[] dtos =new TheaterDTO[5];
	private int google=0;
	
	
	@Override 
	public boolean store(TheaterDTO dto) throws Exception {
		if(this.google >=this.dtos.length) {
			System.err.println("size exceeded cannot be add more TheareDTO");
			throw new Exception();
		}
		this.dtos[this.google]=dto;
		System.out.println("Saved dto into index:"+this.google);
		this.google++;
		return false;
	}

}
