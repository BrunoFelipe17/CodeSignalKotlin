package EdgeOfTheOcean

import org.junit.Assert.*
import org.junit.Test

class AlmostIncreasingSequenceKtTest {

    @Test
    fun `Should return false for mutableListOf(1, 3, 2, 1)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 3, 2, 1)))
    }

    @Test
    fun `Should return true for mutableListOf(1, 3, 2)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(1, 3, 2)))
    }

    @Test
    fun `Should return false for mutableListOf(1, 2, 1, 2)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 2, 1, 2)))
    }

    @Test
    fun `Should return false for mutableListOf(3, 6, 5, 8, 10, 20, 15)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(3, 6, 5, 8, 10, 20, 15)))
    }

    @Test
    fun `Should return false for mutableListOf(1, 1, 2, 3, 4, 4)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 1, 2, 3, 4, 4)))
    }

    @Test
    fun `Should return false for mutableListOf(1, 4, 10, 4, 2)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 4, 10, 4, 2)))
    }

    @Test
    fun `Should return true for mutableListOf(10, 1, 2, 3, 4, 5)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(10, 1, 2, 3, 4, 5)))
    }

    @Test
    fun `Should return false for mutableListOf(1, 1, 1, 2, 3)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 1, 1, 2, 3)))
    }

    @Test
    fun `Should return true for mutableListOf(0, -2, 5, 6)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(0, -2, 5, 6)))
    }

    @Test
    fun `Should return false for mutableListOf(1, 2, 3, 4, 5, 3, 5, 6)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 2, 3, 4, 5, 3, 5, 6)))
    }

    @Test
    fun `Should return false for mutableListOf(40, 50, 60, 10, 20, 30)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(40, 50, 60, 10, 20, 30)))
    }

    @Test
    fun `Should return true for mutableListOf(1, 1)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(1, 1)))
    }

    @Test
    fun `Should return true for mutableListOf(1, 2, 5, 3, 5)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(1, 2, 5, 3, 5)))
    }

    @Test
    fun `Should return false for mutableListOf(1, 2, 5, 5, 5)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(1, 2, 5, 5, 5)))
    }

    @Test
    fun `Should return false for mutableListOf(10, 1, 2, 3, 4, 5, 6, 1)`() {
        assertEquals(false, almostIncreasingSequence(mutableListOf(10, 1, 2, 3, 4, 5, 6, 1)))
    }

    @Test
    fun `Should return true for mutableListOf(1, 2, 3, 4, 3, 6)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(1, 2, 3, 4, 3, 6)))
    }

    @Test
    fun `Should return true for mutableListOf(1, 2, 3, 4, 99, 5, 6)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(1, 2, 3, 4, 99, 5, 6)))
    }

    @Test
    fun `Should return true for mutableListOf(123, -17, -5, 1, 2, 3, 12, 43, 45)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(123, -17, -5, 1, 2, 3, 12, 43, 45)))
    }

    @Test
    fun `Should return true for mutableListOf(3, 5, 67, 98, 3)`() {
        assertEquals(true, almostIncreasingSequence(mutableListOf(3, 5, 67, 98, 3)))
    }
}