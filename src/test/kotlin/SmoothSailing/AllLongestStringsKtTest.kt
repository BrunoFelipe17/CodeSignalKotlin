package SmoothSailing

import org.junit.Assert.*
import org.junit.Test

class AllLongestStringsKtTest {
    @Test
    fun `Should return 'aba', 'vcd', 'aba'`() {
        val input = mutableListOf("aba", "aa", "ad", "vcd", "aba")
        assertEquals(mutableListOf("aba", "vcd", "aba"), allLongestStrings(input))
    }

    @Test
    fun `Should return 'aa'`() {
        val input = mutableListOf("aa")
        assertEquals(mutableListOf("aa"), allLongestStrings(input))
    }

    @Test
    fun `Should return 'eeee', 'abcd'`() {
        val input = mutableListOf("abc", "eeee", "abcd", "dcd")
        assertEquals(mutableListOf("eeee", "abcd"), allLongestStrings(input))
    }

    @Test
    fun `Should return 'zzzzzz', 'abcdef', 'aaaaaa'`() {
        val input = mutableListOf("a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa")
        assertEquals(mutableListOf("zzzzzz", "abcdef", "aaaaaa"), allLongestStrings(input))
    }
}