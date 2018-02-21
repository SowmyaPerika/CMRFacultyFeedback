package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select extends AppCompatActivity {
    private Button academics, seminar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        academics = (Button) findViewById(R.id.acadamics);
        seminar = (Button) findViewById(R.id.seminar);

        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Select.this,Details.class);
                startActivity(intent);

            }
        });
        seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Select.this,Sem.class);
                startActivity(intent);

            }
        });
    }
}
