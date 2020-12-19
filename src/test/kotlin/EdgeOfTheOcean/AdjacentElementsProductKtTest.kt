package EdgeOfTheOcean

import org.junit.Assert.*
import org.junit.Test

class AdjacentElementsProductKtTest {

    @Test
    fun `For mutableListOf(3, 6, -2, -5, 7, 3) should return 21`() {
        assertEquals(21, adjacentElementsProduct(mutableListOf(3, 6, -2, -5, 7, 3)))
    }

    @Test
    fun `For mutableListOf(-1, -2) should return 2`() {
        assertEquals(2, adjacentElementsProduct(mutableListOf(-1, -2)))
    }

    @Test
    fun `For mutableListOf(5, 1, 2, 3, 1, 4) should return 6`() {
        assertEquals(6, adjacentElementsProduct(mutableListOf(5, 1, 2, 3, 1, 4)))
    }

    @Test
    fun `For mutableListOf(1, 2, 3, 0) should return 6`() {
        assertEquals(6, adjacentElementsProduct(mutableListOf(1, 2, 3, 0)))
    }

    @Test
    fun `For mutableListOf(9, 5, 10, 2, 24, -1, -48) should return 50`() {
        assertEquals(50, adjacentElementsProduct(mutableListOf(9, 5, 10, 2, 24, -1, -48)))
    }

    @Test
    fun `For mutableListOf(5, 6, -4, 2, 3, 2, -23) should return 30`() {
        assertEquals(30, adjacentElementsProduct(mutableListOf(5, 6, -4, 2, 3, 2, -23)))
    }

    @Test
    fun `For mutableListOf(4, 1, 2, 3, 1, 5) should return 6`() {
        assertEquals(6, adjacentElementsProduct(mutableListOf(4, 1, 2, 3, 1, 5)))
    }

    @Test
    fun `For mutableListOf(-23, 4, -3, 8, -12) should return -12`() {
        assertEquals(-12, adjacentElementsProduct(mutableListOf(-23, 4, -3, 8, -12)))
    }

    @Test
    fun `For mutableListOf(1, 0, 1, 0, 1000) should return 0`() {
        assertEquals(0, adjacentElementsProduct(mutableListOf(1, 0, 1, 0, 1000)))
    }
}