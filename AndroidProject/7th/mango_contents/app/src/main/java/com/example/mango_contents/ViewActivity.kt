package com.example.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ViewActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(intent.getStringExtra("url").toString())

        // Write a message to the database
        val database = Firebase.database
        val myBookmarkRef = database.getReference("message")

        val url = intent.getStringExtra("url")
        val title = intent.getStringExtra("title")
        val imageUrl = intent.getStringExtra("imageUrl")

        val savedText = findViewById<TextView>(R.id.saveText)
        savedText.setOnClickListener {
            myBookmarkRef
                .child(auth.currentUser!!.uid)
                .push()
                .setValue(ContentsModel(url.toString(), imageUrl.toString(), title.toString()))
        }
    }
}