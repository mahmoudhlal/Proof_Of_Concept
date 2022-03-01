package com.example.domain.usecases

import com.example.domain.repositories.PostsRepository

class GetPostsFromLocalFileUseCase(private val postsRepository: PostsRepository){
    suspend operator fun invoke() = postsRepository.getPostsFromLocalFile()
}