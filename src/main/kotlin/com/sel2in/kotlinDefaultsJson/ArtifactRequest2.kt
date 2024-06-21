package com.sel2in.kotlinDefaultsJson

import com.fasterxml.jackson.annotation.JsonInclude
import io.micronaut.serde.annotation.Serdeable


@Serdeable.Deserializable
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ArtifactRequest2(
    val product: String,
    val label: String = "",
    val notes: String = ""
)

