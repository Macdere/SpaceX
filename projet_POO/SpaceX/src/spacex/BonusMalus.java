/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacex;
import iut.Game;
import iut.ObjetTouchable;
/**
 *
 * @author ac410813
 */
public abstract class BonusMalus extends ObjetTouchable{
    
    private Joueur joueur;
    
    public BonusMalus(Game g, String nom, int x, int y, Joueur j) {
        super(g, nom, x, y);
        this.joueur = joueur;
    }
    
    @Override
    public boolean isFriend() {
        return true;
    }

    @Override
    public boolean isEnnemy() {
        return false;
    }
    
}
