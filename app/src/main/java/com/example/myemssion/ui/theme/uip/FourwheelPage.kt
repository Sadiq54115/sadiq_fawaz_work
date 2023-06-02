package com.example.myemssion.ui.theme.uip

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myemssion.ui.theme.MyEmssionTheme
import kotlin.reflect.KProperty


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FourWheelPge(navController: NavHostController) {

      var voltage by remember { mutableStateOf(0) }
   

        Scaffold(
            topBar = {
                TopAppBar(title = { Text(text = "Battery Percentage") })
            },
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Voltage Rating: $voltage V", style = MaterialTheme.typography.bodyMedium)

                    Spacer(modifier = Modifier.height(32.dp))

                    val percentage = calculateBatteryPercentage(voltage.toString().toFloat())
                    PercentageBar(percentage)

                    Spacer(modifier = Modifier.height(32.dp))

                    Button(
                        onClick = { voltage = 12 },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(72.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                        contentPadding = PaddingValues(16.dp)
                    ) {
                        Text(text = "Set Voltage (12V)", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { voltage = 6 },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(72.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                        contentPadding = PaddingValues(16.dp)
                    ) {
                        Text(text = "Set Voltage (6V)", color = Color.White)
                    }
                }
            }
        )
    }



@Composable
    fun PercentageBar(percentage: Int) {
        val barWidth = 300.dp
        val barHeight = 24.dp

        Box(
            modifier = Modifier
                .width(barWidth)
                .height(barHeight)
                .background(Color.LightGray)
        ) {

            /*
               Canvas(modifier = Modifier.fillMaxSize()) {
                drawIntoCanvas { canvas ->
                    val barFillWidth = (barWidth * percentage / 100f).toPx()
                    canvas.nativeCanvas.drawRect(
                        0f,
                        0f,
                        barFillWidth,
                        size.height.toPx(),
                        Paint().apply {
                            color = Color.Blue
                        }
                    )

                    canvas.nativeCanvas.drawRect(
                        barFillWidth,
                        0f,
                        size.width.toPx(),
                        size.height.toPx(),
                        Paint().apply {
                            color = Color.LightGray
                            style = Stroke(width = 2.dp.toPx())
                        }
                    )
                }
             */


            }
        }


fun drawIntoCanvas(any: Any) {

}

fun calculateBatteryPercentage(voltage: Float): Int {
        // You can implement your own logic here to calculate the percentage
        // based on the voltage rating. This is just a sample implementation.
        return ((voltage / 12f) * 100).toInt()
    }


@Composable
fun WheelpagePreview() {
    MyEmssionTheme {

    }
}


