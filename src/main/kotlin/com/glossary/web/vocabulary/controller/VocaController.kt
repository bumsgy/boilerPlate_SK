package com.glossary.web.vocabulary.controller

import com.glossary.web.comm.controller.BaseController
import com.glossary.web.vocabulary.service.VocaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

//@RestController
@Controller
class VocaController
    @Autowired
    constructor(private val vocaService: VocaService): BaseController() {
//    companion object () {}

//    @GetMapping(value=["/test/{qSeq}"])
//    @GetMapping(value=["/test"])
    @Throws(Exception :: class)
    @RequestMapping(value=["/test"])
    @ResponseBody
    fun test(
//        @PathVariable qSeq:String
                ) : MutableMap<String, Any?>{
        val retMap = mutableMapOf<String, Any?>()
        log.debug("adsfdsaF")
    System.out.println("aAAAAAAAAAAA")
        var vocaList: List<Any> = vocaService.inquireVoca()

        return retMap
    }
}