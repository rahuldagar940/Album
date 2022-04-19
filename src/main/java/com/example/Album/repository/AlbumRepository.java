package com.example.Album.repository;

import com.example.Album.model.Album;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepository
{
    public static Album getAlbum()
    {
        Album album = new Album("Album", "Trip", "MyPC");
                return album;
    }
}
