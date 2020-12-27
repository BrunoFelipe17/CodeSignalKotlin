package ExploringTheWaters

import org.junit.Assert.*
import org.junit.Test

class AddBorderKtTest {
    @Test
    fun `Should return {*****, *abc*, *ded*, *****} for {abc, ded}`() {
        assertEquals(
            mutableListOf("*****", "*abc*", "*ded*", "*****"),
            addBorder(mutableListOf("abc", "ded"))
        )
    }

    @Test
    fun `Should return {***,*a*, ***} for {a}`() {
        assertEquals(
            mutableListOf("***", "*a*", "***"),
            addBorder(mutableListOf("a"))
        )
    }

    @Test
    fun `Should return {****, *aa*, ****, *zz*, ****} for {aa, **, zz}`() {
        assertEquals(
            mutableListOf("****", "*aa*", "****", "*zz*", "****"),
            addBorder(mutableListOf("aa", "**", "zz"))
        )
    }

    @Test
    fun `Should return {*******, *abcde*, *fghij*, *klmno*, *pqrst*, *uvwxy*, *******} for {abcde, fghij, klmno, pqrst, uvwxy}`() {
        assertEquals(
            mutableListOf("*******", "*abcde*", "*fghij*", "*klmno*", "*pqrst*", "*uvwxy*", "*******"),
            addBorder(mutableListOf("abcde", "fghij", "klmno", "pqrst", "uvwxy"))
        )
    }

    @Test
    fun `Should return {*******, *wzy***, *******} for {wzy**}`() {
        assertEquals(
            mutableListOf("*******", "*wzy***", "*******"),
            addBorder(mutableListOf("wzy**"))
        )
    }
}