package com.synappticlabs.knjstest

import kotlin.native.concurrent.freeze

actual class SecretTeller() {

    actual val platform: String = "Kotlin/Native iOS"

    actual fun tell(): String {
        return "This class is written in Kotlin/Native"
    }

    companion object {
        fun createAndFreeze(): SecretTeller {
            val teller = SecretTeller()
            teller.freeze()
            return teller
        }
    }
}