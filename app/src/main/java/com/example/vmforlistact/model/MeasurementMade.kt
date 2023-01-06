package com.example.vmforlistact.model

import java.time.LocalDateTime

data class MeasurementMade(
    val isOk: Boolean,
    val name: String,
    val date: LocalDateTime
)
