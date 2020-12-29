package IslandOfKnowledge

import org.junit.Test
import kotlin.test.assertEquals

class BoxBlurKtTest {
    @Test
    fun `Should return {{1}} for {{1, 1, 1}, {1, 7, 1}, {1, 1, 1}}`() {
        assertEquals(
            mutableListOf(mutableListOf(1)),
            mutableListOf(
                mutableListOf(1, 1, 1),
                mutableListOf(1, 7, 1),
                mutableListOf(1, 1, 1)
            )
        )
    }

    @Test
    fun `Should return {{28}} for {{0, 18, 9}, {27, 9, 0}, {81, 63, 45}}`() {
        assertEquals(
            mutableListOf(mutableListOf(28)),
            mutableListOf(
                mutableListOf(0, 18, 9),
                mutableListOf(27, 9, 0),
                mutableListOf(81, 63, 45)
            )
        )
    }

    @Test
    fun `Should return {{40, 30}} for {{36, 0, 18, 9}, {27, 54, 9, 0}, {81, 63, 72, 45}`() {
        assertEquals(
            mutableListOf(mutableListOf(40, 30)),
            mutableListOf(
                mutableListOf(36, 0, 18, 9),
                mutableListOf(27, 54, 9, 0),
                mutableListOf(81, 63, 72, 45)
            )
        )
    }

    @Test
    fun `Should return {{5, 4}, {4, 4}} for {{7,4,0,1}, {5,6,2,2}, {6,10,7,8}, {1,4,2,0}}`() {
        assertEquals(
            mutableListOf(
                mutableListOf(5, 4),
                mutableListOf(4, 4)
            ),
            mutableListOf(
                mutableListOf(7, 4, 0, 1),
                mutableListOf(5, 6, 2, 2),
                mutableListOf(6, 10, 7, 8),
                mutableListOf(1, 4, 2, 0)
            )
        )
    }
}