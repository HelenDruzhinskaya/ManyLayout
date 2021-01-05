package ru.samsung.itacademy.mdev.manylayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val date = Date()
        var time: Int
        if ( date.hours < 14 )  time = R.layout.activity_main
        else time = R.layout.second
        setContentView(time)
    }
}