package PushingBoxes;

/** Localizable refers to all the objects of the game.
 * It is further extended in the GameObject class.
 * PushBox - or the boxes the player pushes around are an implementation of Localizable.
 * 
 * @see GameObject
 * @see PushBox
 * @see Player
 * @see Model
 * @version 3
 * 
 * @author Viktor and Nour
 * 
 
*/
public interface Localizable 
{   /**The directions in which an object can move. 
    * Their names are self-explanatory */
    enum Direction { right,up,left,down};
    
    /** Deals with the movement of objects.
     * In this version the only movable objects are the PushBoxes and the Player. 
     * In order to move they check their location in relation to the player, 
     * to detect if he is 'pushing' them
     * 
     * @param direction - the direction of movement
     * @param model - model has all the necessary things for movement - the player, the gutter and the steps.
     * @see Player
     * @see Model
     * 
     * @version 5 
     */
     public void move(Direction direction, Model model);
}
