package ru.omsu.dota.ui.models

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dota.ui.theme.skModernistFamily

@Composable
fun Comment(name: String, date: String, text: String, imageResource: Int) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
            ) {
                Image(
                    painter = painterResource(id = imageResource),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                Text(
                    text = name,
                    color = Color(0xFFA8ADB7),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                )
                Text(
                    text = date,
                    color = Color(0xFFA8ADB7).copy(alpha = 0.4f),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(400),
                    fontSize = 12.sp,
                )
            }
        }
        Text(
            text = text,
            color = Color(0xFFA8ADB7).copy(alpha = 0.4f),
            fontFamily = skModernistFamily,
            fontWeight = FontWeight(400),
            fontSize = 12.sp,
        )
    }
}
