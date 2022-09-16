package com.playlist.persistence

import com.playlist.model.Song

interface SongGateway {
    fun save(song: Song): Song
    fun findById(id: Long): Song?
}