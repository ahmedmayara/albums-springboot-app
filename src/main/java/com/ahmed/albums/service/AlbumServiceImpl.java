package com.ahmed.albums.service;

import com.ahmed.albums.entities.Album;
import com.ahmed.albums.entities.Label;
import com.ahmed.albums.repos.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    @Override
    public Album saveAlbum(Album a) {
        return albumRepository.save(a);
    }

    @Override
    public Album updateAlbum(Album a) {
        return albumRepository.save(a);
    }

    @Override
    public void deleteAlbum(Album a) {
        albumRepository.delete(a);
    }

    @Override
    public void deleteAlbumById(Long id) {
        albumRepository.deleteById(id);
    }

    @Override
    public Album getAlbum(Long id) {
        return albumRepository.findById(id).get();
    }

    @Override
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    // Methods From AlbumRepository

    @Override
    public List<Album> findByTitle(String title) {
        return albumRepository.findByTitle(title);
    }

    @Override
    public List<Album> findByTitleContains(String title) {
        return albumRepository.findByTitleContains(title);
    }

    @Override
    public List<Album> findByGenre(String genre) {
        return albumRepository.findByGenre(genre);
    }

    @Override
    public List<Album> findByLabel(Label label) {
        return albumRepository.findByLabel(label);
    }

    @Override
    public List<Album> findByLabelIdLabel(Long id) {
        return albumRepository.findByLabelIdLabel(id);
    }

    @Override
    public List<Album> findByOrderByTitleAsc() {
        return albumRepository.findByOrderByTitleAsc();
    }

    @Override
    public List<Album> sortByTitleAndGenre() {
        return albumRepository.sortByTitleAndGenre();
    }
}

