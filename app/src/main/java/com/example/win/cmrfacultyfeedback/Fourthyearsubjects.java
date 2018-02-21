package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class Fourthyearsubjects extends AppCompatActivity {
    private Button b_linux,b_design,b_cloud,b_dwdm,b_elective1,b_elective2,b_linuxlab,b_dwdmlab,b_es;
    private TextView textView;
    private static int sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyearsubjects);

        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_linux=(Button)findViewById(R.id.linux);
        b_design=(Button)findViewById(R.id.design);
        b_cloud=(Button)findViewById(R.id.cloud);
        b_dwdm=(Button)findViewById(R.id.dwdm);
        b_linuxlab=(Button)findViewById(R.id.linuxlab);
        b_dwdmlab=(Button)findViewById(R.id.dwdmlab);
        b_elective1=(Button)findViewById(R.id.elective1);
        b_elective2=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);
        b_linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=1;
                Intent four=new Intent(Fourthyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_linuxlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(Fourthyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(Fourthyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(Fourthyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dwdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(Fourthyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));

                startActivity(four);

            }
        });
        b_dwdmlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(Fourthyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_elective1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(Fourthyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_elective2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(Fourthyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "LINUX PROGRAMMING";
            case 2:
                return "LP LAB";
            case 3:
                return "DESIGN PATTERNS";
            case 4:
                return "CLOUD COMPUTING";
            case 5:
                return "DATA WAREHOUSE AND DATA MINING";
            case 6:
                return "DWDM LAB";
            case 7:
                return "INFORMATION RETREIVAL SYSTEM";
            case 8:
                return "MOBILE COMPUTING";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
}

