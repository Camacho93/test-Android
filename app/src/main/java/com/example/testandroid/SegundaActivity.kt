package com.example.testandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testandroid.databinding.ActivitySegundaBinding
import com.example.testandroid.utils.Constantes

class SegundaActivity : AppCompatActivity() {

    private lateinit var _binding : ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        intent.extras?.let { bundle ->
            _binding.textView.text = bundle.getString(Constantes.DATA)
        }

        _binding.button1.setOnClickListener {
            finish()
        }
    }
}