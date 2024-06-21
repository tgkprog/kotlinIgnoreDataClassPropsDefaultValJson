package com.sel2in.kotlinDefaultsJson

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
data class ServerInfo(val appName: String, val time: String, val env: String)
