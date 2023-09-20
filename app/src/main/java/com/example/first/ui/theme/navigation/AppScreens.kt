package com.example.first.ui.theme.navigation

import java.lang.IllegalArgumentException

enum class AppScreens {

    LoginScreen;

    companion object {
        fun fromRoute(route:String?):AppScreens=
            when(route?.substringBefore("/")){

                LoginScreen.name->LoginScreen

                null ->LoginScreen

                else ->
                    throw IllegalArgumentException("Route $route is not recognized ")

            }
    }

}