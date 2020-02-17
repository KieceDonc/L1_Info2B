/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.util.ArrayList;

/**
 *
 * @author vv224843
 */
public class LesJoueurs {
    
    private ArrayList<Joueur> listJ = new ArrayList();
    
    public Joueur getJoueur(int i){
        return listJ.get(i);
    }
    
    public int getIndiceJoueur(Joueur j){
        return listJ.indexOf(j);
    }
    
    
}
