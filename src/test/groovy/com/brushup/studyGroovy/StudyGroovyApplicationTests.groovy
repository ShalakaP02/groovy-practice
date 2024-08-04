package com.brushup.studyGroovy

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class StudyGroovyApplicationTests extends Specification {

	@Autowired
	ApplicationContext applicationContext

	def "application context loads without errors"() {
		expect:
		applicationContext != null
	}
}
