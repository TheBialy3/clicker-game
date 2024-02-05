package buildings;

import objects.Item;
import objects.Recipe;

public class Workshop extends Building {
    private int heightInTiles = 3, wightInTiles = 3;
    private Item itemReady1, itemRequired1;
    private Item itemReady2, itemRequired2;
    private Item itemReady3, itemRequired3;
    private Recipe actualRecipe;
    private int rotation;

    public Workshop(int x, int y, int id, int rotation) {
        super(x, y, id);
        this.rotation = rotation;
    }

    public void createItem() {

    }

    public void setRecipe(Recipe recipe) {
        actualRecipe = recipe;
    }

    public void collectItem() {

    }

    public void canItemEnter(int numberOfItems) {
        switch (numberOfItems) {
            case 1:
                if (areReadyRequiredOneItem()) {

                }
                break;
            case 2:
                if (areReadyRequiredTwoItem()) {

                }
                break;
            case 3:
                if (areReadyRequiredThreeItem()) {

                }
                break;
        }
    }

    private boolean areReadyRequiredOneItem() {
        if (itemRequired1 == itemReady1) {
            return true;
        }
        return false;
    }

    private boolean areReadyRequiredTwoItem() {
        if (itemRequired1 == itemReady1 && itemRequired2 == itemReady2) {
            return true;
        }
        return false;
    }

    private boolean areReadyRequiredThreeItem() {
        if (itemRequired1 == itemReady1 && itemRequired2 == itemReady2 && itemRequired3 == itemReady3) {
            return true;
        }
        return false;
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
