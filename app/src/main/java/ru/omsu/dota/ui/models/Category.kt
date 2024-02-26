package ru.omsu.dota.ui.models

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dota.ui.theme.skModernistFamily

@Composable
fun Category(text: String) {
    Box(
        modifier = Modifier
            .background(
                color = Color(0xFF44A9F4).copy(alpha = 0.24f),
                shape = RoundedCornerShape(30.dp)
            )
            .padding(10.dp, 5.dp)
    ) {
        Text(
            text = text.uppercase(),
            color = Color(0xFF4aA0E7),
            fontFamily = skModernistFamily,
            fontWeight = FontWeight(700),
            fontSize = 10.sp,
        )
    }
}
