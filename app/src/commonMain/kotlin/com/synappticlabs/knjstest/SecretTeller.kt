package com.synappticlabs.knjstest

expect class SecretTeller {
    val platform: String
    fun tell(): String
}