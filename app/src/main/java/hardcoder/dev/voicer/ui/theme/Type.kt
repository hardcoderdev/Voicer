package hardcoder.dev.voicer.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import hardcoder.dev.voicer.R

val fonts = FontFamily(
    listOf(
        Font(R.font.ubuntu_bold, FontWeight.Bold),
        Font(R.font.ubuntu_medium, FontWeight.Medium),
        Font(R.font.ubuntu_regular, FontWeight.Normal)
    )
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    h2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Thin,
        fontSize = 16.sp
    ),
    h3 = TextStyle(
        fontFamily = fonts,
        fontStyle = FontStyle.Italic,
        fontSize = 16.sp
    )
)