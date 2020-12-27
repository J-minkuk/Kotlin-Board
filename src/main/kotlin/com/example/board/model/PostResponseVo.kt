package com.example.board.model

import com.example.board.domain.Post

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
data class PostResponseVo(
    var title: String,
    var content: String,
    var author: String
) {
    companion object {
        fun from(post: Post): PostResponseVo {
            return PostResponseVo(post.title, post.content, post.author)
        }
    }
}