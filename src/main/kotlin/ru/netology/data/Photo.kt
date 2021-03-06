package ru.netology.data

data class Photo (
    //    идентификатор фотографии
    val id: Int,
    //    идентификатор альбома, в котором находится фотография
    val albumId: Int,
    //    идентификатор владельца фотографии
    val ownerId: Int,
    //    идентификатор пользователя,
    //    загрузившего фото (если фотография размещена в сообществе).
    //    Для фотографий, размещенных от имени сообщества, user_id = 100.
    val userId: Int,
    //  текст описания фотографии.
    val text: String,
    //    дата добавления в формате Unixtime
    val date: Int,
    //    массив с копиями изображения в разных размерах
    val sizes: Array<PhotoCopy>,
    //    ширина оригинала фотографии в пикселах
    val width: Int,
    //    высота оригинала фотографии в пикселах
    val height: Int
)
