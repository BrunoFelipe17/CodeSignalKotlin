package TheJourneyBegins

import org.junit.Assert.*
import org.junit.Test

class CheckPalindromeKtTest {

    @Test
    fun `should return true for 'aabaa'`() {
        assertEquals(true, checkPalindrome("aabaa"))
    }

    @Test
    fun `should return false for 'aabaa'`() {
        assertEquals(false, checkPalindrome("abac"))
    }

    @Test
    fun `should return true for 'a'`() {
        assertEquals(true, checkPalindrome("a"))
    }

    @Test
    fun `should return true for 'abacaba'`() {
        assertEquals(true, checkPalindrome("abacaba"))
    }

    @Test
    fun `should return true for 'z'`() {
        assertEquals(true, checkPalindrome("z"))
    }

    @Test
    fun `should return false for 'aaabaaaa'`() {
        assertEquals(false, checkPalindrome("aaabaaaa"))
    }

    @Test
    fun `should return false for 'zzzazzazz'`() {
        assertEquals(false, checkPalindrome("zzzazzazz"))
    }

    @Test
    fun `should return true for 'hlbeeykoqqqqokyeeblh'`() {
        assertEquals(true, checkPalindrome("hlbeeykoqqqqokyeeblh"))
    }

    @Test
    fun `should return true for 'hlbeeykoqqqokyeeblh'`() {
        assertEquals(true, checkPalindrome("hlbeeykoqqqokyeeblh"))
    }
}