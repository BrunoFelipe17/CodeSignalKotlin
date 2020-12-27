package ExploringTheWaters

import org.junit.Assert.*
import org.junit.Test

class AreSimilarKtTest {
    @Test
    fun `Should return true`() {
        assertEquals(
            true,
            areSimilar(mutableListOf(1, 2, 3), mutableListOf(1, 2, 3))
        )
    }

    @Test
    fun `Should return true (1)`() {
        assertEquals(
            true,
            areSimilar(mutableListOf(1, 2, 3), mutableListOf(2, 1, 3))
        )
    }

    @Test
    fun `Should return false`() {
        assertEquals(
            false,
            areSimilar(mutableListOf(1, 2, 2), mutableListOf(2, 1, 1))
        )
    }

    @Test
    fun `Should return false (1)`() {
        assertEquals(
            false,
            areSimilar(mutableListOf(1, 1, 4), mutableListOf(1, 2, 3))
        )
    }

    @Test
    fun `Should return false (2)`() {
        assertEquals(
            false,
            areSimilar(mutableListOf(1, 2, 3), mutableListOf(1, 10, 2))
        )
    }

    @Test
    fun `Should return true (2)`() {
        assertEquals(
            true,
            areSimilar(mutableListOf(2, 3, 1), mutableListOf(1, 3, 2))
        )
    }

    @Test
    fun `Should return false (3)`() {
        assertEquals(
            false,
            areSimilar(mutableListOf(2, 3, 9), mutableListOf(10, 3, 2))
        )
    }

    @Test
    fun `Should return false (4)`() {
        assertEquals(
            false,
            areSimilar(mutableListOf(4, 6, 3), mutableListOf(3, 4, 6))
        )
    }

    @Test
    fun `Should return true (3)`() {
        assertEquals(
            true,
            areSimilar(
                mutableListOf(832, 998, 148, 570, 533, 561, 894, 147, 455, 279),
                mutableListOf(832, 998, 148, 570, 533, 561, 455, 147, 894, 279))
        )
    }

    @Test
    fun `Should return false (5)`() {
        assertEquals(
            false,
            areSimilar(
                mutableListOf(832, 998, 148, 570, 533, 561, 894, 147, 455, 279),
                mutableListOf(832, 570, 148, 998, 533, 561, 455, 147, 894, 279))
        )
    }
}