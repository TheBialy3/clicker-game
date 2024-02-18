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
            for(Belt belt:belts){
                if(belt.getHitBox().contains(item.getX(),item.getY())){
                    item.moveItem(getBeltLvlSpeed(belt.getBeltLvl()), belt.getRotation());
                }
            }}
    }
}
