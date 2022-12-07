package com.ahmed.albums;

import com.ahmed.albums.entities.Album;
import com.ahmed.albums.entities.Label;
import com.ahmed.albums.repos.AlbumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class AlbumsApplicationTests {
	@Autowired
	private AlbumRepository albumRepository;

	@Test
	public void testCreateAlbum() {
		Album album = new Album("All Eyes On Me", "Tupac Shakur", "Rap", new Date());
		albumRepository.save(album);
	}

	@Test
	public void testFindAlbum() {
		Album album = albumRepository.findById(1L).get();
		System.out.println(album);
	}

	@Test
	public void testUpdateAlbum() {
		Album album = albumRepository.findById(1L).get();
		album.setGenre("Progressive Rock");
		albumRepository.save(album);
	}

	@Test
	public void testDeleteAlbum() {
		albumRepository.deleteById(1L);
	}

	@Test
	public void testListAlbums() {
		Iterable<Album> albums = albumRepository.findAll();
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testFindByTitle() {
		List<Album> albums = albumRepository.findByTitle("The Life Of Pablo");
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testFindByTitleContains() {
		List<Album> albums = albumRepository.findByTitleContains("Pablo");
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testFindByGenre() {
		List<Album> albums = albumRepository.findByGenre("Hip Hop");
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testFindByLabel() {
		Label label = new Label();
		label.setIdLabel(1L);

		List<Album> albums = albumRepository.findByLabel(label);
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testFindByLabelIdLabel() {
		List<Album> albums = albumRepository.findByLabelIdLabel(1L);
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testFindByOrderByTitleAsc() {
		List<Album> albums = albumRepository.findByOrderByTitleAsc();
		for (Album album : albums) {
			System.out.println(album);
		}
	}

	@Test
	public void testSortByTitleAndGenre() {
		List<Album> albums = albumRepository.sortByTitleAndGenre();
		for (Album album : albums) {
			System.out.println(album);
		}
	}
}
