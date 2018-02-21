package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by win on 16/12/2017.
 */

public class Mechthirdsubjects extends AppCompatActivity {
    private Button b_ppl,b_se,b_cd,b_os,b_oslab,b_cdlab,b_cn,b_ipr,b_es;
    private TextView textView;
    private static int sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyearsubjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_ppl=(Button)findViewById(R.id.linux);
        b_se=(Button)findViewById(R.id.design);
        b_cd=(Button)findViewById(R.id.cloud);
        b_os=(Button)findViewById(R.id.dwdm);
        b_oslab=(Button)findViewById(R.id.linuxlab);
        b_cdlab=(Button)findViewById(R.id.dwdmlab);
        b_cn=(Button)findViewById(R.id.elective1);
        b_ipr=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);

        b_ppl.setText("MANAGERIAL ECONOMICS AND FINANCIAL ANALYSIS");
        b_se.setText("ENGINEERING METROLOGY");
        b_cd.setText("DYNAMICS OF MACHINERY");
        b_os.setText("MACHINE TOOLS");
        b_oslab.setText("DESIGN AND MACHINE MEMBERS-I");
        b_cdlab.setText("THERMAL ENGINEERING-II");
        b_cn.setText("MACHINE TOOLS AND METROLOGY LAB");
        b_ipr.setText("THERMAL ENGINEERING LAB");
        b_ppl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=1;
                Intent four=new Intent(Mechthirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(Mechthirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(Mechthirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(Mechthirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_oslab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(Mechthirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cdlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(Mechthirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(Mechthirdsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_ipr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(Mechthirdsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "MANAGERIAL ECONOMICS AND FINANCIAL ANALYSIS";
            case 2:
                return "ENGINEERING METROLOGY";
            case 3:
                return "DYNAMICS OF MACHINERY";
            case 4:
                return "MACHINE TOOLS";
            case 5:
                return "DESIGN AND MACHINE MEMBERS-I";
            case 6:
                return "THERMAL ENGINEERING-II";
            case 7:
                return "MACHINE TOOLS AND METROLOGY LAB";
            case 8:
                return "THERMAL ENGINEERING LAB";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
}

