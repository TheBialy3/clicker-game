package objects;

public class Card {
    private int id, cost;
    private String name, description;
    private boolean costAvailable, active = false;

    public Card(int id, String name, String description, boolean costAvailable, int cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.costAvailable = costAvailable;
        this.cost = cost;
    }

}
