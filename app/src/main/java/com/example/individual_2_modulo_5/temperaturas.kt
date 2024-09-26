package com.example.individual_2_modulo_5

import androidx.activity.ComponentActivity


    fun main() {
        println("Bienvenido al conversor de temperatura")
        println("Selecciona la opción de conversión:")
        println("1. Celsius a Fahrenheit")
        println("2. Kelvin a Celsius")
        println("3. Fahrenheit a Kelvin")

        val opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Ingresa la temperatura en Celsius: ")
                val celsius = readLine()!!.toDouble()
                val fahrenheit = (9.0 / 5.0) * celsius + 32
                println("$celsius °C es igual a $fahrenheit °F")
            }
            2 -> {
                print("Ingresa la temperatura en Kelvin: ")
                val kelvin = readLine()!!.toDouble()
                val celsius = kelvin - 273.15
                println("$kelvin K es igual a $celsius °C")
            }
            3 -> {
                print("Ingresa la temperatura en Fahrenheit: ")
                val fahrenheit = readLine()!!.toDouble()
                val kelvin = (5.0 / 9.0) * (fahrenheit - 32) + 273.15
                println("$fahrenheit °F es igual a $kelvin K")
            }
            else -> {
                println("Opción no válida.")
            }
        }
    }