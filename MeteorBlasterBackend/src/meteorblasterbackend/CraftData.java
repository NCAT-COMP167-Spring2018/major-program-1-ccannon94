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
}
