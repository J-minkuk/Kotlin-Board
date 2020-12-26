package com.example.board.controller

import com.example.board.model.WritePostParam
import com.example.board.model.PostResponseVo
import com.example.board.service.PostService
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
    private lateinit var postService: PostService

    @GetMapping("")
    fun getPosts(): List<PostResponseVo> {
        return postService.getPosts()
    }

    @PostMapping("")
    fun writePost(@RequestBody param: WritePostParam) {
        postService.write(param)
    }

}
