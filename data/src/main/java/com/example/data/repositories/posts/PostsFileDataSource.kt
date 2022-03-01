package com.example.data.repositories.posts

import com.example.domain.common.Result
import com.example.domain.entities.Post

interface PostsFileDataSource {
    suspend fun getPosts(): Result<List<Post>>
}