package com.example.assignment5

import org.junit.Test
import org.junit.Assert.assertEquals

class problem2Test {

    val arr = problem2()

    // test case 1
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

    // test case 2
    @Test
    fun testSearchEmptyInput1() {
        val sports = emptyArray<String>()
        assertEquals(-1, arr.search(sports, "soccer"))
    }

    // test case 3
    @Test
    fun testSearchEmptyInput2() {
        val strings = emptyArray<String>()
        assertEquals(-1, arr.search(strings, "strawberry"))
    }

    // test case 4
    @Test
    fun testSearchEmptyString1() {
        val strings = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(-1, arr.search(strings, ""))
    }

    // test case 5
    @Test
    fun testSearchEmptyString2() {
        val sports = arrayOf("soccer", "basketball", "tennis", "football", "baseball")
        assertEquals(-1, arr.search(sports, ""))
    }

    // test case 6
    @Test
    fun testSearchFirstElement1() {
        val sports = arrayOf("soccer", "basketball", "tennis", "football", "baseball")
        assertEquals(0, arr.search(sports, "soccer"))
    }

    // test case 7
    @Test
    fun testSearchFirstElement2() {
        val sports = arrayOf("apple", "strawberry", "berry", "grape")
        assertEquals(0, arr.search(sports, "apple"))
    }

    // test case 8
    @Test
    fun testSearchLastElement() {
        val sports = arrayOf("apple", "", "banana", "", "cherry", "date", "", "grape")
        assertEquals(7, arr.search(sports, "grape"))
    }

    // test case 9
    @Test
    fun testSearchNotFound1() {
        val sports = arrayOf("soccer", "basketball", "tennis", "football", "baseball")
        assertEquals(-1, arr.search(sports, "swimming"))
    }

    // test case 10
    @Test
    fun testSearchNotFound2() {
        val sports = arrayOf("apple", "strawberry", "berry", "grape")
        assertEquals(-1, arr.search(sports, "avocado"))
    }
}