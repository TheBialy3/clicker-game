package managers;

import buildings.Belt;
import buildings.Splitter;
import objects.Item;

import java.util.ArrayList;

import static helpz.Constants.BeltType.getBeltLvlSpeed;

public class BeltManager {
    private ArrayList<Item> itemsOnBelt = new ArrayList<>();
    private ArrayList<Item> itemsOnSplitter = new ArrayList<>();
    private ArrayList<Belt> belts = new ArrayList<>();
    private ArrayList<Splitter> splitters = new ArrayList<>();


    public BeltManager() {
    }

    public void moveItems() {
       beltMoveItems();
       splitterMoveItems();
    }

    public void splitterMoveItems() {
        for (Item item : itemsOnSplitter) {
            for (Splitter splitter : splitters) {
                if (splitter.getHitBox().contains(item.getX(), item.getY())) {
                    item.setX();
                    item.setY();
                }
            }
        }
    }

    public void beltMoveItems() {
        for (Item item : itemsOnBelt) {
            for (Belt belt : belts) {
                if (belt.getHitBox().contains(item.getX(), item.getY())) {
                    item.moveItem(getBeltLvlSpeed(belt.getBeltLvl()), belt.getRotation());
                }
            }
        }
    }
}
