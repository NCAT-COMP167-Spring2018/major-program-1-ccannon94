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
public class MeteorData {
    private String meteorSpriteFile;
    private int minSize;
    private int meteorCols;
    private int meteorRows;
    private double maxSpeed;

    public MeteorData() {
        meteorSpriteFile = "";
        minSize = meteorCols = meteorRows = 0;
        maxSpeed = 0.0;
    }
    
    /**
     * @return the meteorSpriteFile
     */
    public String getMeteorSpriteFile() {
        return meteorSpriteFile;
    }

    /**
     * @param meteorSpriteFile the meteorSpriteFile to set
     */
    public void setMeteorSpriteFile(String meteorSpriteFile) {
        this.meteorSpriteFile = meteorSpriteFile;
    }

    /**
     * @return the minSize
     */
    public int getMinSize() {
        return minSize;
    }

    /**
     * @param minSize the minSize to set
     */
    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    /**
     * @return the meteorCols
     */
    public int getMeteorCols() {
        return meteorCols;
    }

    /**
     * @param meteorCols the meteorCols to set
     */
    public void setMeteorCols(int meteorCols) {
        this.meteorCols = meteorCols;
    }

    /**
     * @return the meteorRows
     */
    public int getMeteorRows() {
        return meteorRows;
    }

    /**
     * @param meteorRows the meteorRows to set
     */
    public void setMeteorRows(int meteorRows) {
        this.meteorRows = meteorRows;
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
    
    public String toString() {
        return meteorSpriteFile + System.lineSeparator() + minSize + ", " + meteorCols + ", " + meteorRows + System.lineSeparator() + maxSpeed;
    }
}
