package com.synappticlabs.knjstest

import kotlinx.cinterop.StableRef
import kotlin.native.concurrent.freeze

actual class SecretTeller() {
    private val stateRef = StableRef.create(HashMap<String, Any>())

    actual var platform: String
        get() = stateRef.get()["platform"] as? String ?: ""
        set(value) { stateRef.get()["platform"] = value }

    init {
        platform = "Kotlin/Native"
    }

    actual fun tell(): String {
        return "This class is written in $platform"
    }

    companion object {
        fun createAndFreeze(): SecretTeller {
            val teller = SecretTeller()
            teller.freeze()
            return teller
        }
    }
}