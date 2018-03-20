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
public class LevelData {
    private ArrayList<Level> levels;
    
    public LevelData() {
        levels = new ArrayList<>();
    }
    
    public void addLevel(Level level) {
        levels.add(level);
    }
    
    public int getNumLevels() {
        return levels.size();
    }
    
    public void setLevel(int index, Level level) {
        levels.set(index, level);
    }
    
    public Level getLevel(int index) {
        return levels.get(index);
    }
    
    public Level deleteLevel(int index) {
        return levels.remove(index);
    }
}
