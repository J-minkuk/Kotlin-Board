package com.example.board.controller

import com.example.board.domain.Post
import com.example.board.domain.PostRepository
import com.example.board.model.WritePostParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
@RestController
@RequestMapping("posts")
class PostController {

    @Autowired
    private lateinit var postRepository: PostRepository

    @GetMapping("")
    fun getPosts(): Any {
        return postRepository.findAll()
    }

    @PostMapping("")
    fun writePost(@RequestBody param: WritePostParam) {
        postRepository.save(param.toPost())
    }

}