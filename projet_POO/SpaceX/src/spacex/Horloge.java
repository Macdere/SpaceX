/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacex;

import iut.Game;
import iut.Objet;
import java.awt.Graphics;

/**
 *
 * @author vd195189
 */
public class Horloge extends Game {
    
    private long heureDebut;

    public Horloge(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
    }
    
    public void Horloge(Game g, Niveau n){
    
    }
    
    public boolean collision(Objet o){
        return false ;
    }
    
    public void effect(Objet o){
        
    }
    
    public boolean isFriend(){
        return false;
    }
    
    public boolean isEnnemy(){
        return false;
    }
    
    public void move(long dt){
        
    }
    
    public void ChangeNiveau(Niveau n){
        
    }

    @Override
    protected void createObjects() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void drawBackground(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void perdu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void gagne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean aGagne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected boolean aPerdu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
