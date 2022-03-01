package com.example.data.mappers

import com.example.data.file.PostsResponse
import com.example.domain.entities.Comment
import com.example.domain.entities.Post
import com.example.domain.entities.Share
import com.example.domain.entities.ShareX

class PostResponseMapper {
    fun toPostList(response: PostsResponse): List<Post> {
        return response.map {
            val share = if (it.share != null) Share(
                it.share.name,
                it.share.thumbnail,
                it.share.date,
                it.share.content,
                it.share.media,
                it.share.share?.let { it1 ->
                    ShareX(
                        it1.name,
                        it1.thumbnail,
                        it1.date,
                        it1.content,
                        it1.media
                    )
                }
            ) else null
            val comments = if (it.comments.isNullOrEmpty().not())
                it.comments?.map { item ->
                    Comment(item.name,item.avatar,item.comment,item.likesCount,item.date)
                } else null
            Post(
                it.id,
                it.name,
                it.avater,
                it.content,
                it.role,
                it.date,
                it.likescount,
                it.commentcount,
                it.sharescount,
                it.media,
                share,
                comments
            )
        }
    }
}