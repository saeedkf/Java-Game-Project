/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import java.awt.Image;
import java.util.List;

/**
 *
 * @author Atari
 */
public interface Location {
    public enum Direction {EAST, NORTH, WEST, SOUTH, UP, DOWN;

        static class World {

            public World() {
            }
        }
    };
    List<World> getExits(Direction direction);
    
    Image location = null;
    
    //This gives a description of the location. If things work out good we'll add graphics. 
    String getDescription();
    
}
