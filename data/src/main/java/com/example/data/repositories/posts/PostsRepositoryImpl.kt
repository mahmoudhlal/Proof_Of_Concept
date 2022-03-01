package com.example.data.repositories.posts

import com.example.domain.repositories.PostsRepository

class PostsRepositoryImpl(private val postsFileDataSource: PostsFileDataSource):PostsRepository {
    override suspend fun getPostsFromLocalFile() = postsFileDataSource.getPosts()
}