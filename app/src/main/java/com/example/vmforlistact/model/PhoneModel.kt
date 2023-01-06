package com.example.vmforlistact.model

import java.time.LocalDate

class PhoneModel {

    val measurements : List<MeasurementMade> = listOf(
        MeasurementMade(true, "Cornette 2023", LocalDate.now().minusDays(1)),
        MeasurementMade(false, "Nowogard 2023", LocalDate.now().minusMonths(1)),
        MeasurementMade(true, "NowyWpis 2023", LocalDate.now()),
    )

}
