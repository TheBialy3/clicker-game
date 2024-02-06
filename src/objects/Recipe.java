package objects;

public class Recipe {
    private int id,numberOfItemRequired;
    private Item produced, itemRequired1,itemRequired2,itemRequired3;

    public Recipe(int id, Item produced, Item itemRequired1) {
        this.id = id;
        this.  produced=produced;
        this. itemRequired1=itemRequired1;
        numberOfItemRequired=1;
    }
    public Recipe(int id, Item produced, Item itemRequired1, Item itemRequired2) {
        this.id = id;
        this.  produced=produced;
        this. itemRequired1=itemRequired1;
        this. itemRequired2=itemRequired2;
        numberOfItemRequired=2;
    }
    public Recipe(int id, Item produced, Item itemRequired1, Item itemRequired2, Item itemRequired3) {
        this.id = id;
        this.  produced=produced;
        this. itemRequired1=itemRequired1;
        this. itemRequired2=itemRequired2;
        this. itemRequired3=itemRequired3;
        numberOfItemRequired=3;
    }

    public int getId() {
        return id;
    }

    public Item getProduced() {
        return produced;
    }

    public Item getItemRequired1() {
        return itemRequired1;
    }

    public Item getItemRequired2() {
        return itemRequired2;
    }

    public Item getItemRequired3() {
        return itemRequired3;
    }

    public int getNumberOfItemRequired() {
        return numberOfItemRequired;
    }
}
