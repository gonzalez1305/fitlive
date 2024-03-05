package com.example.fitlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitlife.Connect

class MainActivity : AppCompatActivity() {
    val connect = Connect()
    val connection = connect.getConnection()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (connection != null) {
            println("conectado...")
        } else {
            println("Error sl conectar la base de datos.")
        }
    }
}