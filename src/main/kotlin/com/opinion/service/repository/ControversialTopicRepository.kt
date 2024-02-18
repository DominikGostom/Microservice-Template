package com.opinion.service.repository

import com.opinion.service.entity.ControversialTopicEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ControversialTopicRepository : JpaRepository<ControversialTopicEntity, Long>