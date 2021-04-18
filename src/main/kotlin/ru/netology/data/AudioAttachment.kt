package ru.netology.data

data class AudioAttachment(val audio: Audio) : Attachment{
    override val type: String = "audio"
}
