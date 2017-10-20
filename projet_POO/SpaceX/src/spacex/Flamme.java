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
public class Flamme extends Vaisseau {

    public Flamme(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }
    
    public void move(long dt){
        
    }
    
    public void specialMove(long dt){
        
    }
    
    public boolean isDestructible(){
        return false;
    }

    @Override
    public void effect(Objet o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
