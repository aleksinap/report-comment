package ru.netology.data

data class PhotoAttachment(val photo: Photo) : Attachment {
    override val type: String = "photo"
}