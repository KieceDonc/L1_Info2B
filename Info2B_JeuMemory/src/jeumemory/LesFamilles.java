/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Valentin
 */
public class LesFamilles {
    
    public static ArrayList<Famille> lstFamilles = new ArrayList<>(Arrays.asList(
            Famille.communs,
            Famille.rares,
            Famille.alpinsFemmes,
            Famille.asDesPistes,
            Famille.epiques,
            Famille.legendaires
    ));
    
    public static Famille getFamilleByName(String s){ // On a le nom d'une famille a partir d'un string et on souhaite avoir l'objet famille
        Famille toReturn = null;
        if(s!=null&&s.length()>=6){
            int cmpt=0;
            boolean founded=false;
            do{
                if(lstFamilles.get(cmpt).getNom().equals(s)){
                    founded=true;
                    toReturn = lstFamilles.get(cmpt);
                }
                cmpt++;
            }while(cmpt<lstFamilles.size()&&!founded);
        }
        return toReturn;      
    }
}
