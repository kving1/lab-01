package com.example.petshop

class Evil(date: String): Mood(date) {
    override fun curMood(): String {
        return "I'm feeling a little evil right now! Muahahahahahajahahahahahaa"
    }
}