package com.example.switchedu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.switchedu.ui.theme.SwitchEduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SwitchEduTheme {
               Surface(
                   modifier = Modifier
                       .fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {

               }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicSwitch(modifier: Modifier = Modifier){
    var isChecked by remember { mutableStateOf(false) }

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ){
        Text(
            text = if(isChecked) "문자 수신 on" else "문자 수신 off"
        )
        Switch(
            checked = isChecked,
            onCheckedChange = {
                isChecked = it
            },
            colors = SwitchDefaults.colors(
                uncheckedTrackColor = Color.Yellow,
                checkedTrackColor = Color.Green,
                uncheckedThumbColor = Color.Black,
                checkedThumbColor = Color.Blue
            ),
            thumbContent = {
                if(isChecked){
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Check",
                        tint = Color.White
                    )
                }else {
                    null
                }
            }
        )
    }
}
