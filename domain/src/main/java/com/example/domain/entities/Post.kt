package com.example.domain.entities

data class Post(
   val id: String,
   val name: String,
   val avatar: String,
   val content: String,
   val role: String,
   val date: String,
   val likesCount: String,
   val commentCount: String,
   val sharesCount: String,
   val media: List<String>,
   val share: Share ,
   val comments:Comment
)