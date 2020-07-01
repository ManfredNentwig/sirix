package org.sirix.cli

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MainKtTest {

    val DB_FILE = "/tmp/sirix.db"

    var args: Array<String> = emptyArray()

    @BeforeEach
    fun setUp() {

        args = arrayOf("-f", DB_FILE, "-v")

    }

    @AfterEach
    fun tearDown() {
    }


    @Test
    fun testCreateCommand() {
        // GIVEN
        val args: Array<String> = arrayOf("-f", "/tmp/sirix.db", "create", "xml", "-un", "testuser", "-uid", "55cc0eb9-d142-41f7-b76b-3f01e41417a9", "-r","testnode","-d", "<xml><foo>Test</foo></xml")

        // WHEN
        val cliCommand = parseArgs(args)

        // THEN
        assertNotNull(cliCommand)
    }


}