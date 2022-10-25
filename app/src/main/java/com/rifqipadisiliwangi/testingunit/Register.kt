package com.rifqipadisiliwangi.testingunit

class Register {

    private val extingUsers = listOf("Rifqi", "Padi", "Siliwangi")

    fun validateRegistrationInput(
        username : String,
        password : String,
        confpassword : String,
    ): Boolean{
        if (username.isEmpty() || password.isEmpty() || confpassword.isEmpty()){
            return false
        }
        if (username in extingUsers){
            return false
        }
        if (password != confpassword){
            return false
        }
        if (password.count{
            it.isDigit()
            }<2){
            return false
        }
        return true
    }

}