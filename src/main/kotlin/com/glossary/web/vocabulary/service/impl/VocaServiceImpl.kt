package com.glossary.web.vocabulary.service.impl

import com.glossary.web.vocabulary.dao.VocaDao
import com.glossary.web.vocabulary.service.VocaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VocaServiceImpl
    @Autowired
    constructor(private val vocaDao: VocaDao) : VocaService {
    override fun inquireVoca() : List<Any> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        System.out.println("asfsafaesfseafsa")
        return vocaDao.inquireVoca()
    }

}
