package com.example.domain.repositories

import com.example.domain.common.Result
import com.example.domain.entities.Post

interface PostsRepository {
    suspend fun getPostsFromLocalFile() : Result<List<Post>>
}