package com.example.board.posts.domain

import javax.persistence.*

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
@Entity
data class Posts(
    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var author: String,

    @Column(columnDefinition = "TEXT", nullable = false)
    var content: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
)