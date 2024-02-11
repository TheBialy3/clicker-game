package buildings;

import objects.Item;

import java.util.ArrayList;

public class Furnace extends Building {
    private int heightInTiles = 2, wightInTiles = 2;

    private ArrayList<Integer> smeltableItems = new ArrayList<>();
    private ArrayList<Item> itemInside = new ArrayList<>();
    BuildingStatus buildingStatus = BuildingStatus.REST;
    private  Item itemSmelting;

    private enum BuildingStatus {WORKING, REST}

    private int timeToCreateItem, time = 0;
    private int rotation;

    public Furnace(int x, int y, int id, int rotation) {
        super(x, y, id);
        this.rotation = rotation;
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

        if (itemTypeReady1 == itemTypeReady1) {
            if (howManyItems(itemTypeReady1) >= actualRecipe.getFirstItemAmount()) {
                buildingStatus = Workshop.BuildingStatus.WORKING;
            }
        }
    }


    private void isItemDone() {
        if (time >= timeToCreateItem) {
            smeltItem();
            time = 0;
        }
    }

    public void smeltItem(int itemType) {
        removeItem();
        itemInside.add(new Item(itemType));

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
