/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacex;

import iut.Game;
import iut.Objet;

/**
 *
 * @author vd195189
 */
public class Alien3 extends Vaisseau {

    public Alien3(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    /**
     *
     * @param dt
     */
    @Override
    public void move (long dt){
        
    }
    
    public void special(){
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isDestructible(){
        return false;
    }

    @Override
    public void effect(Objet o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
