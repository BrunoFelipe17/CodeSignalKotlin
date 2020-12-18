package TheJourneyBegins

import org.junit.Test
import org.junit.Assert.*

class CenturyFromYearKtTest {

    @Test
    fun `Should return 20 for 1905`() {
        assertEquals(20, centuryFromYear(1905))
    }

    @Test
    fun `Should return 17 for 1700`() {
        assertEquals(17, centuryFromYear(1700))
    }

    @Test
    fun `Should return 20 for 1988`() {
        assertEquals(20, centuryFromYear(1988))
    }

    @Test
    fun `Should return 20 for 2000`() {
        assertEquals(20, centuryFromYear(2000))
    }

    @Test
    fun `Should return 21 for 2001`() {
        assertEquals(21, centuryFromYear(2001))
    }

    @Test
    fun `Should return 2 for 200`() {
        assertEquals(2, centuryFromYear(200))
    }

    @Test
    fun `Should return 4 for 374`() {
        assertEquals(4, centuryFromYear(374))
    }

    @Test
    fun `Should return 1 for 45`() {
        assertEquals(1, centuryFromYear(45))
    }

    @Test
    fun `Should return 1 for 8`() {
        assertEquals(1, centuryFromYear(8))
    }
}