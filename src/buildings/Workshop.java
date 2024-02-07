package buildings;

import objects.Item;
import objects.Recipe;

import java.util.ArrayList;

public class Workshop extends Building {
    private ArrayList<Item> itemInside = new ArrayList<>();
    private int heightInTiles = 3, wightInTiles = 3;
    private Item itemReady1, itemRequired1;
    private Item itemReady2, itemRequired2;
    private Item itemReady3, itemRequired3;
    private Recipe actualRecipe;
    private int rotation;
    BuildingStatus buildingStatus= BuildingStatus.NO_RECIPE;

    private ArrayList<Item> itemsOnBelt = new ArrayList<>();

    private enum BuildingStatus{WORKING, REST,NO_RECIPE}

    public Workshop(int x, int y, int id, int rotation) {
        super(x, y, id);
        this.rotation = rotation;

    }

    public void update(){

    }

    public void createItem() {
        itemInside.add(actualRecipe.getProduced());
        removeItems();
    }

    private void removeItems() {

    }

    public void setRecipe(Recipe recipe) {
        actualRecipe = recipe;
        itemRequired1 = recipe.getItemRequired1();
        if (recipe.getNumberOfItemRequired() > 2) {
            itemRequired2 = recipe.getItemRequired2();
        }
        if (recipe.getNumberOfItemRequired() > 3) {
            itemRequired3 = recipe.getItemRequired3();
        }
        buildingStatus=BuildingStatus.REST;
    }

    public void collectItem(Item collected) {
        itemInside.add(collected);
    }

    public void canBuildingStartWorking() {
        switch (actualRecipe.getNumberOfItemRequired()) {
            case 1:
                if (itemRequired1.getItemType() == itemReady1.getItemType()) {
                    if(howManyItems(itemRequired1)>=actualRecipe.getFirstItemAmount()){

                    }
                }
                break;
            case 2:
                if (itemRequired1.getItemType() == itemReady1.getItemType() && itemRequired2.getItemType() == itemReady2.getItemType()) {

                }
                break;
            case 3:
                if (itemRequired1.getItemType() == itemReady1.getItemType() && itemRequired2.getItemType() == itemReady2.getItemType() && itemRequired3.getItemType() == itemReady3.getItemType()) {

                }
                break;
        }
    }

    private int howManyItems(Item itemToSearch) {
        int numberOfItem=0;
        for(Item item:itemInside){
            if(item.getItemType()==itemToSearch.getItemType()){
                numberOfItem++;
            }
        }
        return numberOfItem;
    }

    private boolean canFirstItemEnter(Item itemEntering) {
        if (itemRequired1 == itemEntering || itemRequired2 == itemEntering || itemRequired3 == itemEntering) {
            return true;
        }
        return false;
    }


    public int getRotation() {
        return rotation;
    }
}
