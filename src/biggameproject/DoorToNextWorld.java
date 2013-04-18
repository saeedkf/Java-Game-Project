/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author JP
 */
public class DoorToNextWorld {
    
    private int x; 
     private int y; 
     private int width; 
     private int height; 
     private Color color; 
   
     /** 
     *  Class constructor. Called when instantiated.
     *  Assigns x and y coordinates to position the player. 
     *  Sets width, height and color to the rendered object.
     * 
     */
    
    public DoorToNextWorld(int x, int y, int w, int h, Color c){
        
        this.x = x; 
        this.y = y; 
        this.width = w; 
        this.height = h;
        this.color = c;
        
       
    }
    
    /**
     * Accepts Graphics object to render 
     * player 1 shape
     */
    
    public void display(Graphics g){
        
        // This is player rendered graphics.
        Graphics2D graphics = (Graphics2D) g;    // Graphical library to render shapes.
        graphics.setColor(color);
        graphics.drawRect(x, y, width, height);
        graphics.fillRect(x, y, width, height);
        //graphics.
    }
    
}
