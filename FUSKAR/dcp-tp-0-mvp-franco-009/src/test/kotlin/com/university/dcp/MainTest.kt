package com.university.dcp

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `greeting returns Hello, World!`() {
        assertEquals("Hello, World!", greeting())
    }

    @Test
    fun `main prints Hello, World!`() {
        val originalOut = System.out
        val captured = ByteArrayOutputStream()
        try {
            System.setOut(PrintStream(captured))
            main()
        } finally {
            System.setOut(originalOut)
        }

        val output = captured.toString().trim()
        assertEquals("Hello, World!", output)
    }
}
