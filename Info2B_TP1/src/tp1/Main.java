/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author vv224843
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   LesChiffres lc = new LesChiffres();
                   lc.setSize(800,800);
                   lc.setTitle("Les Chiffres");
                   lc.setVisible(true);
            }
        });
    }
    
}
