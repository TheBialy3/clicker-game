package buildings;

import helpz.ArrayListsToGet;
import objects.Item;

import java.util.ArrayList;

public class Furnace extends Building {
    private int heightInTiles = 2, wightInTiles = 2;

    private ArrayList<Integer> smeltableItems = new ArrayList<>();
    private ArrayList<Item> itemInside = new ArrayList<>();
    private ArrayList<Integer> fuelList = new ArrayList<>();
    private ArrayList<Integer> smelterItemsList = new ArrayList<>();

    BuildingStatus buildingStatus = BuildingStatus.REST;
    private Item itemSmelting;

    private enum BuildingStatus {WORKING, REST}

    private int timeToCreateItem, time = 0;
    private int fuelLevel = 0;
    private int rotation;


    public Furnace(int x, int y, int id, int rotation, ArrayListsToGet arrayListsToGet) {
        super(x, y, id);
        this.rotation = rotation;
        fuelList = arrayListsToGet.getFuelItems();
    }


    public void update() {
        switch (buildingStatus) {
            case WORKING:
                time++;
                isItemDone();
                break;
            case REST:
                canBuildingStartWorking();
                break;
        }
    }


    public void canBuildingStartWorking() {
        for (Item item : itemInside) {
            for (int itemTypeToSmelt : smelterItemsList) {
                if (item.getItemType() == itemTypeToSmelt) {
                    setSmeltingItem(item);
                    if (isFuelReady()) {
                        buildingStatus = BuildingStatus.WORKING;
                    }
                }
            }
        }
    }

    private void setSmeltingItem(Item item) {
        itemSmelting=item;
    }

    private boolean isFuelReady() {
        if (fuelLevel > 0) {
            return true;
        }
        return false;
    }


    private void isItemDone() {
        if (time >= timeToCreateItem) {
            smeltItem();
            time = 0;
        }
    }

    public void smeltItem() {
        removeItems(itemSmelting.getItemType());
        itemInside.add(new Item(getSmeltedType(itemSmelting.getItemType())));

    }

    private int getSmeltedType(int itemType) {
        switch (itemType){
            case I :
        }
    }

    private void removeItems(int itemType) {
        for (Item item : itemInside) {
            if (itemType == item.getItemType()) {
                itemInside.remove(item);
                break;
            }
        }

    }

    public int getRotation() {
        return rotation;
    }

    public void pushItemInside(Item item) {
        itemInside.add(item);
    }

    public Item pullOutItem(int itemType) {
        Item itemToPull = findItem(itemType);
        itemInside.remove(findItem(itemType));
        return itemToPull;
    }

    public Item findItem(int itemType) {
        for (Item item : itemInside) {
            if (item.getItemType() == itemType) {
                return item;
            }
        }
        return null;
    }
}


