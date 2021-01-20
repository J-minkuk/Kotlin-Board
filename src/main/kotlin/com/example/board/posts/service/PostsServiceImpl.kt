package com.example.board.posts.service

import com.example.board.posts.domain.PostsRepository
import com.example.board.posts.model.PostResponseVo
import com.example.board.posts.model.WritePostParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
@Service
class PostsServiceImpl : PostsService {

    @Autowired
    private lateinit var postsRepository: PostsRepository

    @Transactional(readOnly = true)
    override fun getPosts(): List<PostResponseVo> {
        return postsRepository.findAll().map { post -> PostResponseVo.from(post) }
    }

    @Transactional(readOnly = true)
    override fun getPost(postId: Long): PostResponseVo {
        return PostResponseVo.from(postsRepository.findById(postId).get())
    }

    @Transactional
    override fun write(param: WritePostParam) {
        postsRepository.save(param.toEntity())
    }

}