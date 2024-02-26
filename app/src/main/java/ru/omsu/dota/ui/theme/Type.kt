package ru.omsu.dota.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.omsu.dota.R


val skModernistFamily = FontFamily(
    Font(R.font.sk_modernist_regular, FontWeight.Normal),
    Font(R.font.sk_modernist_bold, FontWeight.Bold)
//    Font(R.font.sk_modernist_mono, FontWeight.)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontSize = 20.sp,
        fontWeight = FontWeight(700)
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontSize = 12.sp,
        fontWeight = FontWeight(400)

    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)