package ru.netology.data

data class Place (
    //    идентификатор места
    val id: Int,
    //    название места
    val title: String,
    //    географическая широта, заданная в градусах (от -90 до 90)
    val latitude: Int,
    //    географическая широта, заданная в градусах (от -90 до 90)
    val longitude: Int,
    //    дата создания места в Unixtime
    val created: Int,
    //    иконка места, URL изображения
    val icon: String,
    //    число отметок в этом месте
    val checkins: Int,
    //    дата обновления места в Unixtime
    val updated: Int,
    //    тип места
    val type: Int,
    //    идентификатор страны
    val country: Int,
    //    идентификатор города
    val city: Int,
    //    адрес места
    val address: String
)
