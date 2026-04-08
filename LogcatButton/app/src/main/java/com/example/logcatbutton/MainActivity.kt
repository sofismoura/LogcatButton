package com.example.logcatbutton

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.logcatbutton.ui.theme.LogcatButtonTheme

const val TAG = "Avaliação de Livros"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LogcatButtonTheme {
                App()
            }
        }
    }
}

@Composable
private fun App() {
    var livroNome by remember { mutableStateOf("") }
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Certifique-se de que R.drawable.logo existe, ou comente as linhas abaixo:
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(500.dp)
            )

            Text(text = TAG, style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.ExtraBold)

            TextField(
                value = livroNome,
                onValueChange = { livroNome = it },
                label = { Text("Nome do Livro:") }
            )

            ActionButton("⭐ (Ruim)", ButtonDefaults.buttonColors(containerColor = Color.Red)) {
                Log.e(TAG, "Avaliação: $livroNome - Nota 1")
            }
            ActionButton("⭐⭐ (Regular)", ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500))) {
                Log.w(TAG, "Avaliação: $livroNome - Nota 2")
            }
            ActionButton("⭐⭐⭐ (Bom)", ButtonDefaults.buttonColors(containerColor = Color.Green)) {
                Log.d(TAG, "Avaliação: $livroNome - Nota 3")
            }
            ActionButton("⭐⭐⭐⭐ (Perfeito!)", ButtonDefaults.buttonColors(containerColor = Color.Blue)) {
                Log.i(TAG, "Avaliação: $livroNome - Nota 4")
            }
        }
    }
}

@Composable
fun ActionButton(text: String, colors: ButtonColors, block: () -> Unit) {
    ElevatedButton(
        onClick = block,
        colors = colors,
        modifier = Modifier.fillMaxWidth(0.6f),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(text = text, color = Color.White, fontWeight = FontWeight.Bold)
    }
}