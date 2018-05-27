@file:Suppress("unused")

object Plugins {
    // Android
    const val android = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    // Dokka
    const val dokka = "org.jetbrains.dokka:dokka-android-gradle-plugin:${Versions.dokka}"
    // Google Services
    const val gms = "com.google.gms:google-services:${Versions.gms}"
    // Fabric
    const val fabric = "io.fabric.tools:gradle:${Versions.fabric}"
}