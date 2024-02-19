package managers;

import buildings.Belt;
import buildings.Splitter;
import objects.Item;

import java.util.ArrayList;

import static helpz.Constants.BeltType.getBeltLvlSpeed;
import static helpz.Constants.Rotation.*;
import static helpz.Constants.NumbersOf.TILE_PIXEL_NUMBER;

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
                    if(splitter.getRotationOfItemOutput()==LEFT){
                        item.setX((splitter.getX()-1) * TILE_PIXEL_NUMBER);
                        item.setY(splitter.getY() * TILE_PIXEL_NUMBER);
                    }else if(splitter.getRotationOfItemOutput()==UP){
                        item.setX(splitter.getX() * TILE_PIXEL_NUMBER);
                        item.setY((splitter.getY()+1) * TILE_PIXEL_NUMBER);
                    }else if(splitter.getRotationOfItemOutput()==RIGHT){
                        item.setX((splitter.getX()+1) * TILE_PIXEL_NUMBER);
                        item.setY(splitter.getY() * TILE_PIXEL_NUMBER);
                    }else{
                        item.setX(splitter.getX() * TILE_PIXEL_NUMBER);
                        item.setY((splitter.getY()-1) * TILE_PIXEL_NUMBER);
                    }
                    splitter.increaseRotationOfItemOutput();
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
