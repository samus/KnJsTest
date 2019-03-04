package com.synappticlabs.knjstest

actual class SecretTeller() {

    actual val platform: String = "Kotlin/Native iOS"

    actual fun tell(): String {
        return "This class is written in Kotlin/Native"
    }
}