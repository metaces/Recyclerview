package com.devspace.recyclerview

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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // create data class
        // create list from data class type
        // create adapter
        // set adapter
        // linear layout manager
        // submeter a lista
        val rvList = findViewById<RecyclerView>(R.id.rv_list)

        val adapter =  ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)
    }
}

val contacts = listOf(
    Contact(
        name = "Roque",
        phone = "+55 (82) 99999999",
        R.drawable.sample10
    ),
    Contact(
        name = "Bruna",
        phone = "+55 (82) 8888888",
        R.drawable.sample3
    ),
    Contact(
        name = "Clara",
        phone = "+55 (82) 7777777",
        R.drawable.sample4
    ),
    Contact(
        name = "Dias",
        phone = "+55 (82) 6666666",
        R.drawable.sample1
    )
)
