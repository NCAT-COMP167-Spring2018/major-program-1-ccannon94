/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

import java.net.URL;
import javafx.scene.media.AudioClip;

/**
 *
 * @author CCannon
 */
public class SoundData {
    private AudioClip[] sounds;
    public final int ENGINE_CLIP_NUM = 0;
    public final int EXPLOSION_CLIP_NUM = 1;
    public final int BEEP_CLIP_NUM = 2;
    public final int TRANSPORTER_CLIP_NUM = 3;
    public final int SHIELDS_CRITICAL_CLIP_NUM = 4;
    
    public void setSoundResource(int index, String soundFile) {
        URL soundResource = getClass().getResource(soundFile);
        sounds[index] = new AudioClip(soundResource.toString());
    }
    
    public int getNumSounds() {
        return 5;
    }
    
    public AudioClip getSound(int index) {
        return sounds[index];
    }
}
