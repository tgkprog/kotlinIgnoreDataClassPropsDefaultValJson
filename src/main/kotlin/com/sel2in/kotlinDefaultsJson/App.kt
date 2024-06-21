package com.sel2in.kotlinDefaultsJson

import io.micronaut.runtime.Micronaut

object App {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
            .packages("com.sel2in.kotlinDefaultsJson")
            .mainClass(App.javaClass)
            .start()
    }
}