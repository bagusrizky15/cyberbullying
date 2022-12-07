package com.example.cyberbullying.home

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import com.example.cyberbullying.R
import com.example.cyberbullying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener{
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }

        binding.btnExit.setOnClickListener{
            customDialog()
        }

    }

    private fun customDialog(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog)

        val btnClose = dialog.findViewById<Button>(R.id.btn_close)
        btnClose.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }

}