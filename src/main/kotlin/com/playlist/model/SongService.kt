package com.playlist.model;

import com.playlist.persistence.SongDao
import org.springframework.stereotype.Service;

@Service
class SongService(private val songDao: SongDao) {
    fun save(song: Song): Song {
        return songDao.save(song);
    }
}
