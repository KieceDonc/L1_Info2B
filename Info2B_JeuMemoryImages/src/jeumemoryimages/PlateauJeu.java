/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemoryimages;

/**
 *
 * @author Valentin
 */
public class PlateauJeu {
    
    private int tab[][]; // plateau de jeu à 2 dimensions
    private int nbp; // nombre de personnages sur le plateau qui diminue au cours du jeu
    private int nblig; // nombre total de ligne
    private int nbcol; // nombre total de colonne 
    
    public PlateauJeu(int n){ // n = niveau de difficulté, pas le nombre de cae ! ( le constructeur calcul automatiquement le nombre de case ! ( difficulty*2 ))
        this.nbp=n;
        this.nblig=(int)(Math.sqrt(nbp*2));
        this.nbcol=nbp*2/nblig;
        this.tab=new int [this.nblig][this.nbcol];
        this.initPlateauJeu();
    }
    
    public PlateauJeu(){
        this(4); 
    }
    
    public int getNbLig() {
        return this.nblig;
    }
    
    public int getNbCol(){
        return this.nbcol;  
    }
    
    /**
     * @return nombre de personnage restant sur le plateau
     */
    public int getNbp(){   
        return this.nbp;
    }
    
    public void setCase(int l, int c,int value){
        tab[l][c]=value;
    }
    
    public int getCase(int l, int c){
        return tab[l][c];
    }
    
    /**
     * Permet de récupérer la position d'une case dans la plateau par rapport à son numéro ( ex : nbCoder = 8 alors pour un plateau 3*3 la 8 ième case : l = 2 et c = 2 )
     * @param caseCoder
     * @return 
     * 
     *   Colonne n°0 1 2
     *             _ _ _
     *Ligne n°0   |1 2 3|
     *        1   |4 5 6|
     *        2   |7 8 9|
     *             ¯ ¯ ¯
     * 
     */
    public int[] getCase(int caseCoder){
        int l=(int)Math.floor(caseCoder/(double)nbcol);
        int c= caseCoder-l*nbcol;
        return new int[]{l,c};
    }
    
    public int getNbc(){
        return this.nblig*this.nbcol/2; 
    }
    
    public void initPlateauJeu(){
        int k=0;
        for(int i=0; i<this.nblig; i++){        
            for(int j=0; j<this.nbcol; j++){
                tab[i][j]=(k++)%this.nbp;
            }    
        }
        melange();
    }
    
    
    public void invalide(int l1, int c1, int l2, int c2){
        tab[l1][c1]=-1;
        tab[l2][c2]=-1;
        nbp--;
    }
    
    public void melange(){
        int lig1,lig2,col1,col2,case1,case2;
        for(int x=0;x<1000;x++){
            lig1 = (int)(Math.random()*getNbLig());
            lig2 = (int)(Math.random()*getNbLig());
            col1 = (int)(Math.random()*getNbCol());
            col2 = (int)(Math.random()*getNbCol());
            case1 = getCase(lig1,col1);
            case2 = getCase(lig2,col2);
            setCase(lig1,col1,case2);
            setCase(lig2,col2,case1);
        }
    }
    
    public boolean jeuVide(){
        return nbp==0;
    }
    
    /**
     * Vérifie si une case est encore valide
     * @param l Ligne 
     * @param c Colonne
     * @return True si la case est valide sinon 
     */
    public boolean estValide(int l, int c){
        return tab[l][c]!=-1;
    }
    
    public void termineJeu(){
        for(int x=0;x<nblig;x++){
            for(int y=0;y<nbcol;y++){
                tab[x][y]=-1;
            }
        }
        nbp=0;
    }
}
