package com.example.acs.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.acs.R;

public class Infos extends AppCompatActivity {

    private ListView listLocal;
    private String[] itens = {
            "Noções básicas","Galeria","Atualizações"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos);

        listLocal = findViewById(R.id.listLocal);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens

        );
        //add itens na lista
        listLocal.setAdapter( adaptador );

        //add funções ao clicar na lista
        listLocal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String valorEscolido = listLocal.getItemAtPosition(position).toString();

            }
        });

    }
}
