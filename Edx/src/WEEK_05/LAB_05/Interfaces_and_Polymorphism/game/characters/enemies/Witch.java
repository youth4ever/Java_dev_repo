package WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.enemies;

/**
 * Created by Bogdan Trif on 04-05-2017 , 6:17 PM.
 */

import WEEK_05.LAB_05.Interfaces_and_Polymorphism.game.characters.Character ;

/**
 * This code allows you to represent a generic witch to be used in a simple game.
 */
public class Witch extends Enemy{
    public Witch(String name, String description){
        super(name, description, Character.SPELL);
        footprint = 'w';
    }

}