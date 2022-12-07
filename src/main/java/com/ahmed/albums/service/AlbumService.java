package com.ahmed.albums.service;

import com.ahmed.albums.entities.Album;
import com.ahmed.albums.entities.Label;

import java.util.List;

public interface AlbumService {
    Album saveAlbum(Album a);
    Album updateAlbum(Album a);
    void deleteAlbum(Album a);
    void deleteAlbumById(Long id);
    Album getAlbum(Long id);
    List<Album> getAllAlbums();
    List<Album> findByTitle(String title);
    List<Album> findByTitleContains(String title);
    List<Album> findByGenre(String genre);
    List<Album> findByLabel(Label label);
    List<Album> findByLabelIdLabel(Long id);
    List<Album> findByOrderByTitleAsc();
    List<Album> sortByTitleAndGenre();
}
