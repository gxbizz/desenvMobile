package edu.curso.helloworld

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class HelloWorld : Activity(){
    override fun onCreate(bundle : Bundle?) {
        super.onCreate(bundle)

        val txt = TextView(this)
        //antes : txt.setText("Hello World")
       
        txt.text = "Hello World"
        setContentView(txt)
    }
}