package com.example.practicegithubactions

class Test {
    companion object{

        const val CONST_VALUE = 2
        val value = 3
    }

    fun a(value: Int?) {
        println(value!!)
    }

    fun b(value: Int?) {
        println(value!!.toString())
    }
}