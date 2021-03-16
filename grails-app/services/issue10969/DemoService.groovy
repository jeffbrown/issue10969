package issue10969

import groovy.util.logging.Slf4j

// https://github.com/grails/grails-core/issues/10969
//
// Adding the @Slf4j annotation allows the code to compile.
//
//@Slf4j
class DemoService {

    static void someMethod() {
        log.error 'This is an error message'
    }
}
