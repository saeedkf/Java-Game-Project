/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author JP
 */
public class JFrameDesign {
    
    public final String TITLE = "Game Project";
    /**
     * Sets width of the frame
     */
    public static final int WIDTH = 400; 
    /**
     * Sets height of the frame
     */
    public static final int HEIGHT = 400; 
  
   
    // Main window ( frame )  This where the game is creted. 
    // To the window u can add components. Like a gameBoard
    
    JFrame jframe;            
     
    // This is player component, drawn on the frame
    GameBoard gameBoard;
    Player player;
    PushBox pushBox;
   
    
    public JFrameDesign() throws InterruptedException{
       
          setupGame();
          runGame();
     }
    
    /**
     *  
     * Setup the main objects of the game like frame or {@link Player} player
     *
     */
    public void setupGame() throws InterruptedException{
        
        
        // SETUP THE MAIN FRAME 
        jframe = new JFrame(TITLE);
       
        jframe.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
        //jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // When window 'x' pressed quit.
        
        gameBoard = new GameBoard();
       
        // Add gameBoard (JPanel) component to the Frame
        jframe.add(gameBoard);
        
        jframe.pack();
       
        jframe.setVisible(true);   // Set visible after adding component. Otherwise wont display.
       
    }
    
     /* ---------------------------------
     *  
     *  Creates main objects of the game. 
     * 
     * ---------------------------------
     */
    
    /**
     *
     * @throws InterruptedException
     */
    public void runGame() throws InterruptedException {
        
        
        while(true){
             
              gameBoard.repaint();
              // It calls paint function, so every frame there is new picture.(animation)
              // The canvas is redrawn after movement has happened.
              //player.repaint();  
              
              Thread.sleep(10);
              
        }
    
    }
    
}
