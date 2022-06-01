package com.ibrahim.retrofittaksiduraklari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ibrahim.retrofittaksiduraklari.databinding.ActivityDurakDetayBinding

class DurakDetayActivity : AppCompatActivity() {
    lateinit var binding: ActivityDurakDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDurakDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent=intent
        val secilenDurakIsmi=intent.getStringExtra("durakIsmi")
        binding.tvDurakDetayAdi.text=secilenDurakIsmi
    }
}