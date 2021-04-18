package ru.netology.data

data class Comments (
    //    количество комментариев
    val count: Int,
    //    информация о том, может ли текущий пользователь
    //    комментировать запись (true — может, false — не может)
    val canPost: Boolean,
    //    информация о том, могут ли сообщества комментировать запись
    val groupsCanPost: Boolean,
    //может ли текущий пользователь закрыть комментарии к записи
    val canClose: Boolean,
    //может ли текущий пользователь открыть комментарии к записи
    val canOpen: Boolean
)