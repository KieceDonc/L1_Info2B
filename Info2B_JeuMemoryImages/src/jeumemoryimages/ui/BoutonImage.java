/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemoryimages.ui;

import java.awt.*; 
import javax.swing.*; 

/**
 *
 * @author Valentin
 */
public class BoutonImage extends JButton {      
    
    private Image img;
    
    public BoutonImage(){  
        super();
        this.img=null;
    }       
    
    public BoutonImage(Image im){   
        super(); 
        this.img=im;
    }    
    
    public Image getImage() {
        return this.img;
    }     
    
    public void setImage(Image im) { 
        this.img=im;
        this.repaint();
    }     
    
    @Override     
    public void paint(Graphics g) {
        super.paint(g);
        if (this.img != null){ 
            Image imgB = this.img.getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_DEFAULT); 
            this.setIcon(new ImageIcon(imgB));
        }     
    } 
} 