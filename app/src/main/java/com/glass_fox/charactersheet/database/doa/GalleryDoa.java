package com.glass_fox.charactersheet.database.doa;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.glass_fox.charactersheet.database.galary.GalleryItem;
import com.glass_fox.charactersheet.database.galary.User;

import java.util.List;

/**
 * Handles database access for the gallery
 */
@Dao
public interface GalleryDoa {

    @Insert
    public void insertUsers(User... users);

    @Insert
    public void insertCharacters(Character... characters);

    @Insert
    public void insertGalleryItems(GalleryItem... galleryItems);


    @Update
    public void updateUsers(User... users);

    @Update
    public void updateCharacters(Character... characters);

    @Update
    public void updateGalleryItems(GalleryItem... galleryItems);


    @Delete
    public void deleteUsers(User... users);

    @Delete
    public void deleteCharacters(Character... characters);

    @Delete
    public void deleteGalleryItems(GalleryItem... galleryItems);


    @Query("SELECT * FROM user WHERE id = :userId")
    public List<User> loadUser(String userId);

    @Query("SELECT * FROM character WHERE user_id = :userId")
    public List<User> loadCharacters(String userId);

    @Query("SELECT * FROM galleryitem WHERE character_id = :characterId")
    public List<User> loadGalleryItems(String chacterId);
}
