package com.example.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
            "https://www.mangoplate.com/restaurants/XensLeCfhL",
            "https://mp-seoul-image-production-s3.mangoplate.com/917760_1615112831109239.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
            "온고재"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/Wk1SMvyiB_",
                "https://mp-seoul-image-production-s3.mangoplate.com/91343/nxnuds1vcu9fir.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "털보집"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/e7LCOR4AEI",
                "https://mp-seoul-image-production-s3.mangoplate.com/91347/1089220_1632119459985_8423?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "동동국수집"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/mUnkEkd8uSFn",
                "https://mp-seoul-image-production-s3.mangoplate.com/268500/9239_1596889592139_33884?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "젤라띠젤라띠"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/XensLeCfhL",
                "https://mp-seoul-image-production-s3.mangoplate.com/917760_1615112831109239.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "온고재"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/Wk1SMvyiB_",
                "https://mp-seoul-image-production-s3.mangoplate.com/91343/nxnuds1vcu9fir.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "털보집"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/e7LCOR4AEI",
                "https://mp-seoul-image-production-s3.mangoplate.com/91347/1089220_1632119459985_8423?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "동동국수집"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/mUnkEkd8uSFn",
                "https://mp-seoul-image-production-s3.mangoplate.com/268500/9239_1596889592139_33884?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "젤라띠젤라띠"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}