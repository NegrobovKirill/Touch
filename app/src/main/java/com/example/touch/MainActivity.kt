package com.example.touch

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import com.example.touch.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)


        setContentView(bindingClass.root)


        bindingClass.toucher.setOnClickListener {

           generateRandomColor()

        }
    }

    private fun generateRandomColor(){
        val rnd = Random()
        val colorBackGround = Color.argb(255, rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256))
        bindingClass.toucher.setBackgroundColor(colorBackGround)
        val colorText = Color.argb(255, rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256))
        bindingClass.toucher.setTextColor(colorText)
        val intRange:IntRange = 20..60
        bindingClass.toucher.setTextSize(TypedValue.COMPLEX_UNIT_SP,intRange.random().toFloat())


    }
}
