package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;



public class Civilsecondsubjects extends AppCompatActivity {
    private Button b_m4,b_ds,b_mfcs,b_dld,b_java,b_dslab,b_it,b_javalab,b_es;
    private TextView textView;
    private static int sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyearsubjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_m4=(Button)findViewById(R.id.linux);
        b_ds=(Button)findViewById(R.id.design);
        b_mfcs=(Button)findViewById(R.id.cloud);
        b_dld=(Button)findViewById(R.id.dwdm);
        b_java=(Button)findViewById(R.id.linuxlab);
        b_dslab=(Button)findViewById(R.id.dwdmlab);
        b_it=(Button)findViewById(R.id.elective1);
        b_javalab=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);


        b_m4.setText("MATHEMATICS-IV");
        b_ds.setText("STRENGTH OF MATERIALS-I");
        b_mfcs.setText("FLUID MECHANICS-I");
        b_dld.setText("BUILDING MATERIAL,CONSTRUCTION AND PLANNING");
        b_java.setText("SURVEYING");
        b_dslab.setText("STRENGTH TO MATERIAL LAB");
        b_it.setText("COMPUTER AIDED DESIGN-I LAB");
        b_javalab.setText("SURVEYING LAB-I");
        b_es.setText("GENDER SENSITIZATION LAB");
        b_m4.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=1;
                Intent four=new Intent(Civilsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ds.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=2;
                Intent four=new Intent(Civilsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_mfcs.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=3;
                Intent four=new Intent(Civilsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dld.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=4;
                Intent four=new Intent(Civilsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_java.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=5;
                Intent four=new Intent(Civilsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dslab.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=6;
                Intent four=new Intent(Civilsecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_it.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=7;
                Intent four=new Intent(Civilsecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_javalab.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=8;
                Intent four=new Intent(Civilsecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_es.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=9;
                Intent four=new Intent(Civilsecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "MATHEMATICS-IV";
            case 2:
                return "STRENGTH OF MATERIALS-I";
            case 3:
                return "FLUID MECHANICS-I";
            case 4:
                return "BUILDING MATERIAL,CONSTRUCTION AND PLANNING";
            case 5:
                return "SURVEYING";
            case 6:
                return "STRENGTH TO MATERIAL  LAB";
            case 7:
                return "COMPUTER AIDED DESIGN-I LAB";
            case 8:
                return "SURVEYING LAB-I";
            case 9:
                return "GENDER SENSITIZATION LAB";

        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
}
