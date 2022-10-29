package com.example.acs.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.acs.R;
import com.example.acs.activity.Atualizacoes;
import com.example.acs.activity.Infos;
import com.example.acs.activity.Recycle;


public class MainActivity extends AppCompatActivity {

    private Button buttonInfos;

    private Button buttonAtt;

    private Button buttonHist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInfos = findViewById(R.id.button1);

        buttonInfos.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Infos.class );
                startActivity(intent);
            }
        });
        buttonAtt = findViewById(R.id.button2);

        buttonAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Atualizacoes.class );
                startActivity(intent);
            }
        });
        buttonHist = findViewById(R.id.buttonHist);

        buttonHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Recycle.class );
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
    @Override
    protected void onResume() {
        super.onResume();

    }
    @Override
    protected void onPause() {
        super.onPause();

    }
        @Override
    protected void onStop() {
        super.onStop();

    }
    @Override
    protected void onRestart() {
        super.onRestart();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
