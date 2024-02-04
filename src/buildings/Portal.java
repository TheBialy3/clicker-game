package buildings;

public class Portal extends Building{
    private int heightInTiles = 1, wightInTiles = 1;
    private int portalType;
    public Portal(int x, int y, int id, int portalType) {
        super(x,y,id);
        this.portalType=portalType;
    }

    public int getPortalType() {
        return portalType;
    }



}
