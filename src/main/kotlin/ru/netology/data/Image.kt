package ru.netology.data

data class Image (
//    Высота изображения.
    val height: Int,
//    Ссылка на изображение
    val url: String,
//    Ширина изображение
    val width: Int,
//    Поле возвращается, если изображение с отбивкой, всегда содержит true.
    val withPadding: Boolean
)
