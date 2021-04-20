package ru.netology.service

import ru.netology.data.*

class PostNotFoundException(message: String) : RuntimeException(message)
class InvalidReasonException(message: String) : RuntimeException(message)
class CommentNotFoundException(message: String) : RuntimeException(message)

class  WallService() {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reportComments = emptyArray<ReportComment>()

    fun add(post: Post): Post {
        posts += if(posts.isEmpty()) post.copy(id = 1) else post.copy(id = posts.last().id + 1)
        return posts.last()
    }

    fun update(post: Post) : Boolean {
        for(i in posts.indices){
            if(posts[i].id == post.id){
                posts[i] = post.copy(id = posts[i].id, ownerId = posts[i].ownerId)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        var isAdded = false
        for(i in posts.indices) {
            if(posts[i].id == comment.postId) {
                comments += comment
                isAdded = true
            }
        }
        if(!isAdded) throw PostNotFoundException("no post with id ${comment.postId}")
    }

    fun reportComment(comment: Comment, reason: Int) : Boolean{
        for(i in comments.indices){
            if(comments[i].id == comment.id){
                if(reason in 0..8) {
                    reportComments += ReportComment(comment.id, comment.fromId, reason)
                    return true
                }
                else throw InvalidReasonException("no reason $reason")
            }
            else throw CommentNotFoundException("no comment with id ${comment.id}")
        }
        return false
    }
}
