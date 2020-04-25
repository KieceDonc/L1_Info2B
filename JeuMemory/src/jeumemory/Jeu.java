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
public class Jeu {
    
    private LesPersonnages lstPerso;
    private PlateauJeu plateau;
    private LesJoueurs lstPlayers;
    private int indC; // indice du joueur courant
    private Action act;
    
    
    public Jeu(LesPersonnages lp, LesJoueurs lj, int nbc){ // nbc  nombre case
        this.lstPerso=lp;
        this.plateau=new PlateauJeu(nbc);
        this.lstPlayers=lj;
        this.act=null;
        this.indC=0;
    }

    public LesPersonnages getLstPerso() {
        return lstPerso;
    }

    public void setLstPerso(LesPersonnages lstPerso) {
        this.lstPerso = lstPerso;
    }

    public PlateauJeu getPlateau() {
        return plateau;
    }

    public void setPlateau(PlateauJeu plateau) {
        this.plateau = plateau;
    }

    public LesJoueurs getLstPlayers() {
        return lstPlayers;
    }

    public void setLstPlayers(LesJoueurs lstPlayers) {
        this.lstPlayers = lstPlayers;
    }

    public int getIndiceJoueurCourant() {
        return indC;
    }

    public void setIndiceJoueurCourant(int indC) {
        this.indC = indC;
    }

    public Action getAct() {
        return act;
    }

    public void setAct(Action act) {
        this.act = act;
    }
    
    
    public int getIndiceJoueurSuivant(int j){
        return (j+1)%lstPlayers.getNbJoueurs();
    }
    
    public Joueur getJoueurCourant(){
        return lstPlayers.getJoueur(indC);
    } 
    
    public Joueur getJoueurSuivant(int j){
        return lstPlayers.getJoueur(getIndiceJoueurSuivant(j));
    }
    
    public boolean finJeu()  {
        return plateau.jeuVide();
    }
        
    public int nbPers(){
        int n = 0;
        for(int i = 0; i < lstPlayers.getNbJoueurs(); i++){
            if (i !=this.indC){
                n+=lstPlayers.getJoueur(i).getPaquet().getTaille();
            }
        }return n; 
    }
    
    /**
     * @param jo Le joueur courant (qui vient de jouer)
     * @param s L’indice du personnage qui a été gagné
     * @return 0 si le joueur a tous les personnages de sa famille préférée\n 1 si un transfert de cartespeut être réalisé\n 2 si une bataille peut être faite\n (3 si c’est un combat)\n -1 dans les autres cas
     */
    public int traiterTour(Joueur jo,int s){
        
        Personnage wonPerso = lstPerso.getPerso(s);
        jo.ajoutePersoPaquet(wonPerso);
        
        Famille pref = jo.getFamillepref();
        int prefTotal = pref.getNbMaxPerso();
        
        if(jo.getEnPossession().getPersosFamille(pref.getNom()).getTaille()==prefTotal){
            plateau.termineJeu();
            return 0;
        }else{
            boolean allOtherPlayerGotCards = true;
            for(int x=0;x<lstPlayers.getNbJoueurs();x++){
                Joueur current = lstPlayers.getJoueur(x); // on récupère un joueur dans la liste
                if(!current.equals(jo)){ // on vérifie qu'il ne s'agit pas du joueur courant
                    if(!(current.getEnPossession().getTaille()>0)){ // on vérifie que sa main n'est pas vide
                        allOtherPlayerGotCards=false;
                    }
                }
            }
            if(allOtherPlayerGotCards){
                if(wonPerso.getFamille().equals(Famille.rares)||wonPerso.getFamille().equals(Famille.communs)){ // on vérifie si le perso gagné appartient à la famille communs ou rares
                    return 1;
                }else{
                    if(wonPerso.getFamille().equals(Famille.legendaires)||wonPerso.getFamille().equals(Famille.epiques)){
                        return 2;
                    }else{
                        return 3;
                    }
                }
            }else{
                return -1;
            }
        }
    }
}
