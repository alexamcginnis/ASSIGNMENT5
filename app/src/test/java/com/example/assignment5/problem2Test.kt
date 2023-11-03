package com.example.assignment5

import org.junit.Test
import org.junit.Assert.assertEquals

class problem2Test {
    val arr = problem2()
    @Test
    fun testSearch() {
        val strings = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(-1, arr.search(strings, "avocado"))
        assertEquals(0, arr.search(strings, "apple"))
        assertEquals(2, arr.search(strings, "banana"))
        assertEquals(4, arr.search(strings, "cherry"))
        assertEquals(5, arr.search(strings, "date"))
        assertEquals(7, arr.search(strings, "grape"))
    }

    @Test
    fun testSearchEmptyInput1() {
        val sports = emptyArray<String>()
        assertEquals(-1, arr.search(sports, "soccer"))
    }

    @Test
    fun testSearchEmptyInput2() {
        val strings = emptyArray<String>()
        assertEquals(-1, arr.search(strings, "strawberry"))
    }

    @Test
    fun testSearchEmptyString1() {
        val strings = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(-1, arr.search(strings, ""))
    }

    @Test
    fun testSearchEmptyString2() {
        val sports = arrayOf("soccer", "basketball", "tennis", "football", "baseball")
        assertEquals(-1, arr.search(sports, ""))
    }

    @Test
    fun testSearchFirstElement1() {
        val sports = arrayOf("soccer", "basketball", "tennis", "football", "baseball")
        assertEquals(0, arr.search(sports, "soccer"))
    }

    @Test
    fun testSearchFirstElement2() {
        val sports = arrayOf("apple", "strawberry", "berry", "grape")
        assertEquals(0, arr.search(sports, "apple"))
    }

    @Test
    fun testSearchLastElement() {
        val sports = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(7, arr.search(sports, "grape"))
    }

    @Test
    fun testSearchNotFound1() {
        val sports = arrayOf("soccer", "basketball", "tennis", "football", "baseball")
        assertEquals(-1, arr.search(sports, "swimming"))
    }

    @Test
    fun testSearchNotFound2() {
        val sports = arrayOf("apple", "strawberry", "berry", "grape")
        assertEquals(-1, arr.search(sports, "avocado"))
    }
}