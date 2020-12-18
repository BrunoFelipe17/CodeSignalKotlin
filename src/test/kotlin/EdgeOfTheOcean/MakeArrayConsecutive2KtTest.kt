package EdgeOfTheOcean

import org.junit.Assert.*
import org.junit.Test

class MakeArrayConsecutive2KtTest {

    @Test
    fun `Should return 3 for mutableListOf(6, 2, 3, 8)`() {
        assertEquals(3, makeArrayConsecutive2(mutableListOf(6, 2, 3, 8)))
    }

    @Test
    fun `Should return 2 for mutableListOf(0, 3)`() {
        assertEquals(2, makeArrayConsecutive2(mutableListOf(0, 3)))
    }

    @Test
    fun `Should return 0 for mutableListOf(5, 4, 6)`() {
        assertEquals(0, makeArrayConsecutive2(mutableListOf(5, 4, 6)))
    }

    @Test
    fun `Should return 2 for mutableListOf(6, 3)`() {
        assertEquals(2, makeArrayConsecutive2(mutableListOf(6, 3)))
    }

    @Test
    fun `Should return 0 for mutableListOf(1)`() {
        assertEquals(0, makeArrayConsecutive2(mutableListOf(1)))
    }
}