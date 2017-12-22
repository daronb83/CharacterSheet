package com.glass_fox.charactersheet.database.galary;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

/**
 * Models a gallery
 */
@Entity(foreignKeys = @ForeignKey(
        entity = Character.class, parentColumns = "id", childColumns = "character_id"))
public class GalleryItem {
    @PrimaryKey
    private String id;

    private String character_id;
    private Bitmap image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(String character_id) {
        this.character_id = character_id;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
