/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vvdev.info2b_tp6;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Valentin
 */
public class Bille {
    
    private Color color;
    private int x,y,width,height;

    public Bille(int x, int y,int width,int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }
    
    public Bille(int x, int y,int width,int height,Color color) {
        this(x,y,width,height);
        setColor(color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        if(color==null){
            return Color.BLACK;
        }
        return color;
    }

    public void setColor(Color color) {
        System.out.println(color.toString());
        this.color = color;
    }
    
    public void moveX(int x){
        setX(this.x+x);
    }
    
    public void moveY(int y){
        setY(this.y+y);
    }
    
    public void drawBille(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
    
    
    
}
