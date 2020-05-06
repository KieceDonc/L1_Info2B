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
    private Action act;
    private int indC; // indice du joueur courant
    private int difficulty;
    
    
    public Jeu(LesPersonnages lp, LesJoueurs lj, int nbc,int difficulty){ // nbc  nombre case
        this.lstPerso=lp;
        this.plateau=new PlateauJeu(nbc);
        this.lstPlayers=lj;
        this.act=null;
        this.indC=0;
        this.difficulty = difficulty;
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
            boolean otherPlayersGotCards = false;
            int cmpt=0;
            do{ // on vérifie que les autres joueurs ont des cartes
                Joueur toParse = lstPlayers.getJoueur(cmpt);
                if(!toParse.equals(jo)){ // on vérifie qu'il ne s'agit pas de notre joueur courant
                    if(toParse.getEnPossession().getTaille()>0){ // un joueur a au moins plus une carte
                        otherPlayersGotCards=true;
                    }   
                }
                cmpt++;
            }while(cmpt<lstPlayers.getNbJoueurs()&&!otherPlayersGotCards);
            if(otherPlayersGotCards){ // si les autres joueurs ont des cartes
                int[] joNbCartesParFamille = getJoNbCartesParFamille(jo); // Représente le nombre de carte communs / rares / legendaires / epiques que le joueur a
                if(Famille.communs.getNbMaxPerso()==joNbCartesParFamille[0]||Famille.rares.getNbMaxPerso()==joNbCartesParFamille[1]){ // on vérifie si le perso gagné appartient à la famille communs ou rares
                    return 1;
                }else if(difficulty>=18){ // on vérifie le jeu contient des personnages legendaires / epiques sinon la condition dessous sera vérifié ( ex : aucun légendaire et le joueur n'a aucun légendaire )
                    if(Famille.legendaires.getNbMaxPerso()==joNbCartesParFamille[2]||Famille.epiques.getNbMaxPerso()==joNbCartesParFamille[3]){
                        return 2;
                    }
                } 
            }
        }
        return -1; // aucun des cas valide
    }
    
    /**
     * Récupère le nombre de carte communs / rares / legendaires / epiques que le joueur a
     * @param jo Joueur courant
     * @return 0 = Taille communs, 1 = Taille rares, 2 = Taille legendaires, 3 = Taille epiques
     */
    public int[] getJoNbCartesParFamille(Joueur jo){
        LesPersonnages enPossession =  jo.getEnPossession();
        int communs = enPossession.getPersosFamille(Famille.communs.getNom()).getTaille(); // récupère le nombre de carte communs obtenu par le joueur
        int rares = enPossession.getPersosFamille(Famille.rares.getNom()).getTaille(); // récupère le nombre de carte rares obtenu par le joueur
        int legendaires = enPossession.getPersosFamille(Famille.legendaires.getNom()).getTaille(); // récupère le nombre de carte legendaires obtenu par le joueur
        int epiques = enPossession.getPersosFamille(Famille.epiques.getNom()).getTaille();// récupère le nombre de carte epiques obtenu par le joueur 
        return new int[]{communs, rares, legendaires, epiques};
    }
}
