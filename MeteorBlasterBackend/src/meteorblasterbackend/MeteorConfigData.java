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
public class MeteorConfigData {
    private CraftData craftData;
    private MeteorData meteorData;
    private ExplosionData explosionData;
    private RankData rankData;
    private SoundData soundData;
    private LevelData levelData;

    public MeteorConfigData() {
        craftData = new CraftData();
        meteorData = new MeteorData();
        explosionData = new ExplosionData();
        rankData = new RankData();
        soundData = new SoundData();
        levelData = new LevelData();
    }
    
    /**
     * @return the craftData
     */
    public CraftData getCraftData() {
        return craftData;
    }

    /**
     * @param craftData the craftData to set
     */
    public void setCraftData(CraftData craftData) {
        this.craftData = craftData;
    }

    /**
     * @return the meteorData
     */
    public MeteorData getMeteorData() {
        return meteorData;
    }

    /**
     * @param meteorData the meteorData to set
     */
    public void setMeteorData(MeteorData meteorData) {
        this.meteorData = meteorData;
    }

    /**
     * @return the explosionData
     */
    public ExplosionData getExplosionData() {
        return explosionData;
    }

    /**
     * @param explosionData the explosionData to set
     */
    public void setExplosionData(ExplosionData explosionData) {
        this.explosionData = explosionData;
    }

    /**
     * @return the rankData
     */
    public RankData getRankData() {
        return rankData;
    }

    /**
     * @param rankData the rankData to set
     */
    public void setRankData(RankData rankData) {
        this.rankData = rankData;
    }

    /**
     * @return the soundData
     */
    public SoundData getSoundData() {
        return soundData;
    }

    /**
     * @param soundData the soundData to set
     */
    public void setSoundData(SoundData soundData) {
        this.soundData = soundData;
    }

    /**
     * @return the levelData
     */
    public LevelData getLevelData() {
        return levelData;
    }

    /**
     * @param levelData the levelData to set
     */
    public void setLevelData(LevelData levelData) {
        this.levelData = levelData;
    }
    
    public String toString() {
        return rankData.toString() + "*" + System.lineSeparator() + soundData.toString() + levelData.toString() + "*" + System.lineSeparator() + craftData.toString() + System.lineSeparator() + meteorData.toString() + System.lineSeparator() + explosionData.toString();
    }
}
