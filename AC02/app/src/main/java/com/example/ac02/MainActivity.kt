package com.example.ac02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ac02.databinding.LoginBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        LoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imagem1.setImageResource(R.drawable.mapa_pixel)
        binding.textView.text = "Faça seu Login"
        binding.inputName

        binding.button.setOnClickListener {
            Toast.makeText(this,"Bem Vindo", Toast.LENGTH_SHORT).show()

            if (binding.inputName.inputType == "aluno"){

            }

            val intent = Intent(this, TelaInicialActivity::class.java)
            val params = Bundle()
            params.putString("nome", "aluno")
            params.putString("senha", "impacta")
            intent.putExtras(params)

            val user = binding.inputName.text.toString()
            val password = binding.inputPass.text.toString()
            intent.putExtra("user", user)
            intent.putExtra("senha", password)
            startActivity(intent)

        }
    }
}