package com.glass_fox.charactersheet.database.ddmodel;

import android.arch.persistence.room.*;

/**
 * Models a user for the Room Database
 */
@Entity
public class User {
    @PrimaryKey
    private int id;

    private String password;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

}
