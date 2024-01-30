package buildings;

public class Portal {
    private int x,y;
    private int id;
    private int portalType;
    public Portal(int x, int y, int id, int portalType) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.portalType = portalType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPortalType() {
        return portalType;
    }
}
