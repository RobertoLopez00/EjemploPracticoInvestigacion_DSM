package com.example.ejemplopracticoinvestigacion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            Item("Título 1", "Descripción general del titulo 1"),
            Item("Título 2", "Descripción general del titulo 2"),
            Item("Título 3", "Descripción general del titulo 3"),
        )

        recyclerView.adapter = ItemAdapter(items)
    }
}