package com.glossary.web.comm.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory


open class BaseController {
//abstract class BaseController {
//    protected Logger logger
//    var log: Logger

    // TODO 로그를 여기서 쓰고 싶은데... 선언을 어찌 하지? 끄응...
    init {
//        logger = LoggerFactory
        System.out.println("aseasfsaf")
//        this.log = LoggerFactory.getLogger(this.javaClass)
    }

    var log: Logger = LoggerFactory.getLogger(this.javaClass)
//    protected Logger log = LoggerFactory.getLogger(this.getClass().getCanonicalName());

    fun aaa() {
        System.out.println("aaa")
    }
}
