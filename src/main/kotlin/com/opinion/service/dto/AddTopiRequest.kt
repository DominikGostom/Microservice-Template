package com.opinion.service.dto

data class AddTopiRequest(
    val topicName: String,
    val description: String,
    val options: List<String>
)
