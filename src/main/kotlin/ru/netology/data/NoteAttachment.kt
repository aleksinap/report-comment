package ru.netology.data

data class NoteAttachment(val note: Note) : Attachment{
    override val type: String = "note"
}
