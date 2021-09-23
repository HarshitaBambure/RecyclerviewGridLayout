package com.example.recyclerviewgridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerAdapter

    private var dataList = mutableListOf<RecyclerData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_design)
        //grid layout manager
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)


        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))
        dataList.add(RecyclerData("text", "2X divice", R.drawable.ic_office, false))

        recyclerAdapter = RecyclerAdapter(this, dataList)
        recyclerView.adapter = recyclerAdapter
    }

}