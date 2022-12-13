package com.source.runner;

import java.time.LocalDateTime;

import com.source.dto.WarDto;
import com.source.repository.WarRepositary;
import com.source.repository.WarRepositaryImpl;

public class WarRepositaryRunner {

	public static void main(String[] args) {
		

		WarRepositary repo = (WarRepositary) new WarRepositaryImpl();
		WarDto dto = new WarDto();
		dto.setEndDate(1945);
		dto.setName("germany");
		dto.setNoOfDeaths(40000000-50000000);
		dto.setStartDate(1939);
		dto.setStartedBy("germany");
		dto.setWonBy("The Soviet Union");
		dto.setStartedWith("qwerty");
		dto.setCreatedby("Akshay");
		dto.setUpdatedBy("Akshay");
		dto.setCreatedDateTime(LocalDateTime.now());
		dto.setUpdatedDateTime(LocalDateTime.now());
		repo.creating(dto);
		
		repo.tempwar("germany");
		
		
		
	}
		

	}


