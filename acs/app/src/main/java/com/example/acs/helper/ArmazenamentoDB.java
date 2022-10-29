package com.example.acs.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;


public class ArmazenamentoDB extends SQLiteOpenHelper {

    public static int VERSION = 1;
    public static String NOME_DB = "bancoDdados";
    public static String TABAELA_UM = "tabela1";


    public ArmazenamentoDB(@Nullable Context context) {super(context, NOME_DB, null, VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {

        String banco = "CREATE TABLE IF NOT EXISTS " + TABAELA_UM
                +" (Id INTEGER PRIMARY KEY AUTOINCREMENT, "
                +" Nome_do_Cliente VARCHAR NOT NULL, "
                +" Funcionario VARCHAR NOT NULL, "
                +" Data VARCHAR NOT NULL, "
                +" Tipo_de_Operacao VARCHAR NOT NULL, "
                +" Contato VARCHAR NOT NULL ); ";
        try {

            db.execSQL(banco);
            Log.i("INFO", "Sucesso ao criar a tabela");
        }catch (Exception e){

            Log.i("INFO", "Erro ao criar a tabela" + e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS "+ TABAELA_UM + ";";

        try {
            db.execSQL(sql);
            onCreate(db);
            Log.i("INFO", "Sucesso ao criar a tabela");
        }catch (Exception e){
            Log.i("INFO", "Erro ao criar a tabela" + e.getMessage());
        }

    }
}