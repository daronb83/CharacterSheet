package com.glass_fox.charactersheet.database.ddmodel;

import android.arch.persistence.room.*;

/**
 * Maps attacks to characters for the Room Database
 */
public class EntityAttacks {
    @PrimaryKey
    private String id;

    private String entity_id;
    private String attack_id;

}