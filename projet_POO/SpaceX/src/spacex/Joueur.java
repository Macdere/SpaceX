/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacex;
import iut.Game;
import iut.ObjetTouchable;
import iut.Objet;
/**
 *
 * @author ac410813
 */
public class Joueur extends ObjetTouchable{
    private int vie=3;
    private double vitesse=4;
    private String nom;
    private boolean bloque = false;

    public Joueur(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.nom = nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void effect(Objet o){
        if (o.isEnnemy()){
            this.vie -= 1;
            if (this.vie==0){
                super.game().remove(this);
            }
        }
        else {
            
        }
    }
    
    public boolean isFriend(){
        return false;
    }
    
    public boolean isEnnemy(){
        return false;
    }
    
    public void move(long dt){
        
    }
    
    public void ajouteBonus(BonusMalus b){
        
    }
    
    public void enleveBonus(BonusMalus b){
        
    }
    
    public void debloque(){
        this.bloque = false;
    }
    
    public void bloque(){
        this.bloque = true;
    }
    
}
