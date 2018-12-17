package com.example.muhammedraheezrahman.kotlinstudyapp

import  android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var  string : String;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var titleTv : TextView = findViewById(R.id.titleTv)

        var yourstring : String = "hello world"
        var myno = 20
        butt.setOnClickListener {
            Toast.makeText(applicationContext,"Displaying toast ",Toast.LENGTH_SHORT).show();
        }

        titleTv.setOnClickListener {
            Toast.makeText(applicationContext,"Displaying toast ",Toast.LENGTH_SHORT).show();
            titleTv.text = "Yo baby"

             string = titleTv.text.toString()
            val arr = arrayOf(1,2,3,4,5)
            title2Tv.text = string
            for (item in arr)
            titleTv.append(item.toString())


            var p = Person()
            titleTv.text = p.display("Lemons")
        }


        // val is immutable
        val man = "ho"

        // var is mutable

        var mans = "dsafds"
        mans = ""

        var p = Person()
        titleTv.text = p.display("Lemons")

    }
    class Person{

        fun display(data : String) : String{

            var m : String
            m = "nice "
            m = m +data

            return m


        }
    }

}
