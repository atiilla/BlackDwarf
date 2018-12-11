package com.demoTime.black_dwarf.characters.impl;

import com.demoTime.black_dwarf.characters.Adventurers;
import com.demoTime.black_dwarf.equipment.Weapons;

public class Warrior extends Adventurers {

    public Warrior(String name, String backgroundStory) {
        super(name, backgroundStory);
        setStrength(2);
        bag[0] = Weapons.BATTLE_AXE;
    }

    protected void setStrength(int diceThrows) {
        super.strength = dice.throwDice(diceThrows) + 6;
    }

    @Override
    public String toString() {
        return "Warrior, name: " + name + "\nstrength: " + strength +  "\nagillity: " + agility
                + "\nintelligence: " + intelligence + "\nHelmet:" + helmet + "\nChest:" + chest
                + "\nPants: " + pants + "\nBoots" + boots + super.toString();
    }

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Alex", "");
        System.out.println(warrior);

    }

}
