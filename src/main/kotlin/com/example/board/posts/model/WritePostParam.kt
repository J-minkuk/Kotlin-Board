package com.example.board.posts.model

import com.example.board.posts.domain.Posts

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
data class WritePostParam(
    var title: String,
    var content: String,
    var author: String,
) {
    fun toEntity(): Posts {
        return Posts(
            title = title,
            content = content,
            author = author
        )
    }
}