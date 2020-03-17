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
    private String famillepref;
    private LesPersonnages enPossession;
    private ImageIcon imgJoueur;
    private int score;

    public Joueur(String pseudo, ImageIcon imgJoueur) {
        setPseudo(pseudo);
        setImgJoueur(imgJoueur);
        setScore(0);
        setEnPossession(new LesPersonnages());
    }
    
    public String getPseudo() {
        return pseudo;
    }

    private void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getFamillepref() {
        return famillepref;
    }

    private void setFamillepref(String famillepref) {
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
        return "Joueur " + pseudo + "\nfamille préféré:" + famillepref + "\nen possession des personnages:" + enPossession + "\nscore :" + score;
   }
    
    
    
    
    
    
    
    
}
