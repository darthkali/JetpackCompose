package com.example.corecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.corecomposeapplication.ui.theme.CoreComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(),
        ) {
            Text(
                text = "Wrapped Content",
                style = MaterialTheme.typography.h3
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoreComposeApplicationTheme {
        MainScreen()
    }
}