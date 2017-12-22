package com.glass_fox.charactersheet.database.ddmodel;

import android.arch.persistence.room.*;
import android.graphics.Bitmap;

/**
 * Models a character for the Room Database
 */
@Entity(foreignKeys = {
        @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "user_id"),
        @ForeignKey(entity = Class.class, parentColumns = "id", childColumns = "class_id"),
})
public class Character {
    @PrimaryKey
    private String id;

    @ColumnInfo(name = "character_name")
    private String characterName;

    private String user_id;
    private String class_id;
    private Bitmap portrait;

    private int level;
    private int armor;
    private int proficiency;
    private int movement;

    @Embedded
    private Background background;
    @Embedded
    private Attributes attributes;
    @Embedded
    private Saves saves;
    @Embedded
    private Inventory inventory;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Saves getSaves() {
        return saves;
    }

    public void setSaves(Saves saves) {
        this.saves = saves;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Bitmap getPortrait() {
        return portrait;
    }

    public void setPortrait(Bitmap portrait) {
        this.portrait = portrait;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getProficiency() {
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }
}

class Background {
    @PrimaryKey
    String id;

    String name;
    String ability;
}

class Attributes {
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
}

/**
 * Skill flags:
 * 0: Character has no proficiency
 * 1: Proficient
 * 2: Expertise
 * 3: Jack of all trades
 */
class Abilities {

    int acrobatics;
    int animal_handeling;
    int arcana;
    int athletics;
    int deception;
    int history;
    int insight;
    int intimidation;
    int investigation;
    int medicine;
    int nature;
    int perception;
    int performance;
    int persuasion;
    int religion;
    int sleight_of_hand;
    int stealth;
    int survival;
}

/**
 * true if proficient
 */
class Saves {
    boolean strength;
    boolean dexterity;
    boolean constitution;
    boolean intelligence;
    boolean wisdom;
    boolean charisma;
}

class Inventory {
    int gold;
    int silver;
    String items;
}