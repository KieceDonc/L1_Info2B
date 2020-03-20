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
            if(getPerso(i).getFamille().equals(f))
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
    
   public LesPersonnages retirePersos(int n)
    { LesPersonnages lcr = new LesPersonnages();
        for (int i=0; i<=n; i++)
        {
            lcr.ajoutePerso(getPerso(0));
            this.persos.remove(0);  
        }
        return lcr;
    } 
    
    public LesPersonnages retirePersosFamille(String f)
    { 
        LesPersonnages lcr = new LesPersonnages();
        int i = 0;
        while(i<getTaille()){
            if (getPerso(i).getFamille().equals(f)) {
                lcr.ajoutePerso(getPerso(i));
                this.persos.remove(i);  
            }
            else i++;
        }
        return lcr;
    }
    
    public ArrayList<String> getStringToutesLesFamilles(){
        ArrayList<String> toReturn = new ArrayList<>();
        for(int x=0;x<getTaille();x++){
            boolean alreadyAdded = false;
            String toParse = getPerso(x).getFamille();
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
    
	@Override
    public String toString() {
        String s = "";
        for(int i=0; i<getTaille(); i++)
            s+=i+"- "+getPerso(i).toString();
       return s;
    }
	
    public LesPersonnages(int nc) {
        this.persos = new ArrayList<Personnage>();
        if (nc >= 4){ // 2 familles
            ajoutePerso(new Personnage("communs", "assault-trooper", 10));
            ajoutePerso(new Personnage("communs", "commando", 20));
            ajoutePerso(new Personnage("rares", "absolute-zero", 10));
            ajoutePerso(new Personnage("rares", "arctice-assassin", 20));
        }
        if (nc >= 10){ // 4 familles
            ajoutePerso(new Personnage("communs", "devestrator", 30));
            ajoutePerso(new Personnage("rares", "brawler", 30));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-can", 20));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace", 10));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-can", 20));
        }
        if (nc >= 18){ // 6 familles

            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-chn", 30));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-chn", 30));
            ajoutePerso(new Personnage("legendaires", "power-chord", 10));
            ajoutePerso(new Personnage("legendaires", "raptor", 20));
            ajoutePerso(new Personnage("legendaires", "raven", 30));
            ajoutePerso(new Personnage("epiques", "burnout", 10));
            ajoutePerso(new Personnage("epiques", "funk-ops", 20));
            ajoutePerso(new Personnage("epiques", "rex", 30));
        }
        if (nc == 32){ // 6 familles
            ajoutePerso(new Personnage("communs", "dominator", 40));
            ajoutePerso(new Personnage("communs", "highrise-assault-trooper", 50));
            ajoutePerso(new Personnage("communs", "jungle-scout", 60));
            ajoutePerso(new Personnage("communs", "pathfinder", 70));
            ajoutePerso(new Personnage("rares", "brilliant-striker", 40));
            ajoutePerso(new Personnage("rares", "brite-bomber", 50));
            ajoutePerso(new Personnage("rares", "circuit-breaker", 60));
            ajoutePerso(new Personnage("rares", "dazzle", 70));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-fra", 40));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-gbr", 50));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-fra", 40));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-gbr", 50));
            ajoutePerso(new Personnage("legendaires", "red-knight", 40));
            ajoutePerso(new Personnage("epiques", "shadow-ops", 40));
        }
    }

    private void ajoutePerso(Personnage personnage) {
        persos.add(personnage);
    }
    
    private void ajoutePersos(LesPersonnages personnages){
        for(int x=0;x<personnages.getTaille();x++){
            ajoutePerso(personnages.getPerso(x));
        }
    }
}

