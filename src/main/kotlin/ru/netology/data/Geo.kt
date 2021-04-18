package ru.netology.data

data class Geo (
    //    тип места;
    val type: String,
    //    координаты места
    val coordinates: String,
    //    описание места (если оно добавлено)
    val place: Place?
)
