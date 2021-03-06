package com.maliarrayandev.detikcom4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
        const val cont_KontentNews = "cont_KontenNews"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.setText(intent.getStringExtra(cont_TitleNews))
        img_toolbar.setImageResource(intent.getStringExtra(cont_PhotoNews).toInt())
        txt_kontenNews.setText(intent.getStringExtra(cont_KontentNews))

        btn_back.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intenMain = Intent(this@DetailActivity, MainActivity::class.java)

                startActivity(intenMain)
                finish()
            }


        })
    }
}