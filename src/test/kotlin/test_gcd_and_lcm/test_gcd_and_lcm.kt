package test_gcd_and_lcm

import src.main.kotlin.gcd_and_lcm.GcdAndLcm
import io.kotlintest.specs.StringSpec

class TestGcdAndLcm{
    fun test_get_gcd(): Unit {
        val numbers = GcdAndLcm(100,25)
        assert(numbers.get_gcd() == 25)
    }

    fun test_get_lcm(): Unit {
        val numbers = GcdAndLcm(100,25)
        assert(numbers.get_lcm() == 100)
    }
}


class StringSpecExample : StringSpec() {
    init {
        "should add" {
            val myTable = table(
                    headers("a", "b", "result"),
                    row(1, 2, 3),
                    row(1, 1, 2)
            )
            forAll(myTable) { a, b, result ->
                a + b shouldBe result
            }
        }
    }
}