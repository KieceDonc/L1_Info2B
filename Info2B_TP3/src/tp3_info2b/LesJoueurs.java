/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_info2b;

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
    
    public int getNbJoueurs(){
        return listJ.size();
    }
    
    public void ajouteJoueur(Joueur j){
        listJ.add(j);
    }
    
    public Joueur rechJoueur(String p){
        for(int x=0;x<getNbJoueurs();x++){
            if(getJoueur(x).getPseudo().equals(p)){
                return getJoueur(x);
            }
        }
        return null;
    }
    
    public void supprimeJoueur(Joueur J){
        for(int x=0;x<getNbJoueurs();x++){
            if(getJoueur(x).equals(J)){
                listJ.remove(J);
            }
        }
    }
    
    public LesJoueurs getGagnants(){  
        int max=getJoueur(0).getScore();
        for(int i=1; i<getNbJoueurs();i++){
            if (getJoueur(i).getScore()>max){
                max=this.getJoueur(i).getScore();
            }
        }
        LesJoueurs lst=new LesJoueurs();
        for(int i=0; i<getNbJoueurs();i++){
            if (getJoueur(i).getScore()==max){
                lst.ajouteJoueur(getJoueur(i));
            }
        }
        return lst;
    }

    @Override
    public String toString() {
        String toReturn="";
        for(int x=0;x<getNbJoueurs();x++){
            toReturn+=getJoueur(x).toString();
        }
        return toReturn;
    } 
    
}
