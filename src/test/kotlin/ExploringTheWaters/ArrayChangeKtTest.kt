package ExploringTheWaters

import org.junit.Assert.*
import org.junit.Test

class ArrayChangeKtTest {
    @Test
    fun `Should return 3 for {1, 1, 1}`() {
        assertEquals(
            3,
            arrayChange(mutableListOf(1, 1, 1))
        )
    }

    @Test
    fun `Should return 5 for {-1000, 0, -2, 0}`() {
        assertEquals(
            5,
            arrayChange(mutableListOf(-1000, 0, -2, 0))
        )
    }

    @Test
    fun `Should return 12 for {2, 1, 10, 1}`() {
        assertEquals(
            12,
            arrayChange(mutableListOf(2, 1, 10, 1))
        )
    }

    @Test
    fun `Should return 13 for {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15}`() {
        assertEquals(
            13,
            arrayChange(mutableListOf(2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15))
        )
    }

    @Test
    fun `Should return 25559 for {3122, -645, 2616, 13213, -8069}`() {
        assertEquals(
            25559,
            arrayChange(mutableListOf(3122, -645, 2616, 13213, -8069))
        )
    }
}