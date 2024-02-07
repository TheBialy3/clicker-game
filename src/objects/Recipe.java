package objects;

public class Recipe {
    private int id, numberOfItemRequired;
    private int timeToFinish, firstItemAmount, secondItemAmount, threadItemAmount;
    private Item produced, itemRequired1, itemRequired2, itemRequired3;

    public Recipe(int id,int timeToFinish, Item produced,int firstItemAmount, Item itemRequired1) {
        this.id = id;
        this.timeToFinish=timeToFinish;
        this.produced = produced;
        this.firstItemAmount=firstItemAmount;
        this.itemRequired1 = itemRequired1;
        numberOfItemRequired = 1;
    }

    public Recipe(int id,int timeToFinish, Item produced, int firstItemAmount,Item itemRequired1, int secondItemAmount,Item itemRequired2) {
        this.id = id;
        this.timeToFinish=timeToFinish;
        this.produced = produced;
        this.firstItemAmount=firstItemAmount;
        this.itemRequired1 = itemRequired1;
        this.secondItemAmount=secondItemAmount;
        this.itemRequired2 = itemRequired2;
        numberOfItemRequired = 2;
    }

    public Recipe(int id,int timeToFinish, Item produced,int firstItemAmount, Item itemRequired1, int secondItemAmount,Item itemRequired2, int threadItemAmount,Item itemRequired3) {
        this.id = id;
        this.timeToFinish=timeToFinish;
        this.produced = produced;
        this.firstItemAmount=firstItemAmount;
        this.itemRequired1 = itemRequired1;
        this.secondItemAmount=secondItemAmount;
        this.itemRequired2 = itemRequired2;
        this.threadItemAmount=threadItemAmount;
        this.itemRequired3 = itemRequired3;
        numberOfItemRequired = 3;
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

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public int getFirstItemAmount() {
        return firstItemAmount;
    }

    public int getSecondItemAmount() {
        return secondItemAmount;
    }

    public int getThreadItemAmount() {
        return threadItemAmount;
    }
}
