package SmoothSailing

import org.junit.Assert.*
import org.junit.Test

class ReverseInParenthesisKtTest {

    @Test
    fun `Should return rab for '(bar)'`() {
        assertEquals("rab", reverseInParentheses("(bar)"))
    }

    @Test
    fun `Should return foorabbaz for 'foo(bar)baz'`() {
        assertEquals("foorabbaz", reverseInParentheses("foo(bar)baz"))
    }

    @Test
    fun `Should return foorabbazmilb for 'foo(bar)baz(blim)'`() {
        assertEquals("foorabbazmilb", reverseInParentheses("foo(bar)baz(blim)"))
    }

    @Test
    fun `Should return foobazrabblim for 'foo(bar(baz))blim'`() {
        assertEquals("foobazrabblim", reverseInParentheses("foo(bar(baz))blim"))
    }

    @Test
    fun `Should return '' for ''`() {
        assertEquals("", reverseInParentheses(""))
    }
}