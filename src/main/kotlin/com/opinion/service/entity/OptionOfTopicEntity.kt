package com.opinion.service.entity

import jakarta.persistence.*


@Entity
@Table(name = "options_of_topic")
data class OptionOfTopicEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val optionId: Long = 0,
    val topicOption: String,

    @ManyToOne
    @JoinColumn(name = "controversial_topics_id", nullable = false)
    val controversialTopic: ControversialTopicEntity
)