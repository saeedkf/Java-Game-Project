/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JP
 */
public class GameBoard extends JPanel implements KeyListener{
    
    Player player; 
    PushBox pushBox; 
    DoorToNextWorld door;
        
        //PLAYER
        int xPos = 0; 
        int yPos = 0; 
        int width = 20; 
        int height = 20;
        int energyLevel = 100;
        
        //BOX
        int xBoxPos = 100;
        int yBoxPos = 100; 
        int boxWidth = 20;
        int boxHeight = 20;
        
        //DOOR
        int xDoorPos = 200;
        int yDoorPos = 200; 
        int doorWidth = 20;
        int doorHeight = 20;
       
        
    
        public GameBoard(){
        
        // SETUP PLAYER ON THE BOARD;
        
        
        player = new Player(xPos, yPos, width, height, Color.BLUE){};
        
        // SETUP ENEMY ON THE BOARD;
        
        pushBox = new PushBox(xBoxPos, yBoxPos, boxWidth, boxHeight ,Color.RED);
        
        door = new DoorToNextWorld (xDoorPos, xDoorPos, doorWidth, doorHeight, Color.BLACK);
        addKeyListener(this);
        
        
    }
    
    
    /*
     * 
     * JPanel function to display all gameBoard object graphics.
     */
    
    @Override
    public void paint(Graphics g){
        super.paint(g); // Call it's parent for proper rendering.
        player.display(g);
        pushBox.display(g);
        door.display(g);
        g.drawString("Energy level " + energyLevel , 150, 20);
        
    }

    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
             player.moveLeft();
             xPos = xPos - player.pxToMove;
             if(xPos == xBoxPos && yPos == yBoxPos){
                pushBox.moveLeft();
                xBoxPos = xBoxPos - pushBox.pxToMove;
                energyLevel();
             }
         }
         
         if (keyCode == KeyEvent.VK_RIGHT) {
             player.moveRight();
             xPos = xPos + player.pxToMove;
             if(xPos == xBoxPos && yPos == yBoxPos){
                pushBox.moveRight();
                xBoxPos = xBoxPos + pushBox.pxToMove;
                energyLevel();
                }   
         }
         
         if (keyCode == KeyEvent.VK_DOWN) {
             player.moveDown();
             yPos = yPos + player.pxToMove;
             if(yPos == yBoxPos && xPos == xBoxPos){
                pushBox.moveDown();
                yBoxPos = yBoxPos + pushBox.pxToMove;
                energyLevel();
            }
        }
         
         if (keyCode == KeyEvent.VK_UP) {
             player.moveUp();
             yPos = yPos - player.pxToMove;
             if(yPos == yBoxPos && xPos == xBoxPos){
                pushBox.moveUp();
                yBoxPos = yBoxPos - pushBox.pxToMove;
                energyLevel();
         }    
    }  
    positionOfBox();  
    
    gameOver();
    
    }
    
    public void positionOfBox (){
        
        if(xBoxPos == xDoorPos && yBoxPos == yDoorPos ){
            JOptionPane.showMessageDialog(null, "Next Location");
            System.exit(0);            
            
        }
    }
    
    
    public void energyLevel(){
        
        if (energyLevel>=-5){
            energyLevel = energyLevel -5;
        }
        
        if(energyLevel < 0) {
            
            try {               
                Thread.sleep(3000);
                energyLevel = 100;
            } catch (InterruptedException ex) {
                Logger.getLogger(GameBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
        }
    }
    
    public void gameOver(){
    if (xPos == xDoorPos && yPos == yDoorPos ){
            JOptionPane.showMessageDialog(null, "GAME OVER !");
            System.exit(0);
        }
    }    
    
    public void gameUpdate(){
    GameBoard gB = new GameBoard();
    }
    
    
    @Override
    public void keyReleased(KeyEvent e) {}
    
    
    /**
     * Set's focus on the panel so key events are catch. 
     */
    
    public boolean isFocusTraversable() {
        return true;
    }
    
}
