package ru.netology.data

data class Repost (
    //    число пользователей, скопировавших запись
    val count: Int,
    //    наличие репоста от текущего пользователя (true — есть, false — нет)
    val userReposted: Boolean
    )