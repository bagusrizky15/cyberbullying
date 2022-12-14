package com.example.cyberbullying.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cyberbullying.materi.MateriActivity
import com.example.cyberbullying.databinding.ActivityHomeBinding
import com.example.cyberbullying.materi.QuizActivity
import com.example.cyberbullying.materi.VideoActivity

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

        binding.btnVideo.setOnClickListener{
            val j = Intent(this, VideoActivity::class.java)
            startActivity(j)
        }

        binding.btnQuiz.setOnClickListener{
            val k = Intent(this, QuizActivity::class.java)
            startActivity(k)
        }

    }

}