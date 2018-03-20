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
public class MeteorBlasterBackend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GamerProfile testGamer1 = new GamerProfile("Bob", "Saget", 1001, 4, 14, 323, 52, 1600, 143413);
        GamerProfile testGamer2 = new GamerProfile("Chris", "Cannon", 007, 2, 3, 6, 7, 67, 346);
        
        GamerProfileCollection testCollection = new GamerProfileCollection("words.txt", new GamerProfile(), new GamerProfile());
        testCollection.addGamerProfile(testGamer1);
        testCollection.addGamerProfile(testGamer2);
        
        System.out.println(testCollection);
    }
    
}
