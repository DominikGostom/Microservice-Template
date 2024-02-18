package com.opinion.service.controller

import com.opinion.service.dto.AddTopiRequest
import com.opinion.service.dto.ControversialTopicDTO
import com.opinion.service.service.ControversialTopicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class ControversialTopicController {
    @Autowired
    private lateinit var controversialTopicService: ControversialTopicService

    @GetMapping
    fun getAllTopicsWithOptions(): ResponseEntity<List<ControversialTopicDTO>> {
        val topics = controversialTopicService.getAllTopicsWithOptions()
        return ResponseEntity(topics, HttpStatus.OK)
    }


    @PostMapping
    fun addToFavouriteTopic(addTopiRequest: AddTopiRequest): ResponseEntity<ControversialTopicDTO> {
        return ResponseEntity.ok(
            controversialTopicService.addNewTopic(addTopiRequest)
        )
    }

}