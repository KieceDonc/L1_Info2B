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
public class Personnage {
    
    private Famille famille;
    private String nom;
    private int valeur;
    private Image photo;
    
    public Personnage(Famille famille, String nom, int valeur){
        setFamille(famille);
        setNom(nom);
        setValeur(valeur);
        setPhoto(nom);
    }

    public Famille getFamille() {
        return famille;
    }

    private void setFamille(Famille famille) {
        this.famille = famille;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    private void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Image getPhoto() {
        return photo;
    }

    private void setPhoto(String nom) {
        this.photo=new ImageIcon(getClass().getResource("/jeumemory/img/"+nom+".jpg")).getImage();
    }
    
    @Override
    public String toString(){
        return "famille: "+famille+", nom: "+nom+", valeur: "+valeur+", chemin d'accès: memory/img/"+nom+".png";
    }
    
    
    
}
