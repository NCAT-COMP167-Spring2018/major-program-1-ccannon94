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
public class GamerProfile {
    private String firstName;
    private String lastName;
    private String gamerId;
    private int gamerRank;
    private int gamesPlayed;
    private int torpedoesFired;
    private int meteorsHit;
    private int highScore; 
    private int totalScore;

    public GamerProfile() {
        firstName = lastName = gamerId = "";
        gamerRank = gamesPlayed = torpedoesFired = meteorsHit = highScore = totalScore = 0;
    }
    
    public GamerProfile(String firstName, String lastName, String gamerId, int gamerRank, int gamesPlayed, int torpedoesFired, int meteorsHit, int highScore, int totalScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gamerId = gamerId;
        this.gamerRank = gamerRank;
        this.gamesPlayed = gamesPlayed;
        this.torpedoesFired = torpedoesFired;
        this.meteorsHit = meteorsHit;
        this.highScore = highScore;
        this.totalScore = totalScore;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the gamerId
     */
    public String getGamerId() {
        return gamerId;
    }

    /**
     * @param gamerId the gamerId to set
     */
    public void setGamerId(String gamerId) {
        this.gamerId = gamerId;
    }

    /**
     * @return the gamerRank
     */
    public int getGamerRank() {
        return gamerRank;
    }

    /**
     * @param gamerRank the gamerRank to set
     */
    public void setGamerRank(int gamerRank) {
        this.gamerRank = gamerRank;
    }

    /**
     * @return the gamesPlayed
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the gamesPlayed to set
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * @return the torpedoesFired
     */
    public int getTorpedoesFired() {
        return torpedoesFired;
    }

    /**
     * @param torpedoesFired the torpedoesFired to set
     */
    public void setTorpedoesFired(int torpedoesFired) {
        this.torpedoesFired = torpedoesFired;
    }

    /**
     * @return the meteorsHit
     */
    public int getMeteorsHit() {
        return meteorsHit;
    }

    /**
     * @param meteorsHit the meteorsHit to set
     */
    public void setMeteorsHit(int meteorsHit) {
        this.meteorsHit = meteorsHit;
    }

    /**
     * @return the highScore
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     * @param highScore the highScore to set
     */
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    /**
     * @return the totalScore
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    
    public String toString(){
        return firstName + ", " + lastName + ", " + gamerId + System.lineSeparator() + gamerRank + " " + gamesPlayed + " " + torpedoesFired + " " + meteorsHit + " " + highScore + " " + totalScore;
    }
}
