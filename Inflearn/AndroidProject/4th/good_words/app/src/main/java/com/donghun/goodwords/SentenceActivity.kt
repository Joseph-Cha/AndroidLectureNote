package com.donghun.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.donghun.goodwords.databinding.ActivityMainBinding

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰끌씨 쓰면 명언 같다")
        sentenceList.add("사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다")
        sentenceList.add("아무말 대잔치")
        sentenceList.add("명언 제조 중")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listView = findViewById<ListView>(R.id.sentenceListView)

        listView.adapter = sentenceAdapter
    }
}