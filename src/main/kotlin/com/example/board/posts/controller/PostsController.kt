package com.example.board.posts.controller

import com.example.board.posts.model.WritePostParam
import com.example.board.posts.model.PostResponseVo
import com.example.board.posts.service.PostsService
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
class PostsController {

    @Autowired
    private lateinit var postsService: PostsService

    @GetMapping("")
    fun getPosts(): List<PostResponseVo> {
        return postsService.getPosts()
    }

    @GetMapping("/{postId}")
    fun getPost(@PathVariable("postId") postId: Long): PostResponseVo {
        return postsService.getPost(postId)
    }

    @PostMapping("")
    fun writePost(@RequestBody param: WritePostParam) {
        postsService.write(param)
    }

}
