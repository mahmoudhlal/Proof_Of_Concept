package com.example.data.file

class PostsResponse : ArrayList<PostsResponseItem>()


data class PostsResponseItem(
    val avater: String,
    val commentcount: String,
    val comments: List<Comment>?,
    val content: String,
    val date: String,
    val id: String,
    val likescount: String,
    val media: List<String>,
    val name: String,
    val role: String,
    val share: Share?,
    val sharescount: String
)
data class Share(
    val content: String,
    val date: String,
    val name: String,
    val share: Share?,
    val thumbnail: String,
    val media: List<String>
)
data class Comment(
    val name: String,
    val avatar: String,
    val comment : String,
    val likesCount: String,
    val date : String
)
