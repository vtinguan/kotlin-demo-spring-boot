package com.playlist.persistence

import org.springframework.data.repository.Repository

interface SongRepository : Repository<TblSong, Long> {
    fun findById(id: Long): TblSong?

    fun save(tblSong: TblSong): TblSong
}