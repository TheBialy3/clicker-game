package helpz;

import java.util.ArrayList;

import static helpz.Constants.ItemsType.*;

public class ArrayListsToGet {

    private ArrayList<Integer> smelterItems = new ArrayList<>();
    private ArrayList<Integer> fuelItems = new ArrayList<>();
    private ArrayList<Integer> liquidItems = new ArrayList<>();

    public ArrayListsToGet() {
        createArrayLists();
    }

    private void createArrayLists() {
        ///////////////////////////////////////////////////////////

        smelterItems.add(IRON_ORE);
        smelterItems.add(COPRER_ORE);
        smelterItems.add(SAND);
        smelterItems.add(STONE);

        ///////////////////////////////////////////////////////////

        smelterItems.add(IRON_BAR);
        smelterItems.add(COPRER_BAR);
        smelterItems.add(GLASS);
        smelterItems.add(STONE_BRICK);

        ///////////////////////////////////////////////////////////

        fuelItems.add(COAL);
        fuelItems.add(WOOD);

        ///////////////////////////////////////////////////////////

        liquidItems.add(WATER);
        liquidItems.add(LAVA);
    }

    public ArrayList<Integer> getSmelterItems() {
        return smelterItems;
    }

    public ArrayList<Integer> getFuelItems() {
        return fuelItems;
    }

    public ArrayList<Integer> getLiquidItems() {
        return liquidItems;
    }
}
