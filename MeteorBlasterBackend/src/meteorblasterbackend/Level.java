/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

/**
 *
 * @author CCannon
 */
public class Level {
    private int levelRangeMin;
    private int levelRangeMax;
    private int numMeteors;
    private double maxMeteorSpeed;
    private String levelBackgroundImage;

    public Level() {
        levelRangeMin = levelRangeMax = numMeteors = 0;
        maxMeteorSpeed = 0.0;
        levelBackgroundImage = "";
    }
    
    public Level(int levelRangeMin, int levelRangeMax, double maxMeteorSpeed, int numMeteors, String levelBackgroundImage){
        this.levelRangeMin = levelRangeMin;
        this.levelRangeMax = levelRangeMax;
        this.numMeteors = numMeteors;
        this.maxMeteorSpeed = maxMeteorSpeed;
        this.levelBackgroundImage = levelBackgroundImage;
    }
    
    /**
     * @return the levelRangeMin
     */
    public int getLevelRangeMin() {
        return levelRangeMin;
    }

    /**
     * @param levelRangeMin the levelRangeMin to set
     */
    public void setLevelRangeMin(int levelRangeMin) {
        this.levelRangeMin = levelRangeMin;
    }

    /**
     * @return the levelRangeMax
     */
    public int getLevelRangeMax() {
        return levelRangeMax;
    }

    /**
     * @param levelRangeMax the levelRangeMax to set
     */
    public void setLevelRangeMax(int levelRangeMax) {
        this.levelRangeMax = levelRangeMax;
    }

    /**
     * @return the numMeteors
     */
    public int getNumMeteors() {
        return numMeteors;
    }

    /**
     * @param numMeteors the numMeteors to set
     */
    public void setNumMeteors(int numMeteors) {
        this.numMeteors = numMeteors;
    }

    /**
     * @return the maxMeteorSpeed
     */
    public double getMaxMeteorSpeed() {
        return maxMeteorSpeed;
    }

    /**
     * @param maxMeteorSpeed the maxMeteorSpeed to set
     */
    public void setMaxMeteorSpeed(double maxMeteorSpeed) {
        this.maxMeteorSpeed = maxMeteorSpeed;
    }

    /**
     * @return the levelBackgroundImage
     */
    public String getLevelBackgroundImage() {
        return levelBackgroundImage;
    }

    /**
     * @param levelBackgroundImage the levelBackgroundImage to set
     */
    public void setLevelBackgroundImage(String levelBackgroundImage) {
        this.levelBackgroundImage = levelBackgroundImage;
    }
    
    public String toString() {
        return levelRangeMin + ", " + levelRangeMax + ", " + maxMeteorSpeed + ", " + numMeteors + ", " + levelBackgroundImage;
    }
}
