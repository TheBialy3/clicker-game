package helpz;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadSave {

    public static BufferedImage getSpriteAtlas() {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("pngFile/final.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public static BufferedImage getBackgroundImg() {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("pngFile/back.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public static BufferedImage getCardSprite() {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("pngFile/cardLong.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
    public static BufferedImage getCardChooseSprite() {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("pngFile/cardLongChoose.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }




    private static ArrayList<Integer> ReadSaveFile(File file) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            list.add(Integer.parseInt(sc.nextLine()));
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


    private static ArrayList<Boolean> ReadSaveFile(File file, int startOfReading) {
        ArrayList<Boolean> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            for (int i = 0; i < startOfReading; i++) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                list.add(Boolean.parseBoolean(sc.nextLine()));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static ArrayList<Integer> GetXpData() {
        File saveFile = new File("res/textFile/save.txt");
        if (saveFile.exists()) {
            ArrayList<Integer> list = ReadSaveFile(saveFile);
            return list;
        } else {
            System.out.println("File: save.txt nieistnieje");
            return null;
        }
    }

    public static ArrayList<Boolean> GetCardSave() {
        File saveFile = new File("res/textFile/save.txt");
        if (saveFile.exists()) {
            ArrayList<Boolean> list = ReadSaveFile(saveFile, 1);
            return list;
        } else {
            System.out.println("File: save.txt nieistnieje");
            return null;
        }
    }


    private static ArrayList<Integer> ReadFromFile(File file) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                list.add(Integer.parseInt(sc.nextLine()));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }



    public static int[][] GetLevelDir() {
        File lvlFile = new File("res/textFile/level1.txt");
        if (lvlFile.exists()) {
            ArrayList<Integer> list = ReadFromFile(lvlFile);
            return Utilz.ArrayListTo2DintStartAt(list, 20, 20, 404);
        } else {
            System.out.println("File: level1.txt nieistnieje");
            return null;
        }
    }

    public static int[][] GetLevelData() {
        File lvlFile = new File("res/textFile/level1.txt");
        if (lvlFile.exists()) {
            ArrayList<Integer> list = ReadFromFile(lvlFile);
            return Utilz.ArrayListTo2Dint(list, 20, 20);
        } else {
            System.out.println("File: level1.txt nieistnieje");
            return null;
        }
    }

    public static void CreateSaveFile() {
        File saveFile = new File("res/textFile/save.txt");
        if (saveFile.exists()) {
            System.out.println("file save.txt exists");

        } else {
            try {
                saveFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //  WriteToFile(newLvl, idArr, new PathPoint(0,0), new PathPoint(0,0));

        }
    }

    public static void CreateLevel(String name, int[] idArr) {
        File newLvl = new File("res/" + name + ".txt");
        if (newLvl.exists()) {
            System.out.println("file" + name + "exists");

        } else {
            try {
                newLvl.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //  WriteToFile(newLvl, idArr, new PathPoint(0,0), new PathPoint(0,0));

        }
    }



    public static BufferedImage getSpriteLogos() {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("pngFile/logos.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
