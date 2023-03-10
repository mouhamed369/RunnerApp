package com.example.runner.model

data class Article(
    val id: Int? = null,
    val title: String? = null,
    val link: String? = null,
    val pubDate: String? = null,
    val image: String? = null,
    val content: String? = null,
    val tags: List<String>? = null
)