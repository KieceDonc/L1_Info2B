/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

/**
 *
 * @author vv224843
 */
import java.util.ArrayList;

public class LesPersonnages {
    
    private ArrayList<Personnage> persos;

    public ArrayList<Personnage> getPersos() {
        return persos;
    }
    
    public LesPersonnages() {
      this.persos = new ArrayList<Personnage>();
    }
    
    public LesPersonnages(int nc) {
        this.persos = new ArrayList<Personnage>();
        if (nc >= 4){ // 2 familles
            ajoutePerso(new Personnage(Famille.communs, "assault-trooper", 10));
            ajoutePerso(new Personnage(Famille.communs, "commando", 20));
            ajoutePerso(new Personnage(Famille.rares, "absolute-zero", 10));
            ajoutePerso(new Personnage(Famille.rares, "arctice-assassin", 20));
        }
        if (nc >= 10){ // 4 familles
            ajoutePerso(new Personnage(Famille.communs, "devestrator", 30));
            ajoutePerso(new Personnage(Famille.rares, "brawler", 30));
            ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master", 10));
            ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master-can", 20));
            ajoutePerso(new Personnage(Famille.asDesPistes, "alpine-ace", 10));
            ajoutePerso(new Personnage(Famille.asDesPistes, "alpine-ace-can", 20));
        }
        if (nc >= 18){ // 6 familles

            ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master-chn", 30));
            ajoutePerso(new Personnage(Famille.asDesPistes, "alpine-ace-chn", 30));
            ajoutePerso(new Personnage(Famille.legendaires, "power-chord", 10));
            ajoutePerso(new Personnage(Famille.legendaires, "raptor", 20));
            ajoutePerso(new Personnage(Famille.legendaires, "raven", 30));
            ajoutePerso(new Personnage(Famille.epiques, "burnout", 10));
            ajoutePerso(new Personnage(Famille.epiques, "funk-ops", 20));
            ajoutePerso(new Personnage(Famille.epiques, "rex", 30));
        }
        if (nc == 32){ // 6 familles
            ajoutePerso(new Personnage(Famille.communs, "dominator", 40));
            ajoutePerso(new Personnage(Famille.communs, "highrise-assault-trooper", 50));
            ajoutePerso(new Personnage(Famille.communs, "jungle-scout", 60));
            ajoutePerso(new Personnage(Famille.communs, "pathfinder", 70));
            ajoutePerso(new Personnage(Famille.rares, "brilliant-striker", 40));
            ajoutePerso(new Personnage(Famille.rares, "brite-bomber", 50));
            ajoutePerso(new Personnage(Famille.rares, "circuit-breaker", 60));
            ajoutePerso(new Personnage(Famille.rares, "dazzle", 70));
            ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master-fra", 40));
            ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master-gbr", 50));
            ajoutePerso(new Personnage(Famille.asDesPistes, "alpine-ace-fra", 40));
            ajoutePerso(new Personnage(Famille.asDesPistes, "alpine-ace-gbr", 50));
            ajoutePerso(new Personnage(Famille.legendaires, "red-knight", 40));
            ajoutePerso(new Personnage(Famille.epiques, "shadow-ops", 40));
        }
    }
         
     public int getTaille() { 
         return this.persos.size(); 
     }
     
    public int getScore(){   
        int sc = 0;
        for(int i=0; i<getTaille(); i++)
           sc+=getPerso(i).getValeur();
        return sc;
    }
          
    public Personnage getPerso(int i){
        if (i>=0 && i<this.persos.size())
             return this.persos.get(i);
        else return null;
    }
    
    public LesPersonnages getPersosFamille(String f)
    {   LesPersonnages lp = new LesPersonnages();
        for(int i=0; i<getTaille(); i++)
            if(getPerso(i).getFamille().getNom().equals(f))
                lp.ajoutePerso(getPerso(i));
        return lp;
    }
    
    public void retirePerso(Personnage p)
    { 
        int i=0; 
        boolean trouve = false;
        while(i<getTaille() && !trouve){
          if (getPerso(i).getNom().equals(p.getNom())){
              this.persos.remove(i);  
              trouve = true;
          }
          else i++;
        }      
    }
    
    public void retirePerso(int index){ 
        if(index>=0&&index<getTaille()){
            this.persos.remove(index);
        }
    }

    
    public void retirePersosFamille(String f){ 
        ArrayList<Personnage> newArray = new ArrayList();
        for(int x=0;x<getTaille();x++){
            Personnage current = persos.get(x);
            if(!current.getFamille().getNom().equals(f)){
                newArray.add(current);
            }
        }
        this.persos = newArray;
    }
    
    public ArrayList<String> getStringToutesLesFamilles(){
        ArrayList<String> toReturn = new ArrayList<>();
        for(int x=0;x<getTaille();x++){
            boolean alreadyAdded = false;
            String toParse = getPerso(x).getFamille().getNom();
            int cmpt = 0;
            if(toReturn.size()>0){
                do{
                    if(toParse.equals(toReturn.get(cmpt))){
                        alreadyAdded=true;
                    }
                    cmpt++;
                }while(!alreadyAdded&&cmpt<toReturn.size());
            }
            if(!alreadyAdded){
                toReturn.add(toParse);
            }
        }
        return toReturn;
    }
     
    public void retireCartes()
    { 
           persos.clear();
    }
    
    public void ajoutePerso(Personnage personnage) {
        persos.add(personnage);
    }
    
    public void ajoutePersos(LesPersonnages personnages){
        for(int x=0;x<personnages.getTaille();x++){
            this.ajoutePerso(personnages.getPerso(x));
        }
    }
	@Override
    public String toString() {
        String s = "";
        for(int i=0; i<getTaille(); i++)
            s+=i+"- "+getPerso(i).toString();
       return s;
    }
}

