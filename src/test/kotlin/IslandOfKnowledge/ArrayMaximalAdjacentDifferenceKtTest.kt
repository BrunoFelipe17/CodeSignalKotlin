package IslandOfKnowledge

import org.junit.Assert.*
import org.junit.Test

class ArrayMaximalAdjacentDifferenceKtTest {
    @Test
    fun `Should return 3 for {2, 4, 1, 0}`() {
        assertEquals(
            3,
            arrayMaximalAdjacentDifference(mutableListOf(2, 4, 1, 0))
        )
    }

    @Test
    fun `Should return 0 for {1, 1, 1, 1}`() {
        assertEquals(
            0,
            arrayMaximalAdjacentDifference(mutableListOf(1, 1, 1, 1))
        )
    }

    @Test
    fun `Should return 7 for {-1, 4, 10, 3, -2}`() {
        assertEquals(
            7,
            arrayMaximalAdjacentDifference(mutableListOf(-1, 4, 10, 3, -2))
        )
    }

    @Test
    fun `Should return 2 for {10, 11, 13}`() {
        assertEquals(
            2,
            arrayMaximalAdjacentDifference(mutableListOf(10, 11, 13))
        )
    }

    @Test
    fun `Should return -2 for {-2, -2, -2, -2, -2}`() {
        assertEquals(
            -2,
            arrayMaximalAdjacentDifference(mutableListOf(-2, -2, -2, -2, -2))
        )
    }
}