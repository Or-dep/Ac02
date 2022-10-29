package com.example.acs.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.acs.R;
import com.example.acs.helper.TarDAO;
import com.example.acs.model.PassaDados;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


import com.example.acs.databinding.ActivityAtualizacoesBinding;
import com.google.android.material.textfield.TextInputEditText;

public class Atualizacoes extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityAtualizacoesBinding binding;

    private Button butaoSave;

    private TextInputEditText escrever1;
    private TextInputEditText escrever2;
    private TextInputEditText escrever3;
    private TextInputEditText escrever4;
    private TextInputEditText escrever5;

    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAtualizacoesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarAtualizacoes.toolbar);
        butaoSave = findViewById(R.id.butaoSave);

        escrever1 = findViewById(R.id.escrever1);
        escrever2 = findViewById(R.id.escrever2);
        escrever3 = findViewById(R.id.escrever3);
        escrever4 = findViewById(R.id.escrever4);
        escrever5 = findViewById(R.id.escrever5);

        Resultado = findViewById(R.id.resultado);


        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_atualizacoes);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.atualizacoes, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch ( item.getItemId()){
                case R.id.butaoSave:
                    //Execução de save
                    TarDAO save = new TarDAO(getApplicationContext());
                    String input1 = escrever1.getText().toString();
                    String input2 = escrever2.getText().toString();
                    String input3 = escrever3.getText().toString();
                    String input4 = escrever4.getText().toString();
                    String input5 = escrever5.getText().toString();

                    if (!input1.isEmpty()){

                        if (!input2.isEmpty()){

                            if (!input3.isEmpty()){

                                if (!input4.isEmpty()){

                                    if (!input5.isEmpty()){

                                        PassaDados processo = new PassaDados();
                                        processo.setEscrito1(input1);
                                        processo.setEscrito2(input2);
                                        processo.setEscrito3(input3);
                                        processo.setEscrito4(input4);
                                        processo.setEscrito5(input5);
                                        save.salvar(processo);
                                        Toast.makeText(getApplicationContext(), "Salvo", Toast.LENGTH_SHORT).show();
                                        finish();

                                    }
                                }
                            }
                        }
                    }

                    break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_atualizacoes);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}