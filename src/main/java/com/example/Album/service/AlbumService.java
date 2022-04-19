package com.example.Album.service;

import com.example.Album.model.Album;
import com.example.Album.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService
{
    @Autowired
    private AlbumRepository albumRepository;
    public Album getAlbum()
    {
        return albumRepository.getAlbum();
    }
}
