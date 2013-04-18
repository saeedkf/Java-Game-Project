/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import biggameproject.Location.Direction;
import java.util.List;

/**
 *
 * @author JP
 */
public class Bridge implements Location {

        public List<World> getExits(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
        public String getDescription() {
             
        return "This is location Bridge\n";
//                "You hear the sound of water rushing near you, but the thick "
//                + "\novergrowth does not let you see where exactly."
//                + "\n The path suddenly takes a turn to the left and you see a river."
//                + "\n And the only way to cross it seems the old stone bridge in front of you."
//                + "\n The problem is that there s a gate on it."
//                + "\n You approach the door and judging by the look of it it's locked."
//                + "\n Great!"
//                + "\n You hear some scuttling noise behind you and you turn around startled."
//                + "\n There is an old beardd man with a pointy hat lookig at you with distrust."
//                + "\n \"You have to pay a tax to pass from here\" - he syas with a crackling voice."
//                + "\n Even greater!\"What\'s the tax\" you ask."
//                + "\"Normally I'd take gold. But today is different. "
//                + "\nA mighty beast lived here! And it held the key."
//                + "\n I defeated it, but alas, the key was not with it."
//                + "\n If you want to pass you have to go to the beast's lair and get the key to the bridge!"
//                + "\n Off you go now!\"";
    }

        public List<Location> getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
