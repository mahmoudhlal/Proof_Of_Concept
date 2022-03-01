package com.example.data.repositories.posts

import com.example.data.file.FileReader
import com.example.data.file.PostsResponse
import com.example.data.mappers.PostResponseMapper
import com.example.domain.common.Result
import com.example.domain.entities.Post
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class PostsFileDataSourceImpl(private val reader:FileReader,
                              private val mapper: PostResponseMapper,
                              private val coroutineScope: CoroutineDispatcher = Dispatchers.IO)
                             :PostsFileDataSource {
    override suspend fun getPosts(): Result<List<Post>> =
        withContext(coroutineScope){
            try {
                val responseType = object : TypeToken<PostsResponse>() {}.type
                val response = reader.getAs<PostsResponse>("data.json" , responseType)
                if (response != null){
                    return@withContext Result.Success(mapper.toPostList(response))
                } else {
                    return@withContext Result.Error("Data Not Found!")
                }
            }catch (ex : IOException){
                return@withContext Result.Error(ex.localizedMessage ?: "Nothing")
            }
        }

}