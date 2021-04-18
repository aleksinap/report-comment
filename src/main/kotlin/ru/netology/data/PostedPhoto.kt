package ru.netology.data

data class PostedPhoto (
//    идентификатор фотографии
    val id: Int,
//    идентификатор владельца фотографии
    val ownerId: Int,
//    URL изображения для предпросмотра
    val photo130: String,
//    URL полноразмерного изображения
    val photo604: String
)
