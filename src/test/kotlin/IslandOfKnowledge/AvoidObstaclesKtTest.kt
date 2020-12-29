package IslandOfKnowledge

import org.junit.Assert.*
import org.junit.Test

class AvoidObstaclesKtTest {
    @Test
    fun `Should return 4 for {5, 3, 6, 7, 9}`() {
        assertEquals(
            4,
            avoidObstacles(mutableListOf(5, 3, 6, 7, 9))
        )
    }

    @Test
    fun `Should return 4 for {2, 3}`() {
        assertEquals(
            4,
            avoidObstacles(mutableListOf(2, 3))
        )
    }

    @Test
    fun `Should return 7 for {1, 4, 10, 6, 2}`() {
        assertEquals(
            7,
            avoidObstacles(mutableListOf(1, 4, 10, 6, 2))
        )
    }

    @Test
    fun `Should return 6 for {1000, 999}`() {
        assertEquals(
            6,
            avoidObstacles(mutableListOf(1000, 999))
        )
    }

    @Test
    fun `Should return 3 for {19, 32, 11, 23}`() {
        assertEquals(
            3,
            avoidObstacles(mutableListOf(19, 32, 11, 23))
        )
    }

    @Test
    fun `Should return 6 for {5, 8, 9, 13, 14}`() {
        assertEquals(
            6,
            avoidObstacles(mutableListOf(5, 8, 9, 13, 14))
        )
    }
}