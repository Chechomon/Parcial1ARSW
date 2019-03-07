/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop.services;

import edu.eci.arsw.GuidFinderDesktop.model.GuidFinde1;
import edu.eci.arsw.GuidFinderDesktop.model.GuidFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import edu.eci.arsw.GuidFinderDesktop.persistence.GuidFinderPersistence;
import java.util.*;
/**
 *
 * @author 2110461
 */
@Service
@Component("GuidFinderServices")
public class GuidFinderServices{
    @Autowired
    GuidFinderPersistence gfp;
    
     public void addGuid(GuidFinde1 c) {
        gfp.addGuid(c);
    }
    
    public List<GuidFinde1> getAllGuides(){
        return gfp.getGuides();
    }
}
