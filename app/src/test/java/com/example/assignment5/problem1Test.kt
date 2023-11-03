package com.example.assignment5

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows

class problem1Test {

    val stack = problem1()

    // test case 1
    @Test
    fun testPushPop1() {

        stack.push(0, 1)
        stack.push(1, 2)
        stack.push(2, 3)
        assertEquals(1, stack.pop(0))
        assertEquals(2, stack.pop(1))
        assertEquals(3, stack.pop(2))
    }

    // test case 2
    @Test
    fun testPushPop2() {

        stack.push(0, 100)
        stack.push(1, 200)
        stack.push(2, 300)
        assertEquals(100, stack.pop(0))
        assertEquals(200, stack.pop(1))
        assertEquals(300, stack.pop(2))
    }

    // test case 3
    @Test
    fun testPushPop3() {

        stack.push(0, 55)
        stack.push(1, 32)
        stack.push(2, 30)
        assertEquals(55, stack.pop(0))
        assertEquals(32, stack.pop(1))
        assertEquals(30, stack.pop(2))
    }

    // test case 4
    @Test
    fun testPeek1() {
        stack.push(0, 10)
        stack.push(1, 20)
        stack.push(2, 30)
        assertEquals(10, stack.peek(0))
        assertEquals(20, stack.peek(1))
        assertEquals(30, stack.peek(2))
    }

    // test case 5
    @Test
    fun testPeek2() {
        stack.push(0, 190)
        stack.push(1, 200)
        stack.push(2, 300)
        assertEquals(190, stack.peek(0))
        assertEquals(200, stack.peek(1))
        assertEquals(300, stack.peek(2))
    }

    // test case 6
    @Test
    fun testPeek3() {
        stack.push(0, 66)
        stack.push(1, 77)
        stack.push(2, 88)
        assertEquals(66, stack.peek(0))
        assertEquals(77, stack.peek(1))
        assertEquals(88, stack.peek(2))
    }

    // test case 7
    @Test
    fun testIsEmpty1() {
        assertTrue(stack.isEmpty(0))
        assertTrue(stack.isEmpty(1))
        assertTrue(stack.isEmpty(2))

        stack.push(0, 22)
        stack.push(1, 2)
        stack.push(2, 4)

        assertFalse(stack.isEmpty(0))
        assertFalse(stack.isEmpty(1))
        assertFalse(stack.isEmpty(2))
    }

    // test case 8
    @Test
    fun testIsEmpty2() {
        assertTrue(stack.isEmpty(0))
        assertTrue(stack.isEmpty(1))
        assertTrue(stack.isEmpty(2))

        stack.push(0, 48)
        stack.push(1, 10)
        stack.push(2, 97)

        assertFalse(stack.isEmpty(0))
        assertFalse(stack.isEmpty(1))
        assertFalse(stack.isEmpty(2))
    }

    // test case 9
    @Test
    fun testPopEmptyStack1() {
        assertThrows(Exception::class.java) { stack.pop(0) }
        assertThrows(Exception::class.java) { stack.pop(1) }
        assertThrows(Exception::class.java) { stack.pop(2) }
    }

    // test case 10
    @Test
    fun testPopEmptyStack2() {
        assertThrows(Exception::class.java) { stack.pop(10) }
        assertThrows(Exception::class.java) { stack.pop(11) }
        assertThrows(Exception::class.java) { stack.pop(12) }
    }
}