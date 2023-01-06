package com.example.vmforlistact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vmforlistact.model.MeasurementMade
import com.example.vmforlistact.model.PhoneModel
import com.example.vmforlistact.ui.theme.VmForListActTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    private val phoneModel = PhoneModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VmForListActTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        MeasurementList(phoneModel)
                    }
                }
            }
        }
    }
}

@Composable
fun MeasurementList(phoneModel: PhoneModel) {
    // przed
    phoneModel.measurements.map { currentMeasurement ->
        MeasurementEntry(currentMeasurement)
    }
}

@Composable
fun MeasurementEntry(currentMeasurement: MeasurementMade) {
    MeasurementIcon(currentMeasurement.isOk)
    Text(text = currentMeasurement.name)
    Text(text = currentMeasurement.date)
}

@Composable
fun MeasurementIcon(isOk: Boolean) {
    if (isOk) {
        Icon(painter =, contentDescription =)
    } else {
        Icon(painter =, contentDescription =)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VmForListActTheme {
        Column {
            MeasurementList(PhoneModel())
        }
    }
}