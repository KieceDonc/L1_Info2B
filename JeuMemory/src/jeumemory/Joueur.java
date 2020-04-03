/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author vv224843
 */
public class Joueur {
    
    private String pseudo;
    private Famille famillepref;
    private LesPersonnages enPossession;
    private ImageIcon imgJoueur;
    private int score;
    
    public Joueur(String pseudo){
        
    }

    public Joueur(String pseudo, ImageIcon imgJoueur) {
        this(pseudo,imgJoueur,null);
    }
    
    public Joueur(String pseudo, Famille famille) {
        this(pseudo,null,famille);
    }
    
    public Joueur(String pseudo, ImageIcon imgJoueur, Famille famille){
        setPseudo(pseudo);
        if(imgJoueur!=null){
            setImgJoueur(imgJoueur);
        }else{
            setImgJoueur(new ImageIcon(getClass().getResource("/jeumemory/img/joueurDefaut.jpg")));
        }
        setScore(0);
        setEnPossession(new LesPersonnages());
        if(famille!=null){
            setFamillepref(famille);
        }else{
            setFamillepref(Famille.communs);
        }
    }
    
    public String getPseudo() {
        return pseudo;
    }

    private void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Famille getFamillepref() {
        return famillepref;
    }

    public void setFamillepref(Famille famillepref) {
        this.famillepref = famillepref;
    }

    public LesPersonnages getEnPossession() {
        return enPossession;
    }

    private void setEnPossession(LesPersonnages enpossession) {
        this.enPossession = enpossession;
    }

    public int getScore() {
        return score;
    }

    private void setScore(int score) {
        this.score = score;
    }

    public ImageIcon getImgJoueur() {
        return imgJoueur;
    }

    private void setImgJoueur(ImageIcon imgJoueur) {
        this.imgJoueur = imgJoueur;
    }
    
    public void ajoutePersoPaquet(Personnage p) {
        this.enPossession.ajoutePerso(p);
    }
    
    public LesPersonnages getPaquet(){
        return this.enPossession;
    }
    
    public void initPaquetTest(){
        ajoutePersoPaquet(new Personnage(Famille.communs,"assault-trooper", 10));
        ajoutePersoPaquet(new Personnage(Famille.communs, "commando", 20));
        ajoutePersoPaquet(new Personnage(Famille.rares, "absolute-zero", 10));
    }
    
    /**
     * on souhaite vérifier si le joueur a choisi une famille préférée qui est dans le niveau de difficulté
     * @param chosenDifficulty 
     * @return 
     */
    public boolean isPlayerValidCompareToDifficulty(int chosenDifficulty){
        if(famillepref.getDifficulty()<=chosenDifficulty){
            return true;
        }
        return false;
    }
    
    public boolean equals(Joueur j){
        return j.getPseudo().equals(this.pseudo)
               /*&&
               j.getFamillepref().equals(this.famillepref)
               &&
               j.getEnPossession().equals(this.enPossession)
               &&
               j.getScore()==this.score
               &&
               j.getImgJoueur().equals(this.imgJoueur)*/;
    }

    public String toString() {
        String toReturn = "Joueur " + pseudo + "\nfamille préféré:";
        
        if(famillepref==null){
            toReturn+=" aucune";
        }else{
            toReturn+=" "+famillepref.toString();
        }
        
        toReturn+="\nen possession des personnages:";
        
        if(enPossession==null){
            toReturn+=" aucun";
        }else{
            toReturn+=" "+enPossession.toString();
        }
        
        toReturn+="\nscore :" + score;
        
        return toReturn;
   }
    
}
