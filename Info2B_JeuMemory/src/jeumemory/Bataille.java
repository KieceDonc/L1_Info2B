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
public class Bataille extends Action {
    
    private Joueur ad; // Joueur adverse

    public Joueur getAdversaire() {
        return ad;
    }
    
    public Bataille(Joueur j,Joueur ad){
        super(j,"Bataille");
        this.ad=ad;
    }

    @Override
    public int execute() {
        LesPersonnages paquetJ = getJoueurCourant().getEnPossession(); // paquet du joueur qui a déclenché l'action
        LesPersonnages paquetAd = ad.getEnPossession(); // paquet du joueur adversaire
        int result =-1;
        if(paquetJ.getTaille()>0&&paquetAd.getTaille()>0){
            Personnage carteJ = paquetJ.getPerso(0); // on récupère la première carte du paquet du joueur
            Personnage carteAd = paquetAd.getPerso(0); // on récupère la première carte du paquet du joueur
            paquetJ.retirePerso(0); // on retire la première carte du joueur
            paquetAd.retirePerso(0); // on retire la première carte de l'adversaire
            int valueJ = carteJ.getValeur(); // on récupère la valeur de la carte du joueur
            int valueAd = carteAd.getValeur();// on récupère la valeur de la carte de l'adversaire
            if(valueJ==valueAd){ 
                result=0;
                paquetJ.ajoutePerso(carteJ);
                paquetAd.ajoutePerso(carteAd);
            }else{
                if(valueJ>valueAd){
                    result=1;
                    paquetJ.ajoutePerso(carteJ);
                    paquetJ.ajoutePerso(carteAd);
                }else{
                    result=2;
                    paquetAd.ajoutePerso(carteAd);
                    paquetAd.ajoutePerso(carteJ);
                }
            }
            if(paquetJ.getTaille()==0){
                result=-1;
                setDeroulement(ad.getPseudo()+" a gagné contre "+getJoueurCourant().getPseudo());
            }
            if(paquetAd.getTaille()==0){
                result=-1;
                setDeroulement(getJoueurCourant().getPseudo()+" a gagné contre "+ad.getPseudo());
            }
        }
        return result;
    }
}
