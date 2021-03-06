package uk.q3c.kaytee.test

import spock.lang.Specification
import uk.q3c.kaytee.Calculator

/**
 * Created by David Sowerby on 21 Apr 2017
 */
class Functional extends Specification {

    Calculator calculator

    def setup() {
        calculator = new Calculator()
    }

    def "Add"() {

        expect:
        calculator.add(2, 3) == 5
    }

    def "subtract"() {
        expect:
        calculator.subtract(3, 2) == 1
    }

    def "multiply"() {
        expect:
        calculator.multiply(2, 2) == 4
    }
}
