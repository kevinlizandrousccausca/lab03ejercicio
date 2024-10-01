package com.example.lab03ejercio


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ComponentExplorationTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        // Puedes definir colores, tipografías y formas personalizadas aquí si lo necesitas
        content = content
    )
}
