package com.donghun.bts_lecture

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 한다. (프로그램이)
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        // 7개 image들의 이름을 다 붙이고, 각각 클릭 시 다른 액티비티로 이동!
        val image2 = findViewById<ImageView>(R.id.btsImage2)
        image2.setOnClickListener {
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.btsImage3)
        image3.setOnClickListener {
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.btsImage4)
        image4.setOnClickListener {
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.btsImage5)
        image5.setOnClickListener {
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.btsImage6)
        image6.setOnClickListener {
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.btsImage7)
        image7.setOnClickListener {
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }
    }
}