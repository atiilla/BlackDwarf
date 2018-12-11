package com.demoTime.black_dwarf.characters.impl;

import com.demoTime.black_dwarf.characters.Adventurers;
import com.demoTime.black_dwarf.equipment.Weapons;

public class Spelluser extends Adventurers {

    public Spelluser(String name, String backgroundStory) {
        super(name, backgroundStory);
        setIntelligence(2);
        bag[0] = Weapons.WIZZARD_STAFF;
    }

    protected void setIntelligence(int diceThrows) {
        super.intelligence = dice.throwDice(diceThrows) + 6;
    }

    @Override
    public String toString() {
        return "Spelluser, name: " + name + "\nstrength: " + strength +  "\nagillity: " + agility
                + "\nintelligence: " + intelligence + "\nHelmet:" + helmet + "\nChest:" + chest
                + "\nPants: " + pants + "\nBoots" + boots + super.toString();
    }

    public static void main(String[] args) {

        Spelluser mage = new Spelluser(null, "");
        System.out.println(mage);

    }

}
