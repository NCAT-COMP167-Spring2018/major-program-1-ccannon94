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
public class ExplosionData {
    private String explosionSpriteFile;
    private int explosionRows;
    private int explosionCols;

    
    
    /**
     * @return the explosionSpriteFile
     */
    public String getExplosionSpriteFile() {
        return explosionSpriteFile;
    }

    /**
     * @param explosionSpriteFile the explosionSpriteFile to set
     */
    public void setExplosionSpriteFile(String explosionSpriteFile) {
        this.explosionSpriteFile = explosionSpriteFile;
    }

    /**
     * @return the explosionRows
     */
    public int getExplosionRows() {
        return explosionRows;
    }

    /**
     * @param explosionRows the explosionRows to set
     */
    public void setExplosionRows(int explosionRows) {
        this.explosionRows = explosionRows;
    }

    /**
     * @return the explosionCols
     */
    public int getExplosionCols() {
        return explosionCols;
    }

    /**
     * @param explosionCols the explosionCols to set
     */
    public void setExplosionCols(int explosionCols) {
        this.explosionCols = explosionCols;
    }
}
