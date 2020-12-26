package com.example.board.service

import com.example.board.model.WritePostParam
import com.example.board.model.PostResponseVo

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2020. 12. 26
 */
interface PostService {

    fun getPosts(): List<PostResponseVo>

    fun write(param: WritePostParam)

}