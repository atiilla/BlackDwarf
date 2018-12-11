package com.demoTime.black_dwarf.characters.impl;

import com.demoTime.black_dwarf.characters.Adventurers;
import com.demoTime.black_dwarf.equipment.Weapons;

public class Rogue extends Adventurers {

    public Rogue(String name, String backgroundStory) {
        super(name, backgroundStory);
        setAgility(2);
        bag[0] = Weapons.SHORT_SWORD;
        bag[1] = Weapons.SHORT_SWORD;
    }

    protected void setAgility(int diceThrows) {
        super.agility = dice.throwDice(diceThrows) + 6;
    }

    @Override
    public String toString() {
        return "Rogue, name: " + name + "\nstrength: " + strength +  "\nagillity: " + agility
                + "\nintelligence: " + intelligence + "\nHelmet:" + helmet + "\nChest:" + chest
                + "\nPants: " + pants + "\nBoots" + boots + super.toString();
    }

    public static void main(String[] args) {

        Rogue rogue = new Rogue("Alex", "");
        System.out.println(rogue);

    }
}
