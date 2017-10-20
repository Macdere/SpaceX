/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacex;

import iut.Game;

/**
 *
 * @author vd195189
 */
public abstract class Vaisseau extends Ennemi {
    
    private boolean indestructible;

    public Vaisseau(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }
    
}
