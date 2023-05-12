package com.example.projectscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val adapterList by lazy {DetailRecyclerViewAdapter(this@MainActivity) }
//    private val detailRecyclerViewAdapter = DetailRecyclerViewAdapter(null)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val itemList = DataSource.getItems()

        adapterList.updateList(itemList)

        binding.RecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = adapterList
        }
//        arrayList.add("Item 1")
//        arrayList.add("Item 2")
//        arrayList.add("Item 3")
//        arrayList.add("Item 4")
//        arrayList.add("Item 5")
//        arrayList.add("Item 6")
//        arrayList.add("Item 7")
//        arrayList.add("Item 8")
//        arrayList.add("Item 9")
//        arrayList.add("Item 10")
//        arrayList.add("Item 11")
//        val recyclerView: RecyclerView = findViewById(R.id.RecyclerView)
//        customAdapter = CustomAdapter(arrayList)
//        val layoutManager = LinearLayoutManager(applicationContext)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.adapter = customAdapter
    }
//    fun getItems(){
//        arrayList.add("Item 1")
//        arrayList.add("Item 2")
//        arrayList.add("Item 3")
//        arrayList.add("Item 4")
//        arrayList.add("Item 5")
//        arrayList.add("Item 6")
//        arrayList.add("Item 7")
//        arrayList.add("Item 8")
//        arrayList.add("Item 9")
//        arrayList.add("Item 10")
//        arrayList.add("Item 11")
//        customAdapter.notifyDataSetChanged()
//    }
}
