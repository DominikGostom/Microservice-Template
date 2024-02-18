package com.opinion.service.service

import com.opinion.service.dto.AddTopiRequest
import com.opinion.service.dto.ControversialTopicDTO
import com.opinion.service.entity.ControversialTopicEntity
import com.opinion.service.mapper.toDTO
import com.opinion.service.repository.ControversialTopicRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ControversialTopicService(
    private val controversialTopicRepository: ControversialTopicRepository
) {
    @Transactional
    fun addNewTopic(addTopicRequest: AddTopiRequest): ControversialTopicDTO {
        return controversialTopicRepository.save(
            ControversialTopicEntity(
                name = addTopicRequest.topicName,
                description = addTopicRequest.description
            ).addOptionsOfTopics(
                addTopicRequest.options
            )
        ).toDTO()
    }

    @Transactional(readOnly = true)
    fun getAllTopicsWithOptions(): List<ControversialTopicDTO> {
        return controversialTopicRepository.findAll().map { topic ->
            topic.toDTO()
        }
    }
}
