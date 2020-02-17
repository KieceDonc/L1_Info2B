/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_info2b;

import java.awt.Image;
import java.util.Objects;

/**
 *
 * @author vv224843
 */
public class Joueur {
    
    private String pseudo;
    private String famillepref;
    private LesPersonnages enpossession;
    private Image imgJoueur;
    private int score;

    public Joueur(String pseudo, Image imgJoueur) {
        setPseudo(pseudo);
        setImgJoueur(imgJoueur);
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

    public LesPersonnages getEnpossession() {
        return enpossession;
    }

    private void setEnpossession(LesPersonnages enpossession) {
        this.enpossession = enpossession;
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

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.pseudo, other.pseudo)) {
            return false;
        }
        if (!Objects.equals(this.famillepref, other.famillepref)) {
            return false;
        }
        if (!Objects.equals(this.enpossession, other.enpossession)) {
            return false;
        }
        if (!Objects.equals(this.imgJoueur, other.imgJoueur)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
