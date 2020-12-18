package TheJourneyBegins

import org.junit.Test

import org.junit.Assert.*

class AddKtTest {

    @Test
    fun `Adding 1 and 2 should return 3`() {
        assertEquals(3, add(1, 2))
    }

    @Test
    fun `Adding 0 and 1000 should return 1000`() {
        assertEquals(1000, add(0, 1000) )
    }

    @Test
    fun `Adding 2 and -39 should return 37`() {
        assertEquals(-37, add(2, -39))
    }

    @Test
    fun `Adding -100 and 100 should return 100`() {
        assertEquals(0, add(-100, 100))
    }
}