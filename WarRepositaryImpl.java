package com.source.repository;

import com.source.customexception.ArrayisfullnowDontAddMore;
import com.source.dto.WarDto;

public class WarRepositaryImpl implements WarRepositary {
	
	WarDto[] warDto = new WarDto[10];
	private int index = 0;
	
	

	@Override
	public boolean creating(WarDto waDto) {
		if(this.index>=warDto.length)
		{
			System.out.println("Exception Initialize");
			throw new ArrayisfullnowDontAddMore();
		}
		
		this.warDto[this.index]=waDto;
		System.out.println("Saved:"+waDto+"In index"+this.index);
		index++;
		
		return false;
	}

    @Override
	public WarDto tempwar(String tempWarName)
	{
    	for(WarDto warDto: warDto)
    	{
    		String tempName = warDto.getStartedBy();
    		if(warDto!=null&& tempName.equals(tempWarName))
    		{
    			System.out.println(tempWarName);
    			System.out.println("The following the properties are match");
    			System.out.println(warDto);
    			return warDto;
    		}
    	}
		return WarRepositary.super.tempwar(tempWarName);
		
	}
	
	

}
