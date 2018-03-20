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
                GamerProfile newProfile = new GamerProfile(gamerLine1[0], gamerLine1[1], Integer.parseInt(gamerLine1[2]), Integer.parseInt(gamerLine2[0]), Integer.parseInt(gamerLine2[1]), Integer.parseInt(gamerLine2[2]), Integer.parseInt(gamerLine2[3]), Integer.parseInt(gamerLine2[4]), Integer.parseInt(gamerLine2[5]));
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
}
