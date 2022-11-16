package com.example.chaibin.kotlin_design_pattern.bridge

interface Trooper {
    fun move(x: Long, y: Long)
    fun attackRebel(x: Long, y: Long)

}

class StormTrooper : Trooper {
    override fun move(x: Long, y: Long) {
        //Move
    }

    override fun attackRebel(x: Long, y: Long) {
        //Missed most of the time
    }
}

class ShockTrooper : Trooper {
    override fun move(x: Long, y: Long) {
        //Moves slower then regular StormTrooper
    }

    override fun attackRebel(x: Long, y: Long) {
        //Sometimes hits
    }
}


