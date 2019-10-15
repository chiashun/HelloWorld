package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//:= extend oncreate=main() super = parent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //create the ui
    //R=resource folder
        setContentView(R.layout.activity_main)
    //TODO Continue your work here
    //val value,java int x;kotlin val x :Int
    val buttonPressMe: Button =findViewById(R.id.buttonPressMe)
    buttonPressMe.setOnClickListener {showMessage() }
    val buttonReset:Button=findViewById(R.id.buttonReset)
    buttonReset.setOnClickListener {showHelloWorld() }

    }
    //  private fun showMessage():int return value;
    private fun showMessage() {
        val textViewMessage:TextView=findViewById(R.id.textView)
        textViewMessage.setText(getString(R.string.pressme))
    }
    private fun showHelloWorld() {
        val textViewMessage:TextView=findViewById(R.id.textView)
        textViewMessage.setText(getString(R.string.Reset))
    }
}
