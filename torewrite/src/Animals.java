/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author L117student
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();
        zoo.add(new Dog(true, "Pete"));
        printOut(zoo.get(0));
        zoo.add(new Cat(9, "Anne Belly"));
        printOut(zoo.get(1));
        zoo.add(new Student(19, "Joe John Johnson"));
        printOut(zoo.get(2));  
        for (Talkable thing: zoo) {
            printOut(thing);  
        }
    }
    
    public static void printOut(Talkable p)  {
        System.out.println(p + " says=" + p.talk());
        if (p instanceof Cat) {
            Cat c = (Cat)p;
            System.out.println(((Cat) p).getMousesKilled());
        }
        
    }    
}
