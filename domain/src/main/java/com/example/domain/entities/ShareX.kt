package com.example.domain.entities

data class ShareX (
    val name: String,
    val thumbnail: String,
    val date: String,
    val content: String,
    val media: List<String>
)