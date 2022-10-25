package com.rifqipadisiliwangi.testingunit

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterTest{

    lateinit var regist : Register
    @Before
    fun setUp(){
        regist = Register()
    }

    @Test
    fun passwordEmpty(){
        val result = regist.validateRegistrationInput("padi","123","123")
        assertEquals("password",result, true)
    }
}