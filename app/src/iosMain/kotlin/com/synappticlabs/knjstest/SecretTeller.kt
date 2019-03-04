package com.synappticlabs.knjstest

import platform.JavaScriptCore.*

interface SecretTellerExports: JSExportProtocol {
    val platform: String
    fun tell(): String
}

interface SecretTellerCompanionExports: JSExportProtocol {
    fun create(): SecretTeller
}

actual class SecretTeller: SecretTellerExports {

    override val platform: String = "Kotlin/Native iOS"

    actual override fun tell(): String {
        return "This class is written in Kotlin/Native"
    }

    companion object: SecretTellerCompanionExports {
        override fun create(): SecretTeller {
            return SecretTeller()
        }
    }
}