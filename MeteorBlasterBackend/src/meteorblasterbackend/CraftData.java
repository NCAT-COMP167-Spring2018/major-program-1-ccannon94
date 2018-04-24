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
public class CraftData {
    private ArrayList<String> imageFiles;
    private String phaserSoundFile;
    private double thrustIncreaseAmount;
    private double thrustDecreaseAmount;
    private double maxSpeed;

    public CraftData() {
        imageFiles = new ArrayList<>();
        phaserSoundFile = "";
        thrustIncreaseAmount = thrustDecreaseAmount = maxSpeed = 0.0;
    }
    
    /**
     * @return the phaserSoundFile
     */
    public String getPhaserSoundFile() {
        return phaserSoundFile;
    }

    /**
     * @param phaserSoundFile the phaserSoundFile to set
     */
    public void setPhaserSoundFile(String phaserSoundFile) {
        this.phaserSoundFile = phaserSoundFile;
    }

    /**
     * @return the thrustIncreaseAmount
     */
    public double getThrustIncreaseAmount() {
        return thrustIncreaseAmount;
    }

    /**
     * @param thrustIncreaseAmount the thrustIncreaseAmount to set
     */
    public void setThrustIncreaseAmount(double thrustIncreaseAmount) {
        this.thrustIncreaseAmount = thrustIncreaseAmount;
    }

    /**
     * @return the thrustDecreaseAmount
     */
    public double getThrustDecreaseAmount() {
        return thrustDecreaseAmount;
    }

    /**
     * @param thrustDecreaseAmount the thrustDecreaseAmount to set
     */
    public void setThrustDecreaseAmount(double thrustDecreaseAmount) {
        this.thrustDecreaseAmount = thrustDecreaseAmount;
    }

    /**
     * @return the maxSpeed
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public int getNumImageFiles() {
        return imageFiles.size();
    }
    
    public void addImageFile(String imageFile) {
        imageFiles.add(imageFile);
    }
    
    public void setImageFile(int index, String imageFile) {
        imageFiles.set(index, imageFile);
    }
    
    public String getImageFile(int index) {
        return imageFiles.get(index);
    }
    
    public String deleteImageFile(int index) {
        return imageFiles.remove(index);
    }
    
    public String toString() {
        String output = "";
        
        for(int i = 0; i < imageFiles.size(); i ++) {
            output += imageFiles.get(i);
            if(i < (imageFiles.size() - 1))
                output += ", ";
        }
        
        output += System.lineSeparator() + phaserSoundFile + System.lineSeparator() + thrustIncreaseAmount + ", " + thrustDecreaseAmount + ", " + maxSpeed;
        
        return output;
    }
}
