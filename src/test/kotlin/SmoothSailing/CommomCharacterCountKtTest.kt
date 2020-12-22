package SmoothSailing

import org.junit.Assert.*
import org.junit.Test

class CommomCharacterCountKtTest {

    @Test
    fun `Should return 3 'aabcc', 'adcaa'`() {
        assertEquals(3, commonCharacterCount("aabcc", "adcaa"))
    }

    @Test
    fun `Should return 4 for 'zzzz' and 'zzzzzzz'`() {
        assertEquals(4, commonCharacterCount("zzzz", "zzzzzzz"))
    }

    @Test
    fun `Should return 3 for 'abca' and 'xyzbac'`() {
        assertEquals(3, commonCharacterCount("abca", "xyzbac"))
    }

    @Test
    fun `Should return 0 for 'a' and 'b'`() {
        assertEquals(0, commonCharacterCount("a", "b"))
    }

    @Test
    fun `Should return 1 for 'a' and 'aaa'`() {
        assertEquals(1, commonCharacterCount("a", "aaa"))
    }
}