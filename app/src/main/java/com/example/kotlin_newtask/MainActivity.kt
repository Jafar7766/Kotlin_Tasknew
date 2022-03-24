package com.example.kotlin_newtask

import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_newtask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnpress.setOnClickListener{
            val email = binding.textEmail.editText?.text.toString()
            val password = binding.textPassword.editText?.text.toString()

            Toast.makeText(this, "Email->$email, Password-> $password", Toast.LENGTH_LONG).show()
        }

        setContentView(binding.root)
    }
}