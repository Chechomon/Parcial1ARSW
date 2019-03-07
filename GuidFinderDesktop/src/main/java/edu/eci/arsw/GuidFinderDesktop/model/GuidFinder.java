package edu.eci.arsw.GuidFinderDesktop.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;

public class GuidFinder extends Thread{
	
	private static UUID[] guids; 
	public static UUID guidToFind;
	
	public GuidFinder(String Fecha, UUID Guid, int Count) throws Exception {
            this.guidToFind=Guid;
		getGuids();
                
	}
	
	public static UUID[] getGuids() throws Exception 
	{
	
		if(guids==null){
			//System.out.println("es nulo");
		FileInputStream fi;
		
			fi = new FileInputStream(new File("guids.eci"));
		
                    try (ObjectInputStream oi = new ObjectInputStream(fi)) {
                        guids= (UUID[]) oi.readObject();
                    }
		fi.close();
		}
		return guids;
		
	}
	
	public int countGuids(UUID guidToFind) 
	{
		
		int count=0;
		for (UUID uuid : guids) {
			if(uuid.equals(guidToFind))
					{
				count++;
					}
			
		}
		return count;
		
	}
           
}
