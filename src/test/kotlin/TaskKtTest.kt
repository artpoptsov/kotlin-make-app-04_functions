import org.junit.Test

import org.junit.Assert.*

class TaskKtTest {

//    @Test
//    fun main() {
//    }

    @Test
    fun `commission with card Maestro and commission zero`() {
        // arrange
        val card = "Maestro"
        val last = 10_000_00
        val current = 10_000_00

        // act
        val result = commission(
            cardType = card,
            lastAmount = last,
            currentAmount = current
        )

        // assert
        assertEquals(0, result)
    }

    @Test
    fun `commission with card MasterCard and upper 75_000_00`() {
        // arrange
        val card = "Mastercard"
        val last = 100_000_00
        val current = 10_000_00

        // act
        val result = commission(
            cardType = card,
            lastAmount = last,
            currentAmount = current
        )

        // assert
        assertEquals(8000, result)
    }
    @Test
    fun `commission zero with card Vk Pay`() {
        // arrange
        val card = "Vk Pay"
        val last = 100_000_00
        val current = 10_000_00

        // act
        val result = commission(
            cardType = card,
            lastAmount = last,
            currentAmount = current
        )

        // assert
        assertEquals(0, result)
    }
    @Test
    fun `commission card Visa and commission upper 35 rub`() {
        // arrange
        val card = "Visa"
        val last = 100_000_00
        val current = 10_000_00

        // act
        val result = commission(
            cardType = card,
            lastAmount = last,
            currentAmount = current
        )

        // assert
        assertEquals(7500, result)
    }
    @Test
    fun `commission card Visa and commission under 35 rub`() {
        // arrange
        val card = "Visa"
        val last = 100_000_00
        val current = 1_000_00

        // act
        val result = commission(
            cardType = card,
            lastAmount = last,
            currentAmount = current
        )

        // assert
        assertEquals(35, result)
    }
}