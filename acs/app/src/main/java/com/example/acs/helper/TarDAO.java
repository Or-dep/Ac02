package com.example.acs.helper;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.acs.model.PassaDados;

import java.util.ArrayList;
import java.util.List;

public class TarDAO implements InterDAO {

    private SQLiteDatabase escrever;
    private SQLiteDatabase ler;

    public TarDAO(Context context) {
        ArmazenamentoDB db = new ArmazenamentoDB(context);
        escrever = db.getWritableDatabase();
        ler = db.getReadableDatabase();
    }

    @Override
    public boolean salvar(PassaDados passaDados) {

        ContentValues cv1 = new ContentValues();

        cv1.put("Nome_do_Cliente", passaDados.getEscrito1());
        cv1.put("Funcionario", passaDados.getEscrito2());
        cv1.put("Data", passaDados.getEscrito3());
        cv1.put("Tipo_de_Operacao", passaDados.getEscrito4());
        cv1.put("Contato", passaDados.getEscrito5());


        try {

            escrever.insert(ArmazenamentoDB.TABAELA_UM,null, cv1);

            Log.i("INFO","Salvo com sucesso");

        }catch (Exception e){

            Log.i("INFO","Erro ao salvar"+e.getMessage());

            return false;
        }

        return true;
    }

    @Override
    public boolean editar(PassaDados passaDados) {
        return false;
    }

    @Override
    public boolean deletar(PassaDados passaDados) {
        return false;
    }

    @Override
    public List<PassaDados> listar() {
        List<PassaDados> lista = new ArrayList<>();
        String sql = "SELECT * FROM " + ArmazenamentoDB.TABAELA_UM + " ;";
        Cursor read = ler.rawQuery(sql,null);

        while (read.moveToNext()){

            PassaDados passar = new PassaDados();

            @SuppressLint("Range") Long id = read.getLong( read.getColumnIndex("Id") );
            @SuppressLint("Range") String nameC = read.getString( read.getColumnIndex( "Nome_do_Cliente"));
            @SuppressLint("Range") String datas = read.getString( read.getColumnIndex( "Funcionario"));
            @SuppressLint("Range") String contat = read.getString( read.getColumnIndex( "Data"));
            @SuppressLint("Range") String func = read.getString( read.getColumnIndex( "Contato"));
            @SuppressLint("Range") String type = read.getString( read.getColumnIndex( "Tipo_de_Operacao"));


            passar.setId(id);
            passar.setEscrito1(nameC);
            passar.setEscrito2(datas);
            passar.setEscrito3(contat);
            passar.setEscrito4(func);
            passar.setEscrito5(type);


            lista.add(passar);
        }
        return lista;
    }


}
