package com.playlist.persistence

import com.playlist.model.Genre
import com.playlist.model.Song
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import kotlin.concurrent.thread

@Entity
class TblSong(@Id @GeneratedValue var id:Long? = null,
              var name: String,
              var artist: String,
              var genre: Genre
)

fun TblSong.toSong() = Song(id, name, artist, genre)
