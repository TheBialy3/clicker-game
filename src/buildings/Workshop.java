package buildings;

import objects.Item;
import objects.Recipe;

import java.util.ArrayList;

public class Workshop extends Building {
    private ArrayList<Item> itemInside = new ArrayList<>();
    private ArrayList<Integer> itemsForCreatoin = new ArrayList<>();
    private int heightInTiles = 3, wightInTiles = 3;
    private int itemTypeReady1, itemTypeRequired1;
    private int itemTypeReady2, itemTypeRequired2;
    private int itemTypeReady3, itemTypeRequired3;
    private Recipe actualRecipe;
    private int rotation;
    private int timeToCreateItem, time = 0;

    BuildingStatus buildingStatus = BuildingStatus.NO_RECIPE;


    private enum BuildingStatus {WORKING, REST, NO_RECIPE}

    public Workshop(int x, int y, int id, int rotation) {
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
            case NO_RECIPE:
                break;
        }
    }

    private void isItemDone() {
        if (time == timeToCreateItem) {
            createItem();

        }
    }

    public void createItem() {
        itemInside.add(actualRecipe.getProduced());
        removeItems();
    }

    private void removeItems() {

    }

    public void setRecipe(Recipe recipe) {
        if (recipe==null) {
            buildingStatus = BuildingStatus.NO_RECIPE;
        } else {
            actualRecipe = recipe;
            itemTypeReady1 = recipe.getItemTypeRequired1();
            for(int i=0;i<recipe.getFirstItemAmount();i++){
                itemsForCreatoin.add(recipe.getItemTypeRequired1());
            }
            if (recipe.getNumberOfItemRequired() > 2) {
                itemTypeReady2 = recipe.getItemTypeRequired2();
                for(int i=0;i<recipe.getSecondItemAmount();i++){
                    itemsForCreatoin.add(recipe.getItemTypeRequired2());
                }
            }
            if (recipe.getNumberOfItemRequired() > 3) {
                itemTypeReady3 = recipe.getItemTypeRequired3();
                for(int i=0;i<recipe.getThreadItemAmount();i++){
                    itemsForCreatoin.add(recipe.getItemTypeRequired3());
                }
            }
            buildingStatus = BuildingStatus.REST;
            
        }
    }

    public void collectItem(Item collected) {
        itemInside.add(collected);
    }

    public void canBuildingStartWorking() {
        switch (actualRecipe.getNumberOfItemRequired()) {
            case 1:
                if (itemTypeReady1 == itemTypeReady1) {
                    if (howManyItems(itemTypeReady1) >= actualRecipe.getFirstItemAmount()) {
                        buildingStatus = BuildingStatus.WORKING;
                    }
                }
                break;
            case 2:
                if (itemTypeReady1 == itemTypeReady1 && itemTypeReady2 == itemTypeReady2) {
                    if (howManyItems(itemTypeReady1) >= actualRecipe.getFirstItemAmount() && howManyItems(itemTypeReady2) >= actualRecipe.getSecondItemAmount()) {
                        buildingStatus = BuildingStatus.WORKING;
                    }
                }
                break;
            case 3:
                if (itemTypeReady1 == itemTypeReady1 && itemTypeReady2 == itemTypeReady2 && itemTypeReady3 == itemTypeReady3) {
                    if (howManyItems(itemTypeReady1) >= actualRecipe.getFirstItemAmount() && howManyItems(itemTypeReady2) >= actualRecipe.getSecondItemAmount() && howManyItems(itemTypeReady3) >= actualRecipe.getThreadItemAmount()) {
                        buildingStatus = BuildingStatus.WORKING;
                    }
                }
                break;
        }
    }


    private int howManyItems(int itemToSearchType) {
        int numberOfItem = 0;
        for (Item item : itemInside) {
            if (item.getItemType() == itemToSearchType) {
                numberOfItem++;
            }
        }
        return numberOfItem;
    }

    private void canFirstItemEnter(Item itemEntering) {
        if (itemTypeReady1 == itemEntering.getItemType() || itemTypeReady2 == itemEntering.getItemType() || itemTypeReady3 == itemEntering.getItemType()) {
            collectItem(itemEntering);
        }

    }


    public int getRotation() {
        return rotation;
    }
}
