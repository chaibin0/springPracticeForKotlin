package com.example.chaibin.kotlin_design_pattern.staticmethod

class Server private constructor(port: Long) {
    init {
        println("$port")
    }

    companion object {
        fun withPort(port: Long) = Server(port)
    }
}

