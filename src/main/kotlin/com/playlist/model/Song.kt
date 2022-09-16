package com.playlist.model

data class Song(var id:Long? = null,
                var name: String,
                var artist: String,
                var genre: Genre) {
}