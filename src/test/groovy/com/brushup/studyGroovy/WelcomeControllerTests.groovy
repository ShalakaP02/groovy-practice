package com.brushup.studyGroovy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test") // Optional: Use a specific profile for testing
class WelcomeControllerTests extends Specification{

    @LocalServerPort
    private int port

    @Autowired
    private RestTemplate restTemplate

    def "when get is performed then the response has status 200 and content is 'Hello, Welcome!'"() {
        setup:
        String url = "http://localhost:$port/api/welcome"
        println "Testing URL: $url"

        when:
        def response = restTemplate.getForEntity(url, String)

        then:
        response.statusCodeValue == 200
        response.body == "Hello, Say Welcome!"
    }

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 2

        when:
        int result = left + right

        then:
        result == 4
    }

}
