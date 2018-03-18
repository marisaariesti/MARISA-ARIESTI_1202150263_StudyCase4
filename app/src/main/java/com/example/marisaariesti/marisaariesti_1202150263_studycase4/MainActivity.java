package com.example.marisaariesti.marisaariesti_1202150263_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnlist, btncari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlist = (Button)findViewById(R.id.listmahasiswa);
        btncari = (Button)findViewById(R.id.carigamabar);


        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListNamaMahasiswa.class);
                startActivity(intent);
            }
        });

        btncari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PencarianGambar.class);
                startActivity(intent);
            }
        });
    }
}
