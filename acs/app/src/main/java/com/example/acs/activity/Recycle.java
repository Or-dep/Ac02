package com.example.acs.activity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;


import com.example.acs.R;
import com.example.acs.adapter.Adaptador;
import com.example.acs.helper.ArmazenamentoDB;
import com.example.acs.helper.RecyclerItemClickListener;
import com.example.acs.helper.TarDAO;
import com.example.acs.model.PassaDados;


import java.util.ArrayList;
import java.util.List;

public class Recycle extends AppCompatActivity {

    private RecyclerView recyclerTexts;
    private Adaptador adaptadorNV;
    private List<PassaDados> listaPbanco = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        recyclerTexts = findViewById(R.id.recyclerTexts);

        ArmazenamentoDB db = new ArmazenamentoDB(getApplicationContext());

        /*ContentValues listagem = new ContentValues();
        listagem.put("Nome_do_Cliente", "Teste");
        listagem.put("Funcionario","");
        listagem.put("Data","");
        listagem.put("Tipo_de_Operacao","");
        listagem.put("Contato","");

        db.getWritableDatabase().insert("tabela1", null,listagem);*/

        recyclerTexts.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerTexts,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Log.i("clique","");
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Log.i("clique","");
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                ));


    }
    public void carregarLista(){

        TarDAO listar = new TarDAO(getApplicationContext());
        listaPbanco = listar.listar();

        //PassaDados passaDados1 = new PassaDados();


        ArmazenamentoDB db = new ArmazenamentoDB(getApplicationContext());

        /*ContentValues cv = new ContentValues();
        cv.put("Nome_do_Cliente","teste");

        db.getWritableDatabase().insert("tabela1",null, cv);*/

        //Listagem
        PassaDados list001 = new PassaDados();


        listaPbanco.add(list001);



        //configurar adapter
        adaptadorNV = new Adaptador( listaPbanco );
        //Adaptador adapter = new Adaptador( listaPbanco );


        //configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerTexts.setLayoutManager(layoutManager);
        recyclerTexts.setHasFixedSize(true);
        recyclerTexts.addItemDecoration( new DividerItemDecoration(getApplicationContext(),LinearLayoutManager.VERTICAL));
        recyclerTexts.setAdapter( adaptadorNV ); //( adapter );

    }

    @Override
    protected void onStart() {
        carregarLista();
        super.onStart();
    }
}