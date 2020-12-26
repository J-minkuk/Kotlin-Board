package com.example.board.model

import com.example.board.domain.Post

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
    fun toPost(): Post {
        return Post(
            title = title,
            content = content,
            author = author
        )
    }
}