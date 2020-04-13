/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

/**
 * Cette classe a été crée dans le but d'être efficace contre un bug :
 * Un joueur pouvait démarrer le jeu en ayant une famille préférée qui n'était pas
 * disponible dans le lvl de difficulté. On doit donc avant de commencer vérifié
 * toutes les familles préférés de chaque joueur. Avoir une méthode getDifficulty()
 * liée à cette famille n'est donc pas de refus.
 * 
 * Procédé de l'ancien bug : 
 * 1- Paramètres -> Options -> Prendre le lvl Expert -> Valider 
 * 2- Paramètres -> Ajout joueur -> Prendre une famille de lvl 18 ou 32 -> Créer le personnage -> Valider
 * 3- Paramètres -> Options -> Prendre le lvl Débutant -> Valider
 * 4- Démarrer
 * Le joueur a donc une famille préférée de lvl suppérieur à débutant, le joueur ne gagnera jamais ....
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
    
    public boolean equals(Famille f){
        if(f!=null){
            return f.getNom().equals(nom)&&f.getDifficulty()==difficulty;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return nom;
    }
    
}
