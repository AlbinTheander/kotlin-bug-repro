package com.ant.bugrepro

import kotlin.test.Test
import kotlin.test.assertTrue

class BugTest {

    @Test
    fun bugrepro() {
        val sub = SubClass()
        val msg = sub.sayHello("Albin")
        assertTrue { msg.contains("BaseClass") }
    }
}