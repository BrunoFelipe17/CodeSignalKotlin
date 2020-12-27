package ExploringTheWaters

import org.junit.Assert.*
import org.junit.Test

class AlternatingSumsKtTest {
    @Test
    fun `Should return {180, 105} for {50, 60, 60, 45, 70}`() {
        assertEquals(
            mutableListOf(180, 105),
            alternatingSums(mutableListOf(50, 60, 60, 45, 70))
        )
    }

    @Test
    fun `Should return {100, 50} for {100, 50}`() {
        assertEquals(
            mutableListOf(100, 50),
            alternatingSums(mutableListOf(100, 50))
        )
    }

    @Test
    fun `Should return {80, 0} for {80}`() {
        assertEquals(
            mutableListOf(80, 0),
            alternatingSums(mutableListOf(80))
        )
    }

    @Test
    fun `Should return {150, 150} for {100, 50, 50, 100}`() {
        assertEquals(
            mutableListOf(150, 150),
            alternatingSums(mutableListOf(100, 50, 50, 100))
        )
    }

    @Test
    fun `Should return {150, 151} for {100, 51, 50, 100}`() {
        assertEquals(
            mutableListOf(150, 151),
            alternatingSums(mutableListOf(100, 51, 50, 100))
        )
    }
}