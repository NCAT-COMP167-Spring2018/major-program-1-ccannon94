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
public class RankData {
    private ArrayList<Rank> ranks;
    
    public RankData() {
        ranks = new ArrayList<>();
    }
    
    public int getNumRanks() {
        return ranks.size();
    }
    
    public void addRank(Rank rank) {
        ranks.add(rank);
    }
    
    public void setRank(int index, Rank rank) { 
        ranks.set(index, rank);
    }
    
    public Rank getRank(int index) {
        return ranks.get(index);
    }
    
    public Rank deleteRank(int index) {
        return ranks.remove(index);
    }
    
    public String toString() {
        String output = "";
        for(Rank rank : ranks) {
            output += rank.toString() + System.lineSeparator();
        }
        return output;
    }
}
