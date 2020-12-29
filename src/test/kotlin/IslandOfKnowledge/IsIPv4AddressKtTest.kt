package IslandOfKnowledge

import org.junit.Assert.*
import org.junit.Test

class IsIPv4AddressKtTest {
    @Test
    fun `Should return true for "172 16 254 1"`() {
        assertEquals(
            true,
            isIPv4Address("172.16.254.1")
        )
    }

    @Test
    fun `Should return false for "172 316 254 1"`() {
        assertEquals(
            false,
            isIPv4Address("172.316.254.1")
        )
    }

    @Test
    fun `Should return false for " 254 255 0"`() {
        assertEquals(
            false,
            isIPv4Address(".254.255.0")
        )
    }

    @Test
    fun `Should return false for "1 1 1 1a"`() {
        assertEquals(
            false,
            isIPv4Address("1.1.1.1a")
        )
    }

    @Test
    fun `Should return false for "1"`() {
        assertEquals(
            false,
            isIPv4Address("1")
        )
    }

    @Test
    fun `Should return true for "0 254 255 0"`() {
        assertEquals(
            true,
            isIPv4Address("0.254.255.0")
        )
    }

    @Test
    fun `Should return false for "1 23 256 255 "`() {
        assertEquals(
            false,
            isIPv4Address("1.23.256.255.")
        )
    }

    @Test
    fun `Should return false for "1 23 256   "`() {
        assertEquals(
            false,
            isIPv4Address("1.23.256..")
        )
    }

    @Test
    fun `Should return false for "64 233 161 00"`() {
        assertEquals(
            false,
            isIPv4Address("64.233.161.00")
        )
    }
}