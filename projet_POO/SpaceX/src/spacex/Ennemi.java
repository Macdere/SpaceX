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
 * @author vd195189
 *//**
 *
 * @author vd195189
 */
public abstract class Ennemi extends ObjetTouchable {
    
    private double vitesseX;
    private double vitesseY;

    public Ennemi(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }
    
    public void effect(Object o){
        
    }
    
    public boolean isFriend(){
        return false ;
    }
    
    public boolean isEnnemy(){
        return false;
    }
    
    public void move(long dt){
        
    }
    
    protected void specialMove(long dt){
        
    }
    
    protected boolean isDestructible(){
        return false;
    }
    
    protected void Detruit(){
        
    }
    
}
