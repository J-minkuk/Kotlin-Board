package com.example.board.service

import com.example.board.domain.PostRepository
import com.example.board.model.WritePostParam
import com.example.board.model.PostResponseVo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
@Service
class PostServiceImpl : PostService {

    @Autowired
    private lateinit var postRepository: PostRepository

    override fun getPosts(): List<PostResponseVo> {
        return postRepository.findAll().map { post -> post.toPostResponseVo() }
    }

    override fun write(param: WritePostParam) {
        postRepository.save(param.toPost())
    }

}