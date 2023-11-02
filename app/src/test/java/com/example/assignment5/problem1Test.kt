package com.example.assignment5

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows

class problem1Test {
    @Test
    fun testPushPop() {
        val stacks = problem1()
        stacks.push(0, 10)
        stacks.push(1, 20)
        stacks.push(2, 30)
        assertEquals(10, stacks.pop(0))
        assertEquals(20, stacks.pop(1))
        assertEquals(30, stacks.pop(2))
    }

    @Test
    fun testPeek() {
        val stacks = problem1()
        stacks.push(0, 10)
        stacks.push(1, 20)
        stacks.push(2, 30)
        assertEquals(10, stacks.peek(0))
        assertEquals(20, stacks.peek(1))
        assertEquals(30, stacks.peek(2))
    }

    @Test
    fun testIsEmpty() {
        val stacks = problem1()
        assertTrue(stacks.isEmpty(0))
        assertTrue(stacks.isEmpty(1))
        assertTrue(stacks.isEmpty(2))

        stacks.push(0, 10)
        stacks.push(1, 20)
        stacks.push(2, 30)

        assertFalse(stacks.isEmpty(0))
        assertFalse(stacks.isEmpty(1))
        assertFalse(stacks.isEmpty(2))
    }

    @Test
    fun testPopEmptyStack() {
        val stacks = problem1()
        assertThrows(Exception::class.java) { stacks.pop(0) }
        assertThrows(Exception::class.java) { stacks.pop(1) }
        assertThrows(Exception::class.java) { stacks.pop(2) }
    }
}