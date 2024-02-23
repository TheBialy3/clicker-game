package helpz;

public class Constants {
    public static class NumbersOf {

        public static final int TILE_PIXEL_NUMBER = 64;
        public static final int HALF_TILE_PIXEL_NUMBER = 32;

    }

    public static class Rotation {

        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;

    }

    public static class ItemsType {
        public static final int IRON_ORE = 1;
        public static final int COPRER_ORE = 2;
        public static final int SAND = 3;
        public static final int STONE = 4;
        public static final int COAL = 5;
        public static final int WOOD = 6;
        public static final int WATER = 7;
        public static final int LAVA = 8;
        public static final int BLOCK_OF_COAL = 9;


        public static final int IRON_BAR = 10;
        public static final int COPRER_BAR = 11;
        public static final int STEEL_BAR = 12;
        public static final int GLASS = 13;
        public static final int STONE_BRICK = 14;
        public static final int WIRE = 15;
        public static final int POWER_CORD =16;


        public static int getDefaultCost(int itemType) {////////////////////////////////////////////////////
            switch (itemType) {
                case IRON_ORE, COPRER_ORE,SAND,STONE,WOOD:
                    return 1;
                case COAL:
                    return 2;
                case IRON_BAR,COPRER_BAR:
                    return 3;
                case BLOCK_OF_COAL:
                    return 20;


                default:
                    return 0;
            }
        }

        public static int getFuelValue(int itemType) {////////////////////////////////////////////////////
            switch (itemType) {
                case COAL:
                    return 100;
                case WOOD:
                    return 50;
                default:
                    return 0;
            }
        }

    }

    public static class Direction {

        public static final int LEFT = 20;
        public static final int UP = 21;
        public static final int RIGHT = 18;
        public static final int DOWN = 19;
    }

    public static class Tiles {
        public static final int WATER_TILE = 0;
        public static final int GRASS_TILE = 1;
        public static final int ROAD_TILE = 2;
        public static final int ROAD_DIR = 3;
    }


    public static class BeltType {
        public static final int BELT_LR = 0;
        public static final int BELT_TB = 1;
        public static final int BELT_CORNER_LT = 2;
        public static final int BELT_CORNER_TR = 3;
        public static final int BELT_CORNER_RB = 4;
        public static final int BELT_CORNER_BL = 5;

        public static float getBeltLvlSpeed(int beltLvl) {
            switch (beltLvl) {
                case 1:
                    return 0.3f;
                case 2:
                    return 0.5f;
                case 3:
                    return 0.75f;
                case 4:
                    return 1f;
                default:
                    return 0.1f;
            }

        }

    }

    public static class PortalType {
        public static final int IN = 0;
        public static final int OUT = 1;

    }
}

