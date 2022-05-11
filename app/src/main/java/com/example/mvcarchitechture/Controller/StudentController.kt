package com.example.mvcarchitechture.Controller

import com.example.mvcarchitechture.MainActivity
import com.example.mvcarchitechture.model.Student

data class StudentController(val model:Student, val view:MainActivity){
    fun updateView(){
        view.printDetails(model.name,model.roll)
    }
}