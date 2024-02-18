package com.opinion.service.entity

import jakarta.persistence.*


@Entity
@Table(name = "controversial_topics")
data class ControversialTopicEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val description: String,

    @OneToMany(mappedBy = "controversialTopic")
    val options: List<OptionOfTopicEntity> = mutableListOf()
) {

    fun addOptionsOfTopics(list: List<String>): ControversialTopicEntity {
        return this.copy(options = list.map {
            OptionOfTopicEntity(
                topicOption = it,
                controversialTopic = this
            )
        })

    }
}