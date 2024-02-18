package com.opinion.service.mapper

import com.opinion.service.dto.ControversialTopicDTO
import com.opinion.service.dto.OptionOfTopicDTO
import com.opinion.service.entity.ControversialTopicEntity
import com.opinion.service.entity.OptionOfTopicEntity


fun ControversialTopicEntity.toDTO()  : ControversialTopicDTO{
    return ControversialTopicDTO(
        id = this.id,
        name = this.name,
        description = this.description,
        options = this.options.map { it.toDTO() }
    )
}

fun OptionOfTopicEntity.toDTO(): OptionOfTopicDTO {
    return OptionOfTopicDTO(
        optionId = this.optionId,
        topicOption = this.topicOption
    )
}