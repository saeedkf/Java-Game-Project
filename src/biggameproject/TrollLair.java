/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import biggameproject.Location.Direction;
import java.util.List;

public class TrollLair implements Location {

        public List<World> getExits(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        public String getDescription() {
             
        return "This is location TrollLair\n";
//                "The cave-entrance is just big enough to get a cart trough. "
//                + "\n And there is a foul stench lingering around. "
//                + "\n It's not surprising given the pile of bones and pieces of meat lying around."
//                + "\n There is also an old rusty cauldron, big enough to fit a grown up man and under it a fireplace."
//                + "\n Luckily it seems like it hasn't been lit up recently."
//                + "\n There are some rags in the form of a makeshift mattress,"
//                + "\n and behind it in an old trunk you find a big rusty key. "
//                + "\n Probably the one from the bridge";
    }

        public List<Location> getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
