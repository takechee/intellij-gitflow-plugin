package com.github.takechee.gitflow4intellij

object Deps {
    object Kotlin {
        private const val version = "1.6.10"
        const val bom = "org.jetbrains.kotlin:kotlin-bom:$version"

        // bom import does not working...
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib"
        const val test = "org.jetbrains.kotlin:kotlin-test"
    }

    object IntelliJ {
        private const val version = "1.3.1"

        const val plugin = "org.jetbrains.intellij.plugins:gradle-intellij-plugin:$version"
    }
}