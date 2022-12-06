package com.example.cyberbullying.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cyberbullying.materi.MateriActivity
import com.example.cyberbullying.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnMateri.setOnClickListener{
            val i = Intent(this, MateriActivity::class.java)
            startActivity(i)
        }

        binding.btnQuiz.setOnClickListener{

        }

    }
}