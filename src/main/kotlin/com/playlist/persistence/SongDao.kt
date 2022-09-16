package com.playlist.persistence

import com.playlist.model.Song
import org.springframework.stereotype.Component

@Component
class SongDao(private val repository: SongRepository): SongGateway {

    override fun save(song: Song): Song {
        return repository.save(TblSong(null, song.name, song.artist, song.genre)).toSong()
    }

    override fun findById(id: Long): Song? {
        return repository.findById(id)?.toSong()
    }
}
