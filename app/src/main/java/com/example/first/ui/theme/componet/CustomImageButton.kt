package com.example.first.ui.theme.componet

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomImageButton(
    text: String,
    imageResource: Int,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 30.dp,
                end = 30.dp,
                top = 10.dp,
                bottom = 10.dp
            )
            .height(50.dp),
        colors = ButtonDefaults.run {
            buttonColors(
                containerColor = androidx.compose.ui.graphics.Color.White
            )
        },
        shape = RoundedCornerShape(17)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .clickable { onClick() },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 5.dp)
            )

            Text(
                text = text,
                color = androidx.compose.ui.graphics.Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold

            )

        }
    }
}
