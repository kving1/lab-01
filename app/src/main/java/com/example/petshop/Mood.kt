package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun curMood(): String
}