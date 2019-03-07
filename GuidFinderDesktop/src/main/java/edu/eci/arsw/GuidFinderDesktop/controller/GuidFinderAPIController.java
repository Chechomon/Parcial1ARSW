/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop.controller;

import edu.eci.arsw.GuidFinderDesktop.model.GuidFinde1;
import edu.eci.arsw.GuidFinderDesktop.model.GuidFinder;
import edu.eci.arsw.GuidFinderDesktop.services.GuidFinderServices;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2110461
 */
@RestController
@RequestMapping(value = "/uuid")
@Service
public class GuidFinderAPIController {
    @Autowired
    GuidFinderServices fs;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllGuides(){
        try {
            return new ResponseEntity<>(fs.getAllGuides(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(edu.eci.arsw.GuidFinderDesktop.controller.GuidFinderAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
        }
    }
     @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postResourceCinemaByName(@RequestBody String c) {
        try {
            java.util.Date fecha=new Date();
            String f=fecha.toString();
            GuidFinde1 finder = new GuidFinde1(f,c,1);
            fs.addGuid(finder);
            return new ResponseEntity<>(fs.getAllGuides(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(GuidFinderAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
}
