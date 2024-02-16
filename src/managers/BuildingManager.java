package managers;

import buildings.Building;
import objects.Item;

import java.util.ArrayList;

import static helpz.Constants.BeltType.getBeltLvlSpeed;

public class BuildingManager {
    private ArrayList<Building> buildings=new ArrayList<>();
    public BuildingManager() {
    }

    public void update(){
        for(Building building:buildings){
            building.update();
        }
    }

}
