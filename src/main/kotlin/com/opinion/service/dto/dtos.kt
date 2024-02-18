package com.opinion.service.dto

data class ControversialTopicDTO(
    val id: Long,
    val name: String,
    val description: String,
    val options: List<OptionOfTopicDTO>
)
data class OptionOfTopicDTO(
    val optionId: Long,
    val topicOption: String
)