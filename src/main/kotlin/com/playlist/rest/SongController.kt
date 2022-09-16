package com.playlist.rest

import com.playlist.model.SongService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(private val songService: SongService) {

    @PostMapping("/")
    fun saveSong(@RequestBody songDto: SongDto): SongDto = songService.save(songDto.toSong()).toDto()

}

fun main() {


}
