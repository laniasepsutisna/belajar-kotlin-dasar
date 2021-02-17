package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.BigNote
import belajar.kotlin.oop.data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin Dasar")
    println(bigNote.title)
    println(bigNote.bigTitle)

}