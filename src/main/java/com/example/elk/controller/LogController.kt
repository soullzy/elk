package com.example.elk.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Li Zhengyue
 * @date 2019/3/23
 * @since JDK1.8
 */
@RestController
class LogController {

  @GetMapping("test")
  fun test1() {
    logger.info("initial log to elk")
  }

  @GetMapping("kafka")
  fun test2() {
    logger.info("used kafka collect log to elk")
  }

  private val logger: Logger = LoggerFactory.getLogger(LogController::class.java)
}