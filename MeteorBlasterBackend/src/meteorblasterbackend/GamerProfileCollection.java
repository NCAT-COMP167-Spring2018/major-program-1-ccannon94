/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

import java.util.ArrayList;

/**
 *
 * @author CCannon
 */
public class GamerProfileCollection {
    private String filename;
    private GamerProfile selectedProfile;
    private GamerProfile highGameProfile;
    private ArrayList<GamerProfile> gamerProfiles;

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return the selectedProfile
     */
    public GamerProfile getSelectedProfile() {
        return selectedProfile;
    }

    /**
     * @param selectedProfile the selectedProfile to set
     */
    public void setSelectedProfile(GamerProfile selectedProfile) {
        this.selectedProfile = selectedProfile;
    }

    /**
     * @return the highGameProfile
     */
    public GamerProfile getHighGameProfile() {
        return highGameProfile;
    }

    /**
     * @param highGameProfile the highGameProfile to set
     */
    public void setHighGameProfile(GamerProfile highGameProfile) {
        this.highGameProfile = highGameProfile;
    }
    
    public int getNumGamerProfiles() {
        return gamerProfiles.size();
    }
    
    public void setGamerProfile(int index, GamerProfile profile){
        gamerProfiles.set(index, profile);
    }
    
    public void addGamerProfile(GamerProfile profile) {
        gamerProfiles.add(profile);
    }
    
    public GamerProfile getGamerProfile(int index) {
        return gamerProfiles.get(index);
    }
    
    public GamerProfile deleteGamerProfile(int index) {
        return gamerProfiles.remove(index);
    }
}
