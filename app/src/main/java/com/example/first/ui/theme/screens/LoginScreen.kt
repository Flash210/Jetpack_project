package com.example.first.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.first.R
import com.example.first.ui.theme.details.purpleColor


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LoginScreen(
    navController: NavController
) {

    var user by remember {
        mutableStateOf("UserName")
    }

    var pass by remember {
        mutableStateOf("password")
    }

    var passVisibility by remember {
        mutableStateOf(false)
    }


    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(
                color = Color(android.graphics.Color.parseColor("#ffffff"))
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.top_background),
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo Image",
            modifier = Modifier.height(150.dp)
        )

        Text(
            "Welcome to App ",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#7d32a8"))
        )



        TextField(
            value = user,
            { text ->
                user = text
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(
                    start = 66.dp,
                    end = 66.dp,
                    bottom = 7.dp,
                    top = 7.dp
                )
                .border(
                    1.dp,
                    color = purpleColor,
                    shape = RoundedCornerShape(50)
                ),
            shape = RoundedCornerShape(50),
            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                color = purpleColor,
                fontSize = 14.sp
            ),

            colors = TextFieldDefaults.textFieldColors(
                containerColor = androidx.compose.ui.graphics.Color.Transparent,
                focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
            ),


            )




        TextField(
            value = pass,
            { text ->
                pass = text
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(
                    start = 66.dp,
                    end = 66.dp,
                    bottom = 7.dp,
                    top = 7.dp
                )
                .border(
                    1.dp, color = purpleColor,
                    shape = RoundedCornerShape(50)
                ),
            shape = RoundedCornerShape(50),
            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                color = purpleColor,
                fontSize = 14.sp
            ),

            colors = TextFieldDefaults.textFieldColors(
                containerColor = androidx.compose.ui.graphics.Color.Transparent,
                focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
            ),
            visualTransformation = if (passVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)


        )


        Button(
            onClick = { /*TODO*/ },

            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(
                    start = 66.dp,
                    end = 66.dp,
                    bottom = 7.dp,
                    top = 7.dp
                ),
            colors = ButtonDefaults.buttonColors(

                //user purpleColor from details/Constants.kt
                containerColor = purpleColor
            ),
            shape = RoundedCornerShape(50)
        ) {

            Text(
                text = "Login",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,

                )
        }
        Text(text = "Don't have an account? Sign Up",
            color = purpleColor,
            fontSize = 14.sp,
            modifier = Modifier.padding(top=7.dp, bottom = 7.dp))

        Row (

        ){
            Image(painter = painterResource(id = R.drawable.google),
                contentDescription ="" ,
                Modifier. padding(7.dp)
                )

            Image(painter = painterResource(id = R.drawable.facebook),
                contentDescription ="" ,
                Modifier.padding(7.dp)
            )
            Image(painter = painterResource(id = R.drawable.twitter),
                contentDescription ="" ,
                Modifier.padding(7.dp)
            )

        }

        Image(painterResource(id = R.drawable.bottom_background)  ,
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            )


    }
}


