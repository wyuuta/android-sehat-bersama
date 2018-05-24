package com.example.yuuta.sehatbersama.Object

class Course(val nama: String, val deskripsi: String, val lama: String, val link: String) {

    fun ambilNama(): String {
        return nama
    }

    fun ambilDeskripsi(): String {
        return deskripsi
    }

    fun ambilLama(): String {
        return lama
    }

    fun ambilLink(): String {
        return link
    }
}