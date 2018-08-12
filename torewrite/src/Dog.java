/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author L117student
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    public boolean isFriendly() {
        return friendly;
    }

    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }
    
    
}
