package com.example.cityrv

class DataResource {
    fun loadCities(): List<CityInformation> {
        return listOf(
            CityInformation(R.string.city1, R.drawable.london),
            CityInformation(R.string.city2, R.drawable.tokyo),
            CityInformation(R.string.city3, R.drawable.newyork),
            CityInformation(R.string.city4, R.drawable.paris),
            CityInformation(R.string.city5, R.drawable.los_angeles),
            CityInformation(R.string.city6, R.drawable.singapore),
            CityInformation(R.string.city7, R.drawable.rome),
            CityInformation(R.string.city8, R.drawable.amsterdam)
        )
    }
}


