package com.example.data.file

class PostsResponse : ArrayList<PostsResponseItem>()


data class PostsResponseItem(
    val avater: String,
    val commentcount: String,
    val comments: List<Any>,
    val content: String,
    val date: String,
    val id: String,
    val likescount: String,
    val media: List<Any>,
    val name: String,
    val role: String,
    val share: Share,
    val sharescount: String
)
data class Share(
    val content: String,
    val date: String,
    val name: String,
    val share: ShareX,
    val thumbnail: String
)

data class ShareX(
    val content: String,
    val media: List<String>,
    val name: String,
    val thumbnail: String
)