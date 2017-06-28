package demo

import spock.lang.Specification

/**
 * Created by naresha on 28/06/17.
 */
class GreeterSpec extends Specification {

    def "greet should return Hello"() {
        given:
        Greeter greeter = new Greeter()

        when:
        def message = greeter.greet()

        then:
        message == "Hello"
    }
}
