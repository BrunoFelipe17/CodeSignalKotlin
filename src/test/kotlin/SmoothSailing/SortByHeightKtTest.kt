package SmoothSailing

import org.junit.Assert.*
import org.junit.Test

class SortByHeightKtTest {
    @Test
    fun `Should return {-1, 150, 160, 170, -1, -1, 180, 190}`() {
        assertEquals(
            mutableListOf(-1, 150, 160, 170, -1, -1, 180, 190),
            sortByHeight(mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)))
    }

    @Test
    fun `Should return {-1, -1, -1, -1, -1}`() {
        assertEquals(
            mutableListOf(-1, -1, -1, -1, -1),
            sortByHeight(mutableListOf(-1, -1, -1, -1, -1)))
    }

    @Test
    fun `Should return {-1}`() {
        assertEquals(
            mutableListOf(-1),
            sortByHeight(mutableListOf(-1)))
    }

    @Test
    fun `Should return {2, 2, 4, 9, 11, 16}`() {
        assertEquals(
            mutableListOf(2, 2, 4, 9, 11, 16),
            sortByHeight(mutableListOf(4, 2, 9, 11, 2, 16)))
    }
}