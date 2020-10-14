package com.ulza.testingapphehe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView
    private var names =ArrayList<String>()
    private lateinit var imgPreview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSetValue = findViewById(R.id.btn_set_value)
        tvText = findViewById(R.id.tv_text)
        btnSetValue.setOnClickListener(this)

        names.add("Powered by FLAMEZOMBIE")
        names.add("3 Agustus 2003")
        names.add("Valentino Ahmad Ulza Paramarta")

        imgPreview = findViewById(R.id.img_preview)
        imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstockbig))
        Glide.with(this).load(R.drawable.fronalpstockbig).into(imgPreview)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}