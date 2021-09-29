package com.example.cityrv

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CityInformation(@StringRes val cityNameResourceId: Int, @DrawableRes val cityImageResourceId: Int)
