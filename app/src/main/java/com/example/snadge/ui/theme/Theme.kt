package com.example.snadge.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val ColorPalette = lightColors(
    primary = DarkPurple,
    primaryVariant = DarkPurple,
    secondary = DarkPurple,
    background = LightPurple
)

@Composable
fun SnakeGameTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = ColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}