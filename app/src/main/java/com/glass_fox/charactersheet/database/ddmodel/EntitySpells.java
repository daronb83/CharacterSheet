package com.glass_fox.charactersheet.database.ddmodel;

import android.arch.persistence.room.*;

/**
 * Maps spells to classes for the Room Database
 */
public class EntitySpells {
    @PrimaryKey
    private String id;

    private String entity_id;
    private String spell_id;
}


