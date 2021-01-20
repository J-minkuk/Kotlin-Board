package com.example.board.posts.service

import com.example.board.posts.model.WritePostParam
import com.example.board.posts.model.PostResponseVo

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
interface PostsService {

    fun getPosts(): List<PostResponseVo>

    fun getPost(postId: Long): PostResponseVo

    fun write(param: WritePostParam)

}