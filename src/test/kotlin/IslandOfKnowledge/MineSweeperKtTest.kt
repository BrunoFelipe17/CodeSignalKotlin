package IslandOfKnowledge

import org.junit.Test
import kotlin.test.assertEquals

class MineSweeperKtTest {
    @Test
    fun `Should return {{1, 2, 1}, {2, 1, 1}, {1, 1, 1}}`() {
        assertEquals(
            mutableListOf(
                mutableListOf(1, 2, 1),
                mutableListOf(2, 1, 1),
                mutableListOf(1, 1, 1)
            ),
            mutableListOf(
                mutableListOf(true, false, false),
                mutableListOf(false, false, false),
                mutableListOf(false, false, false)
            )
        )
    }

    @Test
    fun `Should return {{0, 0, 0}, {0, 0, 0}}`() {
        assertEquals(
            mutableListOf(
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0)
            ),
            mutableListOf(
                mutableListOf(false, false, false),
                mutableListOf(false, false, false)
            )
        )
    }

    @Test
    fun `Should return {{0, 2, 2, 1}, {3, 4, 3, 3}, {1, 2, 3, 1}}`() {
        assertEquals(
            mutableListOf(
                mutableListOf(0, 2, 2, 1),
                mutableListOf(3, 4, 3, 3),
                mutableListOf(1, 2, 3, 1)
            ),
            mutableListOf(
                mutableListOf(true, false, false, true),
                mutableListOf(false, false, true, false),
                mutableListOf(true, true, false, true)
            )
        )
    }

    @Test
    fun `Should return {{3, 5, 3}, {5, 8, 5}, {3, 5, 3}}`() {
        assertEquals(
            mutableListOf(
                mutableListOf(3, 5, 3),
                mutableListOf(5, 8, 5),
                mutableListOf(3, 5, 3)
            ),
            mutableListOf(
                mutableListOf(true, true, true),
                mutableListOf(true, true, true),
                mutableListOf(true, true, true)
            )
        )
    }
}