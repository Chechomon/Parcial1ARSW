/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop.persistence.impl;

import edu.eci.arsw.GuidFinderDesktop.model.GuidFinde1;
import edu.eci.arsw.GuidFinderDesktop.model.GuidFinder;
import edu.eci.arsw.GuidFinderDesktop.persistence.GuidFinderPersistence;
import java.util.*;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2110461
 */
@Service
public class InMemoryGuidFinderPersistence implements GuidFinderPersistence{
    private final List<GuidFinde1> guids=new ArrayList<>();

    public InMemoryGuidFinderPersistence() throws Exception {
        java.util.Date fecha=new Date();
        String f=fecha.toString();
        GuidFinde1 finder = new GuidFinde1(f,"d0692660-c39a-4d73-9496-d9df0c4ebdf3",0);
        guids.add(finder);
    }
    
    @Override
    public List<GuidFinde1> getGuides() {
        return guids;
    }

    @Override
    public void addGuid(GuidFinde1 Guid) {
        guids.add(0, Guid);  
    }
    
}
