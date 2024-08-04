package com.brushup.studyGroovy

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class WelcomeController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class)

    @GetMapping("/welcome")
    String sayWelcome() {
        def x = 5
        log.info("I am inside welcome method {} ",x);
        return "Hello, Say Welcome!"
    }
}
