package com.example.cyberbullying.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cyberbullying.R
import com.example.cyberbullying.databinding.ActivityMateriBinding

class MateriActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMateriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMateriBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnDefinisi.setOnClickListener{
            val i = Intent(this, PengertianActivity::class.java)
            startActivity(i)
        }
    }
}