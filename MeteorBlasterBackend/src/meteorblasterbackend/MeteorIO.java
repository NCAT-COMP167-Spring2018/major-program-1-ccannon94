/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.AudioClip;

/**
 *
 * @author CCannon
 */
public class MeteorIO {
    public static GamerProfileCollection readGamerProfileData(String gamerDataFile) {
        GamerProfileCollection gpc = new GamerProfileCollection(gamerDataFile, new GamerProfile(), new GamerProfile());

        try {
            Scanner reader = new Scanner(new File(gamerDataFile));

            while (reader.hasNext()) {
                String[] gamerLine1 = reader.nextLine().split(",");
                String[] gamerLine2 = reader.nextLine().split(" ");
                GamerProfile newProfile = new GamerProfile(gamerLine1[0], gamerLine1[1], gamerLine1[2], Integer.parseInt(gamerLine2[0]), Integer.parseInt(gamerLine2[1]), Integer.parseInt(gamerLine2[2]), Integer.parseInt(gamerLine2[3]), Integer.parseInt(gamerLine2[4]), Integer.parseInt(gamerLine2[5]));
                gpc.addGamerProfile(newProfile);

                if(newProfile.getHighScore() > gpc.getHighGameProfile().getHighScore())
                    gpc.setHighGameProfile(newProfile);

                gpc.setSelectedProfile(newProfile);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MeteorIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return gpc;
    }

    public static void writeGamerProfileData(GamerProfileCollection gpCollection) {
        try {
            PrintWriter pw = new PrintWriter(new File(gpCollection.getFilename()));
            pw.write(gpCollection.toString());
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MeteorIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static MeteorConfigData readConfigData(String gamerDataFile) {
        MeteorConfigData newConfigData = new MeteorConfigData();

        try {
            Scanner reader = new Scanner(new File(gamerDataFile));

            RankData newRankData = readRankData(reader);
            newConfigData.setRankData(newRankData);
            SoundData newSoundData = readSoundData(reader);
            newConfigData.setSoundData(newSoundData);
            LevelData newLevelData = readLevelData(reader);
            newConfigData.setLevelData(newLevelData);
            CraftData newCraftData = readCraftData(reader);
            newConfigData.setCraftData(newCraftData);
            MeteorData newMeteorData = readMeteorData(reader);
            newConfigData.setMeteorData(newMeteorData);
            ExplosionData newExplosionData = readExplosionData(reader);
            newConfigData.setExplosionData(newExplosionData);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MeteorIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return newConfigData;
    }

    public static RankData readRankData(Scanner reader){
        RankData newRankData = new RankData();
        while(reader.hasNext()) {
            String[] rankLine = reader.nextLine().split(",");

            if (rankLine[0].trim().equals("*")) break;

            Rank newRank = new Rank();
            newRank.setRankId(Integer.parseInt(rankLine[0].trim()));
            newRank.setRankName(rankLine[1].trim());
            newRank.setPointsNeeded(Integer.parseInt(rankLine[2].trim()));


            newRankData.addRank(newRank);
        }
        return newRankData;
    }

    public static SoundData readSoundData(Scanner reader) {
        SoundData newSoundData = new SoundData();

        for(int i = 0; i < 5; i++) {
            newSoundData.setSoundResource(i, reader.nextLine());
        }

        return newSoundData;
    }

    public static LevelData readLevelData(Scanner reader) {
        LevelData newLevelData = new LevelData();

        while(reader.hasNext()) {
            String[] nextLine = reader.nextLine().split(",");

            if(nextLine[0].trim().equals("*")) break;

            meteorblasterbackend.Level newLevel = new meteorblasterbackend.Level(Integer.parseInt(nextLine[0].trim()), Integer.parseInt(nextLine[1].trim()), Double.parseDouble(nextLine[2].trim()), Integer.parseInt(nextLine[3].trim()), nextLine[4].trim());
            newLevelData.addLevel(newLevel);
        }

        return newLevelData;
    }

    public static CraftData readCraftData(Scanner reader) {
        CraftData newCraftData = new CraftData();

        String[] imageFiles = reader.nextLine().split(",");
        for(int i = 0; i < imageFiles.length; i++){
            newCraftData.addImageFile(imageFiles[i].trim());
        }
        newCraftData.setPhaserSoundFile(reader.nextLine());
        String[] craftValues = reader.nextLine().split(" ");
        int currentIndex = 0;
        for(int i = 0; i < craftValues.length; i++) {
            if(craftValues[i].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newCraftData.setThrustIncreaseAmount(Double.parseDouble(craftValues[i].trim()));
                currentIndex = i;
                break;
            }
        }
        for(int j = currentIndex; j < craftValues.length; j++) {
            if(craftValues[j].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newCraftData.setThrustDecreaseAmount(Double.parseDouble(craftValues[j].trim()));
                currentIndex = j;
                break;
            }
        }
        for(int k = currentIndex; k < craftValues.length; k++) {
            if(craftValues[k].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newCraftData.setMaxSpeed(Double.parseDouble(craftValues[k].trim()));
                currentIndex = k;
                break;
            }
        }

        return newCraftData;
    }

    public static MeteorData readMeteorData(Scanner reader) {
        MeteorData newMeteorData = new MeteorData();

        newMeteorData.setMeteorSpriteFile(reader.nextLine());
        String[] meteorValues = reader.nextLine().split(" ");
        int currentIndex = 0;
        for(int i = 0; i < meteorValues.length; i++) {
            if(meteorValues[i].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newMeteorData.setMinSize(Integer.parseInt(meteorValues[i].trim()));
                currentIndex = i;
                break;
            }
        }
        for(int j = currentIndex; j < meteorValues.length; j++) {
            if(meteorValues[j].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newMeteorData.setMeteorCols(Integer.parseInt(meteorValues[j].trim()));
                currentIndex = j;
                break;
            }
        }
        for(int k = currentIndex; k < meteorValues.length; k++) {
            if(meteorValues[k].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newMeteorData.setMeteorRows(Integer.parseInt(meteorValues[k].trim()));
                currentIndex = k;
                break;
            }
        }
        for(int l = currentIndex; l < meteorValues.length; l++) {
            if(meteorValues[l].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newMeteorData.setMaxSpeed(Double.parseDouble(meteorValues[l].trim()));
                currentIndex = l;
                break;
            }
        }

        return newMeteorData;
    }

    public static ExplosionData readExplosionData(Scanner reader) {
        ExplosionData newExplosionData = new ExplosionData();

        newExplosionData.setExplosionSpriteFile(reader.nextLine());

        String[] explosionValues = reader.nextLine().split(" ");
        int currentIndex = 0;
        for(int i = 0; i < explosionValues.length; i++) {
            if(explosionValues[i].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newExplosionData.setExplosionCols(Integer.parseInt(explosionValues[i].trim()));
                currentIndex = i;
                break;
            }
        }
        for(int j = currentIndex; j < explosionValues.length; j++) {
            if(explosionValues[j].trim().equals("")) {
                System.out.println("Skipping a line");
            }
            else {
                newExplosionData.setExplosionRows(Integer.parseInt(explosionValues[j].trim()));
                currentIndex = j;
                break;
            }
        }

        return newExplosionData;
    }
}
