package com.example.acs.ui.home;

import static com.example.acs.helper.ArmazenamentoDB.TABAELA_UM;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.acs.R;

import com.google.android.material.textfield.TextInputEditText;



public class HomeFragment extends Fragment {

    private Button butaoSave;

    private TextInputEditText escrever1;
    private TextInputEditText escrever2;
    private TextInputEditText escrever3;
    private TextInputEditText escrever4;
    private TextInputEditText escrever5;

    private TextView Resultado;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View homeView = inflater.inflate(R.layout.fragment_home, container, false);

        butaoSave = homeView.findViewById(R.id.butaoSave);

        escrever1 = homeView.findViewById(R.id.escrever1);
        escrever2 = homeView.findViewById(R.id.escrever2);
        escrever3 = homeView.findViewById(R.id.escrever3);
        escrever4 = homeView.findViewById(R.id.escrever4);
        escrever5 = homeView.findViewById(R.id.escrever5);

        Resultado = homeView.findViewById(R.id.resultado);


        butaoSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = homeView.getContext().getSharedPreferences(TABAELA_UM,0);
                SharedPreferences.Editor editor = preferences.edit();

                final long SEGUNDOS1 = (1000 * 0);// 1000 = 1 SEGUNDO

                boolean test;

                if (escrever1.getText().toString().equals("")) {
                    Toast.makeText(getContext().getApplicationContext(), "Nome do Cliente não pode estar em branco", Toast.LENGTH_SHORT).show();
                    try {
                        Resultado.setText("Insira novamente");
                        Thread.sleep(SEGUNDOS1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    /*String escrito1 = escrever1.getText().toString();
                    editor.putString("", escrito1);
                    editor.commit();*/
                    test = true;
                }

                if (escrever2.getText().toString().equals("")) {
                    Toast.makeText(getContext().getApplicationContext(), "Funcionario não pode estar em branco", Toast.LENGTH_SHORT).show();
                    try {
                        Resultado.setText("Insira novamente");
                        Thread.sleep(SEGUNDOS1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test = false;
                } else {
                   /* String escrito2 = escrever2.getText().toString();
                    editor.putString("", escrito2);
                    editor.commit();*/
                    test = true;
                }
                if (escrever3.getText().toString().equals("")) {
                    Toast.makeText(getContext().getApplicationContext(), "Data não pode estar em branco", Toast.LENGTH_SHORT).show();
                    try {
                        Resultado.setText("Insira novamente");
                        Thread.sleep(SEGUNDOS1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test = false;
                } else {
                    /*String escrito3 = escrever3.getText().toString();
                    editor.putString("", escrito3);
                    editor.commit();*/
                    test = true;
                }
                if (escrever4.getText().toString().equals("")) {
                    Toast.makeText(getContext().getApplicationContext(), "Tipo não pode estar em branco", Toast.LENGTH_SHORT).show();
                    try {
                        Resultado.setText("Insira novamente");
                        Thread.sleep(SEGUNDOS1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test = false;
                } else {
                    /*String escrito4 = escrever4.getText().toString();
                    editor.putString("", escrito4);
                    editor.commit();*/
                    test = true;
                }

                if (escrever5.getText().toString().equals("")) {
                    Toast.makeText(getContext().getApplicationContext(), "Contato não pode estar em branco", Toast.LENGTH_SHORT).show();
                    try {
                        Resultado.setText("Insira novamente");
                        Thread.sleep(SEGUNDOS1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test = false;
                } else {
                    /*String escrito5 = escrever5.getText().toString();
                    editor.putString("", escrito5);
                    editor.commit();*/
                    test = true;
                }
                if ( test == true ) {
                    Toast.makeText(getContext().getApplicationContext(), "Pronto para salvar", Toast.LENGTH_SHORT).show();
                }

            }
        });

        return homeView;
    }
}