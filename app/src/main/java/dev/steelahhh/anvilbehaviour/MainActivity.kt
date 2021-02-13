package dev.steelahhh.anvilbehaviour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import dev.steelahhh.anvilbehaviour.ui.theme.AnvilBehaviourTheme

class MainActivity : AppCompatActivity() {

    private val component = DaggerAppComponent.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val factory = component.factory

        val assistedClass = factory.create("this fails :(")

        setContent {
            AnvilBehaviourTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Text(text = assistedClass.type)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AnvilBehaviourTheme {
        Greeting("Android")
    }
}