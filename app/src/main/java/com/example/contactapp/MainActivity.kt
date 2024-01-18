package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.contactapp.R.id.listview



class MainActivity : AppCompatActivity() {
    private lateinit var UserArrayList : ArrayList<UserData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactProfileImage = intArrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
        )

        val contactName = arrayOf(
            "Aarya",
            "Amrita",
            "Bharat",
            "Coder",
            "Tanishk",
            "Kirti",
            "Megha",
            "Prateek",
            "Shivansh",
            "Yugal"
        )

        val contactNumber = arrayOf(
            "954758699",
            "774589612",
            "05612",
            "10101001",
            "65478932",
            "3254169",
            "9458671",
            "102457896",
            "9988776655",
            "283204"
        )

        UserArrayList = ArrayList()
        for (position in contactName.indices) {
            val contact = UserData(
                contactProfileImage[position],
                contactName[position],
                contactNumber[position])

            UserArrayList.add(contact)

        }
          val listView = findViewById<ListView>(listview)
        listView.adapter = contactAdapter(this,UserArrayList)
        listView.isClickable = true
        listView.setOnItemClickListener { parent, view, position, id ->
            val profile =  contactProfileImage[position]
            val name = contactName[position]
            val number =  contactNumber[position]
            val intent = Intent(this,deatilContact::class.java)
            intent.putExtra("profileImage",profile)
            intent.putExtra("name",name)
            intent.putExtra("number",number)
            startActivity(intent)
        }
    }
}










       /* val contactList = listOf(
           contactModel(R.drawable.image1,"Aarya"),
            contactModel(R.drawable.image2,"Amrita"),
            contactModel(R.drawable.image3,"Bharat"),
            contactModel(R.drawable.image4,"Coder"),
            contactModel(R.drawable.image5,"Tanishk"),
            contactModel(R.drawable.image6,"kirti"),
            contactModel(R.drawable.image7,"Megha"),
            contactModel(R.drawable.image8,"prateek"),
            contactModel(R.drawable.image9,"Shivansh"),
            contactModel(R.drawable.image10,"Yugal"),
        )
        val contactName : List<String> = contactList.map { it.name }
        val listView : ListView = findViewById(/* id = */ select_dialog_listview1)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,contactName)

        listView.adapter = adapter



    }
}
data class contactModel (val image: Int, val name: String) */