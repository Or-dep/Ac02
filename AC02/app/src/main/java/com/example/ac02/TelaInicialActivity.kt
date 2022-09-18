package com.example.ac02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.ac02.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val params = this.intent.extras
        val nome = params?.getString("nome")
        val senha = params?.getString("impacta")
        Toast.makeText(this, "$nome", Toast.LENGTH_SHORT).show()

        val nome_usuario = params?.getString("user")
        binding.texoBreve.text = "Olá $nome_usuario"

        setSupportActionBar(binding.toolbarInclude.toolbar)

        supportActionBar?.title = "Menu"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_primal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_buscar){
            Toast.makeText(this, "buscar", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.action_atualizar){
            Toast.makeText(this, "atualizar", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.action_config){
            Toast.makeText(this, "configuarações", Toast.LENGTH_SHORT).show()
        }
        else if (id == android.R.id.home){
            finish()
        }
        return true
    }
}