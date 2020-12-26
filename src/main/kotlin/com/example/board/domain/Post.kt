package com.example.board.domain

import com.example.board.model.PostResponseVo
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
@Entity
data class Post(
    var title: String,
    var author: String,
    var content: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    fun toPostResponseVo(): PostResponseVo {
        return PostResponseVo(this.title, this.content, this.author)
    }
}