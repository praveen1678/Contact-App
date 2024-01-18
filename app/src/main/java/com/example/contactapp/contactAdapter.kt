package com.example.contactapp

import android.app.Activity
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.annotations.Nullable

class contactAdapter(private val context: Activity,private val arrayList: ArrayList<UserData>): ArrayAdapter<UserData>(context,R.layout.contact_item,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val view: View = convertView?: LayoutInflater.from(context).inflate(R.layout.contact_item,parent)

        val image: ImageView = view.findViewById(R.id.contact_image)
        val name: TextView = view.findViewById(R.id.contact_name)


        image.setImageResource(arrayList[position].contactProfile)
        name.text = arrayList[position].contactName



        return view
    }
}