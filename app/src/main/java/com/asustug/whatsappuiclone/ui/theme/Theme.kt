package com.asustug.whatsappuiclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = Green,
    secondary = lightGray,
    background = lightGray,
    tertiary = Color.White,
)

private val LightColorScheme = lightColorScheme(
    primary = Green,
    secondary = lightGreen,
    background = Color.White,
    tertiary = Color.White,
    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun WhatsAppUICloneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {

    val colorScheme = if (darkTheme){
        DarkColorScheme
    }else{
        LightColorScheme
    }

    val systemUiController = rememberSystemUiController()
    val statusBarColor = if(isSystemInDarkTheme()){
        gray
    } else {
        Green
    }

    val navigationBarColor = if(isSystemInDarkTheme()){
        lightGray
    } else White

    SideEffect {
        systemUiController.setSystemBarsColor(statusBarColor)
        systemUiController.setNavigationBarColor(navigationBarColor)
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}