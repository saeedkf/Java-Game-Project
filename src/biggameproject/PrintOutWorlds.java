/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

/**
 *
 * @author JP
 */
public class PrintOutWorlds{

public String prints(World worldToPrint){
    
    StringBuffer outputBuffer = new StringBuffer();
    
    
outputBuffer.append("This is the world with its locations:\n");
        // TODO code application logic here

for(Location l : worldToPrint.getLocations()){
    outputBuffer.append(l.getDescription());

} 
        return outputBuffer.toString();
    }
    
}
