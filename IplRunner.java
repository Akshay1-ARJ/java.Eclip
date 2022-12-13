package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.dto.IplRepositoryImpl;
import com.xworkz.ipl.dto.repository.IplRepository;

public class IplRunner {
	

	public static void main(String[] args) {
	
		IplRepository repository=(IplRepository) new IplRepositoryImpl();
		

		IplDTO dto=new IplDTO();
		dto.setTeamName("XWORKZ");
		dto.setCaptainName("Omkar");
	    dto.setOwnerAlive(true);
	    dto.setPurse(50);
	    dto.setWins(100);
	    dto.setDefeats(0);
	    dto.setCreatedBy("omkareshwar");
	    dto.setCreatedDate(LocalDateTime.now());
	    
	  
		}

	}


