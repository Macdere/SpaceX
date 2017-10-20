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
 * @author ac410813
 */
public abstract class Afficheurs extends Objet{

    public Afficheurs(Game g, String nom, double _x, double _y) {
        super(g, nom, _x, _y);
    }
    
    public boolean collision(Objet o){
        return false;
    }
    
    @Override
    public void effect(Objet o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFriend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
