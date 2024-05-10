package com.sajal.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)


        val contacts=listOf(
            Contact(R.drawable.man1,"Karim","+884785121486"),
            Contact(R.drawable.man3,"Alice","+88145789521"),
            Contact(R.drawable.boss,"Bob","+8802587965"),
            Contact(R.drawable.woman,"Olivia","+882589632147"),
            Contact(R.drawable.woman1,"Ursula","+884789562147852"),
            Contact(R.drawable.student1,"Charlie","+887985214793"),
            Contact(R.drawable.student2,"Rachel","+88987412563"),
            Contact(R.drawable.student3,"Taylor","+88798521369"),
            Contact(R.drawable.student4,"David","+887985213654798"),
            Contact(R.drawable.teacher1,"Frank","+8878965421"),
            Contact(R.drawable.teacher2,"Eva","+8812547982201"),
            Contact(R.drawable.teacher3,"Jack","+889632104582")
        )

        contactAdapter=ContactAdapter(contacts)
        recyclerView.adapter=contactAdapter

    }
}