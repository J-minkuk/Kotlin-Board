package com.example.board.posts.domain

import org.springframework.data.repository.CrudRepository

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
interface PostsRepository : CrudRepository<Posts, Long> {
}