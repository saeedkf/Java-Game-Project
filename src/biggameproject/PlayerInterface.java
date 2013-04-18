package biggameproject;

import biggameproject.Location.Direction;

public interface PlayerInterface {
    
boolean move(Direction direction);

boolean take(GameObject object);
boolean drop(GameObject object);

int getEnergyLevel();

void changeEnergyLevel(int diff);
}