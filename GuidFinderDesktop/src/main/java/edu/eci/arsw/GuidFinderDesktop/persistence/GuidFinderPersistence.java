/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop.persistence;

import edu.eci.arsw.GuidFinderDesktop.model.GuidFinde1;
import edu.eci.arsw.GuidFinderDesktop.model.GuidFinder;
import java.util.List;

/**
 *
 * @author 2110461
 */
public interface GuidFinderPersistence {
    
    public List<GuidFinde1> getGuides();
    
    public void addGuid(GuidFinde1 Guid);
}
