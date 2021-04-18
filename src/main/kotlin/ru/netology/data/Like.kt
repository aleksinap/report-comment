package ru.netology.data

data class Like (
    //    число пользователей, которым понравилась запись
    val count: Int,
    //    наличие отметки «Мне нравится» от текущего пользователя (true — есть, false — нет)
    val userLikes: Boolean,
//    информация о том, может ли текущий пользователь
//    поставить отметку «Мне нравится» (true — может, false — не может)
    val canLike: Boolean,
    //    информация о том, может ли текущий пользователь
    //    сделать репост записи (true — может, false — не может)
    val canPublish: Boolean
)