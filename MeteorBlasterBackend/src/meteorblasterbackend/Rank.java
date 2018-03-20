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
public class Rank {
    private int rankId;
    private String rankName;
    private int pointsNeeded;

    /**
     * @return the rankId
     */
    public int getRankId() {
        return rankId;
    }

    /**
     * @param rankId the rankId to set
     */
    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    /**
     * @return the rankName
     */
    public String getRankName() {
        return rankName;
    }

    /**
     * @param rankName the rankName to set
     */
    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    /**
     * @return the pointsNeeded
     */
    public int getPointsNeeded() {
        return pointsNeeded;
    }

    /**
     * @param pointsNeeded the pointsNeeded to set
     */
    public void setPointsNeeded(int pointsNeeded) {
        this.pointsNeeded = pointsNeeded;
    }
}
