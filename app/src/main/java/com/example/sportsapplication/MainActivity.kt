package com.example.sportsapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        var sportsList: ArrayList<SportModel> = ArrayList()

        val sport1=SportModel(R.drawable.football,"Football")
        val sport2=SportModel(R.drawable.basketball,"BasketBall")
        val sport3=SportModel(R.drawable.ping,"Ping Pong")
        val sport4=SportModel(R.drawable.tennis,"Tennis")
        val sport5=SportModel(R.drawable.volley,"Volleyball")

        sportsList.add(sport1)
        sportsList.add(sport2)
        sportsList.add(sport3)
        sportsList.add(sport4)
        sportsList.add(sport5)

        val adapter=SportsAdapter(sportsList)
        recyclerView.adapter=adapter
    }
}