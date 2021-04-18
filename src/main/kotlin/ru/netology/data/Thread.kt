package ru.netology.data

data class Thread(
    //    количество комментариев в ветке
    val count: Int,
    //    массив объектов комментариев к записи (только для метода wall.getComments)
    val items: Array<Comment>?,
    //    может ли текущий пользователь оставлять комментарии в этой ветке
    val canPost: Boolean,
    //    нужно ли отображать кнопку «ответить» в ветке
    val showReplyButton: Boolean,
    //    могут ли сообщества оставлять комментарии в ветке
    val groupsCanPost: Boolean
)
