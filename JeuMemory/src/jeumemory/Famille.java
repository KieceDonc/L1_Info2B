/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

/**
 *
 * @author Valentin
 */
public class Famille {
    
    public static Famille communs = new Famille("communs",4);
    public static Famille rares = new Famille("rares",4);
    public static Famille alpinsFemmes = new Famille("alpins-femmes",10);
    public static Famille asDesPistes = new Famille("as-des-pistes",10);
    public static Famille epiques = new Famille("epiques",18);
    public static Famille legendaires = new Famille("legendaires",18);
    
    private String nom; 
    private int difficulty; // difficulty représente le niveau de difficulté à partir du quel on retrouve pour la première fois cette famille

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public Famille(String nom,int difficulty) {
        this.nom = nom;
        this.difficulty = difficulty;
    }
    
}
