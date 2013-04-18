/*Location 1
 */
package biggameproject;

import biggameproject.Location.Direction;
import java.util.Scanner;

import java.util.List;

public class Village implements Location {

        public String getDescription() {
             
        return "This is location Village\n";
//                "Wellcome to The Village of Colemeadow. Most of the houses are small "
//            + "\none-story buildings with thatched roofs. Despite this they seem cozy and comfort."
//            + "\n THe village is clean and neat and right in the middle of the town square you see a tall massive stone building."
//            + "\n And the only one that has an actual roof. This is the \"Bent Horseshoe\" inn."
//            + "\n There is a small well right infront of the inn. "
//            + "\nYou also see some villagers scuttling around doing whatever villagers do at this time of day ";
    }

        public List<World> getExits(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        public List<Location> getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
