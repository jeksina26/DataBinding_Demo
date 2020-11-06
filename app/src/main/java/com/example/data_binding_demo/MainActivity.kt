package com.example.data_binding_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.data_binding_demo.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var dataBindingUtil: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBindingUtil = DataBindingUtil.setContentView(this,R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        dataBindingUtil.btnchange.setOnClickListener {
            dataBindingUtil.model = randomFruitGenerate()
        }
    }

    private fun randomFruitGenerate(): Model {
        var list = ArrayList<Model>()
        list.add(Model("Apple"))
        list.add(Model("Grapse"))
        list.add(Model("Strawberry"))
        list.add(Model("Fig"))
        list.add(Model("Kiwi"))
        list.add(Model("Orange"))
        list.add(Model("Watermalon"))
        return list[Random().nextInt(list.size)]
    }

}