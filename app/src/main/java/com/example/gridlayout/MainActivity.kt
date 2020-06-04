package com.example.gridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridlayout.adapaters.AlphaAdapters
import com.example.gridlayout.model.AlphaChar

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView ? =null
    private var gridLayoutManager:GridLayoutManager?=null
    private var arrayList:ArrayList<AlphaChar>?=null
    private var AlphaAdapters:AlphaAdapters?=null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.my_recycle_view)
        gridLayoutManager= GridLayoutManager(applicationContext,3,LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager=gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList=ArrayList()
        arrayList=setDataInList()
        var alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter=alphaAdapters
    }
    
    private fun setDataInList():ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()
        items.add(AlphaChar(R.drawable.frenchfries,alphaChar = "french fries"))
        items.add(AlphaChar(R.drawable.hamburger,alphaChar = "hamburger"))
        items.add(AlphaChar(R.drawable.hotdog,alphaChar = "hotdog"))
        items.add(AlphaChar(R.drawable.noodles,alphaChar = "noodles"))
        items.add(AlphaChar(R.drawable.sandwich,alphaChar = "sandwich"))
        items.add(AlphaChar(R.drawable.springroll,alphaChar = "springroll"))


        return items
    }
}