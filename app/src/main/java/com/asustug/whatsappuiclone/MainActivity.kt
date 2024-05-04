package com.asustug.whatsappuiclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asustug.whatsappuiclone.ui.components.AppBarComponent
import com.asustug.whatsappuiclone.ui.screens.HomeScreen
import com.asustug.whatsappuiclone.ui.theme.WhatsAppUICloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsAppUICloneTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatsAppUICloneTheme {
        HomeScreen()
    }
}