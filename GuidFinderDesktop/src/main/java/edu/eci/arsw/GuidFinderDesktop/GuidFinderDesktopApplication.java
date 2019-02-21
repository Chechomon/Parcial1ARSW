package edu.eci.arsw.GuidFinderDesktop;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class GuidFinderDesktopApplication implements KeyListener{
        
	public static void main(String[] args) throws Exception {
		SpringApplication.run(GuidFinderDesktopApplication.class, args);
                boolean val = false;
                KeyEvent e = null;
		for(int i = 0; i < 4;i++){
                    GuidFinder finder = new GuidFinder(UUID.fromString("d0692660-c39a-4d73-9496-d9df0c4ebdf3"));
                    System.out.println(finder.countGuids(UUID.fromString("d0692660-c39a-4d73-9496-d9df0c4ebdf3")));
                    finder.run();
                    val = true;

                }
                while(!val){
                    try{
                        ArrayList<GuidFinder> thre = new ArrayList();
                        for(int i = 0; i <= 4; i++){
                            GuidFinder finder = new GuidFinder(UUID.fromString("d0692660-c39a-4d73-9496-d9df0c4ebdf3"));
                            thre.add(finder);
                            finder.start();
                        }
                        Thread.sleep(10000);
                        if(e.getKeyCode()==KeyEvent.VK_SPACE & e.getWhen()>10000){
                            for(GuidFinder g : thre){
                                g.resume();
                            }
                        }else{
                            for(GuidFinder g : thre){
                                g.stop();
                            }
                        }
                    }catch (InterruptedException ex) {
                        Logger.getLogger(GuidFinderDesktopApplication.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
		
	}

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
