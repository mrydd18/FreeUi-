package com.example.freeui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.freeui.data.ItemRep
import com.example.freeui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainAdapter = MainAdapter()
    private val itemRepository = ItemRep()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
    }

    private fun setUp() {
        initRecyclerView()
        initAdapter()
    }

    private fun initRecyclerView() {
        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun initAdapter() {
        mainAdapter.submitList(itemRepository.itemList)
    }

}