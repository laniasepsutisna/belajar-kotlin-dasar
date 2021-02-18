package belajar.kotlin.oop.anotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented

annotation class Fency(val author: String)
