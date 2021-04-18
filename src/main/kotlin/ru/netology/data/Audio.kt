package ru.netology.data

data class Audio (
//    идентификатор аудиозаписи
    val id: Int,
//    идентификатор владельца аудиозаписи
    val owner_id: Int,
//    исполнитель
    val artist: String,
//    название композиции
    val title: String,
//    лительность аудиозаписи в секундах
    val duration: Int,
//    ссылка на mp3
    val url: String,
//    идентификатор текста аудиозаписи (если доступно)
    val lyricsId: Int?,
//    идентификатор альбома, в котором находится аудиозапись (если присвоен)
    val albumId: Int?,
//    идентификатор жанра из списка аудио жанров
    val genreId: Int,
//    дата добавления
    val date: Int,
//    true, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val no_search: Boolean,
//    true, если аудио в высоком качестве
    val isHq: Boolean,
)
