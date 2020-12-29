package IslandOfKnowledge

import org.junit.Assert.*
import org.junit.Test

class AreEquallyStrongKtTest {
    @Test
    fun `Should return true for 10, 15, 15, 10`() {
        assertEquals(
            true,
            areEquallyStrong(10, 15, 15, 10)
        )
    }

    @Test
    fun `Should return true for 15, 10, 15, 10`() {
        assertEquals(
            true,
            areEquallyStrong(15, 10, 15, 10)
        )
    }

    @Test
    fun `Should return false for 15, 10, 15, 9`() {
        assertEquals(
            false,
            areEquallyStrong(15, 10, 15, 9)
        )
    }

    @Test
    fun `Should return true for 10, 5, 5, 10`() {
        assertEquals(
            true,
            areEquallyStrong(10, 5, 5, 10)
        )
    }

    @Test
    fun `Should return false for 10, 15, 5, 20`() {
        assertEquals(
            false,
            areEquallyStrong(10, 15, 5, 20)
        )
    }
}