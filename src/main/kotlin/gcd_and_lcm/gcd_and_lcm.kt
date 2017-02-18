package src.main.kotlin.gcd_and_lcm

import mu.KotlinLogging

val logger = KotlinLogging.logger {}

data class GcdAndLcm(val num1: Int, val num2: Int){
    init {
        logger.info { "Class GcdAndLcm with numbers $num1, $num2 has been created" }
    }

    private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    fun get_gcd(): Int = gcd(num1, num2)
    fun get_lcm(): Int = num1*num2/gcd(num1,num2)
}