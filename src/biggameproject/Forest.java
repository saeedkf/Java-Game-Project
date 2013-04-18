/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import biggameproject.Location.Direction;
import java.util.List;



public class Forest implements Location {

        public List<World> getExits(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        public String getDescription() {
             
        return "This is location Forrest\n";
//                "As you leave the village behind you hear the gates closing."
//                + "\n Congratulations now you are alone in a thick dark forest."
//                + "\n The trees look ancient, the ground is covered with dead leafs and moss."
//                + "\n Very little sunlight manages to break trough the thick foliage."
//                + "\n You hear some movement in the distance. "
//                + "\nMight be animals.... Or who knows what else?";
    }

        public List<Location> getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
