package com.ahmed.albums.restcontroller;

import com.ahmed.albums.entities.Album;
import com.ahmed.albums.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AlbumRESTController {
    @Autowired
    AlbumService albumService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Album getAlbumById(@PathVariable("id") Long id) {
        return albumService.getAlbum(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Album createAlbum(@RequestBody Album a) {
        return albumService.saveAlbum(a);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Album updateAlbum(@RequestBody Album a) {
        return albumService.updateAlbum(a);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAlbum(@PathVariable("id") Long id) {
        albumService.deleteAlbumById(id);
    }

    @RequestMapping(value = "/label/{idLabel}", method = RequestMethod.GET)
    public List<Album> getAlbumsByLabel(@PathVariable("idLabel") Long idLabel) {
        return albumService.findByLabelIdLabel(idLabel);
    }
}
