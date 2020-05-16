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
public class Transfert extends Action{
    
    private Joueur jCible;
    private LesPersonnages cartesTransferees;
    private String fp; // famille perso
    
    private final static String descAction = "Transfert de  cartes";

    public Transfert(Joueur jCourant, Joueur jCible, String fp) {
        super(jCourant, descAction);
        this.jCible = jCible;
        this.fp = fp;    
    }

    public Joueur getjCourant() {
        return super.getJoueurCourant();
    }   

    public Joueur getJoueurCible() {
        return jCible;
    }

    public LesPersonnages getCartesTransferees() {
        return cartesTransferees;
    }

    @Override
    public int execute() {
        if(fp!=null){
            cartesTransferees = jCible.getEnPossession().getPersosFamille(fp);// on récupère la liste de tout les personnages qui vont êtes transférées
            jCible.getEnPossession().retirePersosFamille(fp);
            getjCourant().getEnPossession().ajoutePersos(cartesTransferees);
            super.setDeroulement(getjCourant().getPseudo()+" a prit la famille "+fp+" à "+jCible.getPseudo());
            return cartesTransferees.getTaille();
        }else{
            return 0;
        }
    }
    
    
        
}
