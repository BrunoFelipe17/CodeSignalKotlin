package EdgeOfTheOcean

import org.junit.Assert.*
import org.junit.Test

class MatrixElementsSumKtTest {

    @Test
    fun `should return 9`() {
        val matrix = mutableListOf(mutableListOf(0, 1, 1, 2), mutableListOf(0, 5, 0, 0), mutableListOf(2, 0, 3, 3))
        assertEquals(9, matrixElementsSum(matrix))
    }

    @Test
    fun `should return 9 too`() {
        val matrix = mutableListOf(mutableListOf(1, 1, 1, 0), mutableListOf(0, 5, 0, 1), mutableListOf(2, 1, 3, 10))
        assertEquals(9, matrixElementsSum(matrix))
    }

    @Test
    fun `should return 18`() {
        val matrix = mutableListOf(mutableListOf(1, 1, 1), mutableListOf(2, 2, 2), mutableListOf(3, 3, 3))
        assertEquals(18, matrixElementsSum(matrix))
    }

    @Test
    fun `should return 0`() {
        val matrix = mutableListOf(mutableListOf(0))
        assertEquals(0, matrixElementsSum(matrix))
    }
}