package com.example.board.posts.domain

import org.springframework.data.repository.Repository

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
interface PostsRepository : Repository<Posts, Long> {

    fun findAll(): List<Posts>?

    fun findById(postId: Long): Posts?

    fun save(post: Posts)

}