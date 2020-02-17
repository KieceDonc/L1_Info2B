/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.awt.Image;

/**
 *
 * @author vv224843
 */
public class Joueur {
    
    private String pseudo;
    private String famillepref;
    private LesPersonnages enPossession;
    private Image imgJoueur;
    private int score;

    public Joueur(String pseudo, Image imgJoueur) {
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

    public Image getImgJoueur() {
        return imgJoueur;
    }

    private void setImgJoueur(Image imgJoueur) {
        this.imgJoueur = imgJoueur;
    }

    public String property() {
        return "Joueur " + pseudo + "\nfamille préféré:" + famillepref + ", en possession des personnages:" + enPossession + "score :" + score;
    }
    
    
    
    
    
    
    
    
}
