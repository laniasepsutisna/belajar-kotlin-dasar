package belajar.kotlin.oop.app

import belajar.kotlin.oop.anotations.NotBlank
import belajar.kotlin.oop.data.CreateCategoryRequest
import belajar.kotlin.oop.data.CreateProductRequest
import belajar.kotlin.oop.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties


fun validateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    for(property in properties){
        if(property.findAnnotation<NotBlank>() != null){
            when (val value = property.call(request)) {
                is String -> {
                    if("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request1 = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request1)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequest(request2)
}