package com.example.mindsharperner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mindsharperner.ui.theme.MindSharpernerTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MindSharpernerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(": " +
                            "\n This is a simple mathematics games which is believed can train your brain. Two numbers are given randomly base on your lavel choice " +
                            "together with the operator. You just needs to calculates the answer, write your answers and press check button. Every correct answer will give " +
                            "you 1 point while wrong answer will deduct 1 point." +
                            "\n" +
                            "\n" +
                            "\n Choose Level:")
                }

                

            }

        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Instruction $name",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MindSharpernerTheme {
        Greeting(": \n" +
                "This is a simple mathematics games which is believed can train your brain. Two numbers are given randomly base on your lavel choice " +
                "together with the operator. You just needs to calculates the answer, write your answers and press check button. Every correct answer will give " +
                "you 1 point while wrong answer will deduct 1 point." +
                "\n" +
                "\n" +
                "\n Choose Level:")
    }
}

