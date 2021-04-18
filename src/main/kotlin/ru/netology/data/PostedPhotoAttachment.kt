package ru.netology.data

data class PostedPhotoAttachment(val postedPhoto: PostedPhoto) : Attachment{
    override val type: String = "postedPhoto"
}
