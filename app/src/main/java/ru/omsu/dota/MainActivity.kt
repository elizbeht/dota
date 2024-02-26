package ru.omsu.dota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dota.ui.theme.DotaTheme
import ru.omsu.dota.ui.models.AppCard
import ru.omsu.dota.ui.theme.skModernistFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaTheme {
                DotaApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DotaApp() {
    Scaffold(
        bottomBar = {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .fillMaxWidth()
                    .background(color = Color.Yellow, shape = RoundedCornerShape(20)),
                colors = ButtonDefaults.buttonColors(contentColor = Color.Yellow, containerColor = Color.Yellow)
            ) {
                Text(
                    text = "Install",
                    color = Color(0xFF050B18),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(700),
                    fontSize = 20.sp,
                )
            }
        }, content = { it
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AppCard()
            }
        }
    )
}
