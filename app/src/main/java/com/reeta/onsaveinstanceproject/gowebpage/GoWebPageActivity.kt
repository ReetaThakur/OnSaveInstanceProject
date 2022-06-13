package com.reeta.onsaveinstanceproject.gowebpage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reeta.onsaveinstanceproject.R
import kotlinx.android.synthetic.main.activity_go_web_page.*

class GoWebPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_web_page)

        btnPage.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            var uri="https://www.masaischool.com/"
            intent.data = Uri.parse(uri)
            startActivity(intent)
        }
    }
}