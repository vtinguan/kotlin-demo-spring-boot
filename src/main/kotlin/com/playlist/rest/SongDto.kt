package com.playlist.rest

import com.playlist.model.Genre
import com.playlist.model.Song

data class SongDto(var id: Long? = null,
                   val name: String,
                   val artist: String,
                   val genre: Genre) {
}

fun SongDto.toSong() = Song(null, name, artist, genre)

fun Song.toDto() = SongDto(id, name, artist, genre)