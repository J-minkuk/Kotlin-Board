package com.example.board.domain

import org.springframework.data.repository.CrudRepository

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
interface PostRepository : CrudRepository<Post, Long> {
}