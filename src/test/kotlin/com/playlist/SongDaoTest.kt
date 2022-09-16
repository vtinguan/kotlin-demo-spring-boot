package com.playlist;

import com.playlist.model.Genre
import com.playlist.model.Song
import com.playlist.persistence.SongDao
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
class SongDaoTest(@Autowired private val songDao: SongDao): TestcontainersSetup() {

  @Test
  fun `findById should return two songs that have been saved`() {
    val a = songDao.save(Song(name = "ab", artist = "bc", genre = Genre.SAMBA))
    val b = songDao.save(Song(name = "a", artist = "b", genre = Genre.ROCK))

    val persistedA = songDao.findById(a.id!!);
    val persistedB = songDao.findById(b.id!!);

    Assertions.assertEquals(a, persistedA)
    Assertions.assertEquals(b, persistedB)
  }
}
