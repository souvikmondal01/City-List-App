package com.example.cityrv

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val context: Context, private val dataSet: List<CityInformation>) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cityImage: ImageView = itemView.findViewById(R.id.iv_city)
        val cityName: TextView = itemView.findViewById(R.id.tv_cityName)
        val location: ImageView = itemView.findViewById(R.id.iv_location)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.city_list, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val item = dataSet[position]
        holder.cityImage.setImageResource(item.cityImageResourceId)
        val cities = context.resources.getString(item.cityNameResourceId)
        holder.cityName.text = cities
        fun searchLocation() {
            val queryUrl: Uri = Uri.parse("geo:0,0?q=$cities")
            val mapIntent = Intent(Intent.ACTION_VIEW, queryUrl)
            mapIntent.setPackage("com.google.android.apps.maps")
            context.startActivity(mapIntent)
        }
        holder.location.setOnClickListener {
            searchLocation()
        }
        holder.cityName.setOnClickListener {
            Toast.makeText(context, cities, Toast.LENGTH_SHORT).show()
        }

    }


    override fun getItemCount(): Int {
        return dataSet.size
    }
}