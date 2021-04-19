package ru.netology

import ru.netology.data.*
import ru.netology.service.WallService

fun main() {
    val post = Post(
        id = 4,
        ownerId = 12,
        fromId = 123,
        createdBy = 1234,
        date = 12345,
        text = "Привет Нетология",
        replyOwnerId = 123456,
        replyPostId = 1234567,
        friendsOnly = false,
        comments = Comments(
            count = 1,
            canPost = true,
            groupsCanPost = true,
            canClose = false,
            canOpen = false
        ),
        copyright = Copyright(
            id = 12345678,
            link = "ru.netology",
            name = "Нетология",
            type = "Неизвестно"
        ),
        likes = Like(
            count = 121,
            userLikes = false,
            canLike = true,
            canPublish = false
        ),
        reposts = Repost(
            count = 1,
            userReposted = false
        ),
        views = View(count = 25),
        postType = "post",
        postSource = PostSource(
            type = "vk",
            platform = "android",
            data = "profileActivity",
            url = "https://netology.ru"
        ),
        attachments = arrayOf(
            PhotoAttachment(
                photo = Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 1,
                    userId = 1,
                    text = "1",
                    date = 112345,
                    sizes = arrayOf(),
                    width = 1024,
                    height = 768
                )
            ),
            VideoAttachment(
                video = Video(
                    id = 1,
                    ownerId = 1,
                    title = "",
                    description = "Недоступно",
                    duration = 1234,
                    image = arrayOf(),
                    firstFrame = arrayOf(),
                    date = 1423434,
                    addingDate = 1234654,
                    views = 234,
                    localViews = 6,
                    comments = 23,
                    player= "flash",
                    platform = "https://netology.ru",
                    canAdd = true,
                    isPrivate = true,
                    accessKey = "https://netology.ru",
                    processing = true,
                    isFavorite = true,
                    canComment = true,
                    canEdit = true,
                    canLike = true,
                    canRepost = true,
                    canSubscribe = true,
                    canAddToFaves = true,
                    canAtachLink = true,
                    width = 1024,
                    height = 768,
                    userId = 456345,
                    converting = true,
                    added = true,
                    isSubscribed = true,
                    repeat = true,
                    type = "video",
                    balance = 0,
                    liveStatus = "waiting",
                    live = true,
                    upcoming = true,
                    spectators = 23
                )
            ),
            AudioAttachment(
                audio = Audio(
                    id = 1,
                    owner_id = 1,
                    artist = "No doubt",
                    title = "Don't speak",
                    duration = 1,
                    url = "https://netology.ru",
                    lyricsId = 1,
                    albumId = 1,
                    genreId = 1,
                    date = 1,
                    no_search = true,
                    isHq = true
                )
            ),
            PostedPhotoAttachment(
                postedPhoto = PostedPhoto(
                    id = 1,
                    ownerId = 1,
                    photo130 = "https://netology.ru",
                    photo604 = "https://netology.ru"
                )
            ),
            NoteAttachment(
                note = Note(
                    id = 1,
                    ownerId = 1,
                    title = "Недоступно",
                    text = "Недоступно",
                    date = 1654,
                    comments = 1,
                    readComments = 1,
                    viewUrl = "https://netology.ru"
                )
            )
        ),
        geo = Geo(
            type = "type",
            coordinates = "coordinates",
            place = null
        ),
        signerId = 2345,
        copyHistory = null,
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(
            isDonut = false,
            paidDuration = 1234567890,
            placeholder = Placeholder(),
            canPublishFreeCopy = false,
            editMode = "duration"
        ),
        postponedId = 12345
    )
    val post1 = Post(
        id = 2,
        ownerId = 1234,
        fromId = 456,
        createdBy = 67867,
        date = 567512345,
        text = "Updated",
        replyOwnerId = 65123456,
        replyPostId = 671234567,
        friendsOnly = true,
        comments = Comments(
            count = 1,
            canPost = true,
            groupsCanPost = true,
            canClose = false,
            canOpen = false
        ),
        copyright = Copyright(
            id = 12345678,
            link = "ru.netology",
            name = "Нетология",
            type = "Неизвестно"
        ),
        likes = Like(
            count = 121,
            userLikes = false,
            canLike = true,
            canPublish = false
        ),
        reposts = Repost(
            count = 1,
            userReposted = false
        ),
        views = View(count = 125),
        postType = "post",
        postSource = PostSource(
            type = "api",
            platform = "android",
            data = "z",
            url = "https://netology.ru"
        ),
        attachments = arrayOf(
            PhotoAttachment(
                photo = Photo(
                    id = 1,
                    albumId = 1,
                    ownerId = 1,
                    userId = 1,
                    text = "1",
                    date = 112345,
                    sizes = arrayOf(),
                    width = 1024,
                    height = 768
                )
            ),
            VideoAttachment(
                video = Video(
                    id = 1,
                    ownerId = 1,
                    title = "",
                    description = "Недоступно",
                    duration = 1234,
                    image = arrayOf(),
                    firstFrame = arrayOf(),
                    date = 1423434,
                    addingDate = 1234654,
                    views = 234,
                    localViews = 6,
                    comments = 23,
                    player= "flash",
                    platform = "https://netology.ru",
                    canAdd = true,
                    isPrivate = true,
                    accessKey = "https://netology.ru",
                    processing = true,
                    isFavorite = true,
                    canComment = true,
                    canEdit = true,
                    canLike = true,
                    canRepost = true,
                    canSubscribe = true,
                    canAddToFaves = true,
                    canAtachLink = true,
                    width = 1024,
                    height = 768,
                    userId = 456345,
                    converting = true,
                    added = true,
                    isSubscribed = true,
                    repeat = true,
                    type = "video",
                    balance = 0,
                    liveStatus = "waiting",
                    live = true,
                    upcoming = true,
                    spectators = 23
                )
            ),
            AudioAttachment(
                audio = Audio(
                    id = 1,
                    owner_id = 1,
                    artist = "No doubt",
                    title = "Don't speak",
                    duration = 1,
                    url = "https://netology.ru",
                    lyricsId = 1,
                    albumId = 1,
                    genreId = 1,
                    date = 1,
                    no_search = true,
                    isHq = true
                )
            ),
            PostedPhotoAttachment(
                postedPhoto = PostedPhoto(
                    id = 1,
                    ownerId = 1,
                    photo130 = "https://netology.ru",
                    photo604 = "https://netology.ru"
                )
            ),
            NoteAttachment(
                note = Note(
                    id = 1,
                    ownerId = 1,
                    title = "Недоступно",
                    text = "Недоступно",
                    date = 1654,
                    comments = 1,
                    readComments = 1,
                    viewUrl = "https://netology.ru"
                )
            )
        ),
        geo = Geo(
            type = "type",
            coordinates = "coordinates",
            place = null
        ),
        signerId = 435,
        copyHistory = null,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        donut = Donut(
            isDonut = false,
            paidDuration = 1234567890,
            placeholder = Placeholder(),
            canPublishFreeCopy = false,
            editMode = "duration"
        ),
        postponedId = 34563
    )

    val comment = Comment(
        id = 1231,
        fromId = 4342,
        postId = 33,
        date = 324567,
        text = "Привет",
        replyToUser = 3423,
        replyToComment = 1231,
        attachments = NoteAttachment(
            note = Note(
                id = 1,
                ownerId = 1,
                title = "Недоступно",
                text = "Недоступно",
                date = 1654,
                comments = 1,
                readComments = 1,
                viewUrl = "https://netology.ru"
            )
        ),
        parentsStack = null,
        thread = null
    )

    val wallService = WallService()
    wallService.add(post)
    wallService.add(post)
    wallService.add(post)
    wallService.update(post1)
    wallService.createComment(comment)
}