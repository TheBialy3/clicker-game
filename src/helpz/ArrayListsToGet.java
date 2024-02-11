package helpz;

import java.util.ArrayList;

import static helpz.Constants.Items.*;

public class ArrayListsToGet {

    private ArrayList<Integer> smeltableItems = new ArrayList<>();
    private ArrayList<Integer> fuelItems = new ArrayList<>();
    public void ArrayListsToGet(){
        createArrayLists();
    }

    private void createArrayLists() {
        ///////////////////////////////////////////////////////////

        smeltableItems.add(IRON_ORE);
        smeltableItems.add(COPRER_ORE);
        smeltableItems.add(SAND);
        smeltableItems.add(STONE);

        ///////////////////////////////////////////////////////////

        fuelItems.add(COAL);
    }

    public ArrayList<Integer> getSmeltableItems(){
        return smeltableItems;
    }
    public ArrayList<Integer> getFuelItems(){
        return fuelItems;
    }
}
