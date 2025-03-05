package com.example.task2.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun Task2Theme(content: @Composable () -> Unit) {
    val darkColorScheme = darkColorScheme(
        primary = Color.White,
        onPrimary = Color.Black,
        background = Color.Black,
        onBackground = Color.White,
        surface = Color.DarkGray,
        onSurface = Color.White
    )

    MaterialTheme(
        colorScheme = darkColorScheme,
        typography = Typography,
        content = content
    )
}