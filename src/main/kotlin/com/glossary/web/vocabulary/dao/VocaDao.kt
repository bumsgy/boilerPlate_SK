package com.glossary.web.vocabulary.dao

import org.apache.ibatis.session.SqlSession
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository
import javax.lang.model.element.Element


@Repository("vocaDao")
class VocaDao
    @Autowired
//    @Qualifier("sqlSession")
    constructor(private val sqlSession: SqlSession
    ) {



    fun inquireVoca() : List<Any> {
        val retMap = mutableMapOf<String, Any?>()
        return sqlSession.selectList<Any>("test.selectTest", retMap)
//        sqlSession.selectList("aaa", retMap)
//        sqlSess

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
