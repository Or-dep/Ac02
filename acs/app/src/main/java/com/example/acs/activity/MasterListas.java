package com.example.acs.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.acs.R;
import com.example.acs.adapter.Adapter;
import com.example.acs.model.modelo;

import java.util.ArrayList;
import java.util.List;

public class MasterListas extends AppCompatActivity {

    public RecyclerView recyclerView;
    public List<modelo> listaDeTitulos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);

        recyclerView = findViewById(R.id.recyclerView);

        //lista de itens
        this.criarTitulos();

        //config adapter
        Adapter adapter = new Adapter( listaDeTitulos );


        //config Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarTitulos(){
        modelo padrao = new modelo("titulo",
                "01/01/2000",
                "sampley-text");
        this.listaDeTitulos.add(padrao);

        padrao = new modelo("titulo1",
                "01/01/2001",
                "texto");
        this.listaDeTitulos.add(padrao);

        padrao = new modelo("titulo2",
                "01/01/2002",
                "Teste de texto");
        this.listaDeTitulos.add(padrao);

        padrao = new modelo("titulo3",
                "01/01/2003",
                "Alguma coisa");
        this.listaDeTitulos.add(padrao);

        padrao = new modelo("titulo4",
                "01/01/2004",
                "Hellow");
        this.listaDeTitulos.add(padrao);

        padrao = new modelo("titulo5",
                "01/01/2005",
                "World");
        this.listaDeTitulos.add(padrao);
    }
}
