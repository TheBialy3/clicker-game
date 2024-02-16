package managers;

import buildings.Belt;
import objects.Item;

import java.util.ArrayList;

import static helpz.Constants.BeltType.getBeltLvlSpeed;

public class BeltManager {
    private ArrayList<Item> itemsOnBelt=new ArrayList<>();
    private ArrayList<Belt> belts=new ArrayList<>();
    public BeltManager() {
    }
    public void moveItems(){
        for(Item item:itemsOnBelt){
            item.moveItem(getBeltLvlSpeed(beltLvl),rotation);
        }
    }
}
