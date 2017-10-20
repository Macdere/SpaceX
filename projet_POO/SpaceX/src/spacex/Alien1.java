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
public class Alien1 extends Vaisseau {

    public Alien1(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effect(Objet o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void move(long dt){
        
    }
    
    public void specialMove(long dt){
        
    }
    
    public boolean isDestructible(){
        return false;
    }
    
}
