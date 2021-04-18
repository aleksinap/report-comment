package ru.netology.data

data class PhotoCopy (
//    тип копии. См. Формат описания размеров фотографии.
    val type: String,
//    URL копии.
    val url: String,
//    высота в px.
    val width: Int,
//    ширина в px.
    val height: Int
)
