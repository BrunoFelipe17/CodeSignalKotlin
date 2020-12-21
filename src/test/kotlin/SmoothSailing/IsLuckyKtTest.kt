package SmoothSailing

import org.junit.Assert.*
import org.junit.Test

class IsLuckyKtTest {
    @Test
    fun `Should return true for 1230`() {
        assertEquals(true, isLucky(1230))
    }

    @Test
    fun `Should return false for 239017`() {
        assertEquals(false, isLucky(239017))
    }

    @Test
    fun `Should return true for 134008`() {
        assertEquals(true, isLucky(134008))
    }

    @Test
    fun `Should return false for 10`() {
        assertEquals(false, isLucky(10))
    }

    @Test
    fun `Should return true for 11`() {
        assertEquals(true, isLucky(11))
    }

    @Test
    fun `Should return true for 1010`() {
        assertEquals(true, isLucky(1010))
    }
}