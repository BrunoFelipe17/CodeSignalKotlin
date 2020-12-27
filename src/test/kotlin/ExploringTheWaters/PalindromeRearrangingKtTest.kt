package ExploringTheWaters

import org.junit.Assert.*
import org.junit.Test

class PalindromeRearrangingKtTest {
    @Test
    fun `Should return true for "aabb"`() {
        assertEquals(
            true,
            palindromeRearranging("aabb")
        )
    }

    @Test
    fun `Should return false for "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"`() {
        assertEquals(
            false,
            palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc")
        )
    }

    @Test
    fun `Should return true for "abbcabb"`() {
        assertEquals(
            true,
            palindromeRearranging("abbcabb")
        )
    }

    @Test
    fun `Should return true for "zyyzzzzz"`() {
        assertEquals(
            true,
            palindromeRearranging("zyyzzzzz")
        )
    }

    @Test
    fun `Should return true for "z"`() {
        assertEquals(
            true,
            palindromeRearranging("z")
        )
    }
}