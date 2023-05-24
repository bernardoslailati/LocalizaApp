package com.localiza.jdc.localizaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.localiza.jdc.designsystem.ui_components.component.LECOPrimaryButton
import com.localiza.jdc.designsystem.ui_components.component.RACPrimaryButton
import com.localiza.jdc.designsystem.ui_components.theme.LocalizaJDCMaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocalizaJDCMaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LECOPrimaryButton()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LocalizaJDCMaterialTheme {
        Column {
            RACPrimaryButton()
            LECOPrimaryButton()
            Image(
                painter = painterResource(id = com.localiza.jdc.designsystem.R.drawable.neutraliza),
                contentDescription = ""
            )
        }
    }
}