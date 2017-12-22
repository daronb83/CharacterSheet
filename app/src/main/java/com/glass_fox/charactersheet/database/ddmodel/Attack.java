package com.glass_fox.charactersheet.database.ddmodel;

import android.arch.persistence.room.PrimaryKey;

/**
 * Models a spell
 */
public class Attack {
    @PrimaryKey
    String id;

    String name;
    int damage_dice;
    int damage_dice_type;
    String damage_type;
    int range;
    boolean finesse;
    boolean spell;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage_dice() {
        return damage_dice;
    }

    public void setDamage_dice(int damage_dice) {
        this.damage_dice = damage_dice;
    }

    public int getDamage_dice_type() {
        return damage_dice_type;
    }

    public void setDamage_dice_type(int damage_dice_type) {
        this.damage_dice_type = damage_dice_type;
    }

    public String getDamage_type() {
        return damage_type;
    }

    public void setDamage_type(String damage_type) {
        this.damage_type = damage_type;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public boolean isFinesse() {
        return finesse;
    }

    public void setFinesse(boolean finesse) {
        this.finesse = finesse;
    }

    public boolean isSpell() {
        return spell;
    }

    public void setSpell(boolean spell) {
        this.spell = spell;
    }
}
