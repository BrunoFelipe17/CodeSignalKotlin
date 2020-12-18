package EdgeOfTheOcean

import org.junit.Assert.*
import org.junit.Test

class ShapeAreaKtTest {

    @Test
    fun `Should return 5 for n = 2`() {
        assertEquals(5, shapeArea(2))
    }

    @Test
    fun `Should return 13 for n = 3`() {
        assertEquals(13, shapeArea(3))
    }

    @Test
    fun `Should return 1 for n = 1`() {
        assertEquals(1, shapeArea(1))
    }

    @Test
    fun `Should return 41 for n = 5`() {
        assertEquals(41, shapeArea(5))
    }

    @Test
    fun `Should return 97986001 for n = 7000`() {
        assertEquals(97986001, shapeArea(7000))
    }

    @Test
    fun `Should return 127984001 for n = 8000`() {
        assertEquals(127984001, shapeArea(8000))
    }

    @Test
    fun `Should return 199940005 for n = 9999`() {
        assertEquals(199940005, shapeArea(9999))
    }

    @Test
    fun `Should return 199900013 for n = 9998`() {
        assertEquals(199900013, shapeArea(9998))
    }

    @Test
    fun `Should return 161946005 for n = 8999`() {
        assertEquals(161946005, shapeArea(8999))
    }

    @Test
    fun `Should return 19801 for n = 100`() {
        assertEquals(19801, shapeArea(100))
    }
}