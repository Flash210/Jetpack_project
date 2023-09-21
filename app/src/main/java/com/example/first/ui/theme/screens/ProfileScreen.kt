package com.example.first.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.first.R
import com.example.first.ui.theme.componet.CustomImageButton


@Preview
@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#ececec"))),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        ConstraintLayout {
            val (topImg, profile) = createRefs()

            Image(
                painterResource(id = R.drawable.toop_background),
                contentDescription = "background",
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(topImg) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)

                    },
            )

            Image(painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier.constrainAs(profile) {
                    top.linkTo(topImg.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(topImg.bottom)

                }
            )

        }
        Text(
            text = "IOS Developer",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp),
            color = Color(android.graphics.Color.parseColor("#747679"))

        )

        Text(
            text = "IosDeveloper@gmail.com",
            fontSize = 20.sp,
            color = Color(android.graphics.Color.parseColor("#747679"))

        )

        //************

        CustomImageButton(
            text = stringResource(id = R.string.My_Reviews),
            imageResource = R.drawable.ic_1
        ) {}

        CustomImageButton(
            text = stringResource(id = R.string.Account_Settings),
            imageResource = R.drawable.ic_2
        ) {}
        CustomImageButton(
            text = stringResource(id = R.string.Personal_Information),
            imageResource = R.drawable.ic_3
        ) {}

        CustomImageButton(
            text = stringResource(id = R.string.Notification),
            imageResource = R.drawable.ic_4
        ) {}

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(
                    start = 30.dp,
                    end = 30.dp,
                    top = 15.dp,
                    bottom = 15.dp
                )
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#373ebf"))
            ),
            shape = RoundedCornerShape(40.dp)

        )
        {
            Text(text = stringResource(id = R.string.Return),
color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
                )


        }


    }


}