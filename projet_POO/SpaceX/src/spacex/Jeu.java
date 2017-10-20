/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacex;
import iut.Game;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author ac410813
 */
public class Jeu extends Game{

    public Jeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
    }
    
    public void drawBackground(Graphics g){
        Image img = Toolkit.getDefaultToolkit().createImage("images\\space-background.jpg");
        g.drawImage(img,0,0,null);
    }

    @Override
    public void createObjects() {
        Joueur j = new Joueur(this,"Joueur",-500,0);
        this.add(j);
        //Asteroide asteroid = new Asteroide()
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void perdu() {
        JOptionPane.showMessageDialog(this,"Perdu ...");
    }

    @Override
    public void gagne() {
        JOptionPane.showMessageDialog(this,"Gagné !");
    }
    
    public boolean aGagne(){
        return false;
    }
    
    public boolean aPerdu(){
        return false;
    }
}
