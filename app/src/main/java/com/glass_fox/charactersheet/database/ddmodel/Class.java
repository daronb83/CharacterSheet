package com.glass_fox.charactersheet.database.ddmodel;

import android.arch.persistence.room.*;

/**
 * Models a class for the Room Database
 */
public class Class {
    @PrimaryKey
    private int id;

    private String name;
}
