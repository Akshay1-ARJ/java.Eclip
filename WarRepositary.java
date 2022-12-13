package com.source.repository;

import com.source.dto.WarDto;

public interface WarRepositary {
	
boolean creating(WarDto waDto);
	
	default int total()
	{
		return 0;
		
	}
	
	
	default WarDto tempwar(String tempWarName)
	{
		return null;
		
	}

}
