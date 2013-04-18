/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JP
 */
public class AddLocations implements World {
    List<Location> gameLocations = new ArrayList<Location>();
	
	public AddLocations() {
		gameLocations.add(new Bridge());
                gameLocations.add(new Castle());
                gameLocations.add(new Forest());
                gameLocations.add(new Village());
                gameLocations.add(new TrollLair());
                
                
	}


	@Override
	public List<Location> getLocations() {
		return gameLocations;
	}
    
}
