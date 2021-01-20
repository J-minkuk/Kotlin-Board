package com.example.board.posts.model

import com.example.board.posts.domain.Posts

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
data class PostResponseVo(
    var id: Long,
    var title: String,
    var content: String,
    var author: String
) {
    companion object {
        fun from(post: Posts): PostResponseVo {
            return PostResponseVo(post.id, post.title, post.content, post.author)
        }
    }
}