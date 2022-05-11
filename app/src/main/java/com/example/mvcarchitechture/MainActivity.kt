package com.example.mvcarchitechture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.mvcarchitechture.Controller.StudentController
import com.example.mvcarchitechture.model.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var model : Student = getData()
        var view = MainActivity()
        var controller = StudentController(model,view)
        val btn:Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            controller.model.name = "Prashant"
            controller.model.roll = "2"
            Toast.makeText(this,"${model.name}",Toast.LENGTH_SHORT).show()
        }
    }

    private fun getData(): Student {
        return Student("1","Arpit")
    }

    fun printDetails(name: String, roll: String) {
        Log.d("","${name}/${roll}")
    }
}