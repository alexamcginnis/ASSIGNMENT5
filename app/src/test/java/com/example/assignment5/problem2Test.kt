package com.example.assignment5

import org.junit.Test
import org.junit.Assert.assertEquals

class problem2Test {
    val arr = problem2()
    @Test
    fun testSearch() {

        val strings = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(2, arr.search(strings, "banana"))
        assertEquals(4, arr.search(strings, "cherry"))
        assertEquals(0, arr.search(strings, "apple"))
        assertEquals(5, arr.search(strings, "date"))
        assertEquals(7, arr.search(strings, "grape"))
        assertEquals(-1, arr.search(strings, "kiwi"))
    }

    @Test
    fun testSearchEmptyInput() {
        val strings = emptyArray<String>()
        assertEquals(-1, arr.search(strings, "banana"))
    }

    @Test
    fun testSearchEmptyString() {
        val strings = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(-1, arr.search(strings, ""))
    }
}