package ru.netology.data

data class VideoAttachment(val video: Video) : Attachment{
    override val type: String = "video"
}
