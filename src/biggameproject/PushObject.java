/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PushObject {
    
    private int x; 
    private int y; 
    private int width; 
    private int height;
    private Color color;
    
    public void display(Graphics g){
        
        // This is player rendered graphics.
        Graphics2D graphics = (Graphics2D) g;    // Graphical library to render shapes.
        graphics.setColor(color);
        graphics.drawRect(x, y, width, height);
        graphics.fillRect(x, y, width, height);
        //graphics.
    }
    
    
    
    public PushObject(int x, int y, int w, int h, Color c){
        
        this.x = x; 
        this.y = y; 
        this.width = w; 
        this.height = h;
        this.color = c;
        
       
    }
    
    private int pxToMove = 20;
    public void moveLeft(){
        
        x = x - pxToMove;
    }
    
    public void moveRight(){
        
        x = x + pxToMove;
    }
    
    public void moveDown(){
        
        y = y + pxToMove;
    }
    
    public void moveUp(){
        
         y = y - pxToMove;
    }
    
}
