package com.example.myemssion.ui.theme.uip


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myemssion.Screens

import com.example.myemssion.ui.theme.MyEmssionTheme

@Composable

fun MainPage(navController: NavController){
  //  NavControlle
    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.heightIn(22.dp))


        Button(
            onClick = { navController.navigate(Screens.FourWheelScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .height(72.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            contentPadding = PaddingValues(16.dp)
        ) {
            Text(text = "4 Wheeler Battery", color = Color.White)
        }

        Spacer(modifier = Modifier.heightIn(22.dp))


        Button(
                onClick = { /* Handle 2 wheeler button click */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
        contentPadding = PaddingValues(16.dp)
        ) {
        Text(text = "2 Wheeler Battery", color = Color.White)
    }

        Spacer(modifier = Modifier.heightIn(22.dp))

    }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyEmssionTheme {

    }
}

/*
modifier = Modifier
.fillMaxSize()
.padding(16.dp),
verticalArrangement = Arrangement.Center,
horizontalAlignment = Alignment.CenterHorizontally
) {

}
}
}

}

```

```
 */

