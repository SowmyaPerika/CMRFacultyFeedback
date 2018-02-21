package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by win on 28/09/2017.
 */

public class Secondyearsubjects extends AppCompatActivity {
    private Button b_m4,b_ds,b_mfcs,b_dld,b_java,b_dslab,b_it,b_javalab,b_es;
    private TextView textView;
    private static int sub;
    private Firebase mref;
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
        b_ds.setText("DATA STRUCTURES THROUGH C++");
        b_mfcs.setText("MATHEMATICAL FOUNDATIONS OF COMPUTER SCIENCE");
        b_dld.setText("DIGITAL LOGIC DESIGN");
        b_java.setText("OBJECT ORIENTED PROGRAMMING THROUGH JAVA");
        b_dslab.setText("DS LAB");
        b_it.setText("IT WORKSHOP");
        b_javalab.setText("JAVA LAB");
        b_es.setText("ENVIRONMENTAL STUDIES");

        b_m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=1;
                Intent four=new Intent(Secondyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(Secondyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_mfcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(Secondyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(Secondyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(Secondyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dslab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(Secondyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(Secondyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_javalab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(Secondyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=9;
                Intent four=new Intent(Secondyearsubjects.this,Rating.class);
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
                return "DATA STRUCTURES THROUGH C++";
            case 3:
                return "MATHEMATICAL FOUNDATIONS OF COMPUTER SCIENCE";
            case 4:
                return "DIGITAL LOGIC DESIGN";
            case 5:
                return "OBJECT ORIENTED PROGRAMMING THROUGH JAVA";
            case 6:
                return "DS LAB";
            case 7:
                return "IT WORKSHOP";
            case 8:
                return "JAVA LAB";
            case 9:
                return "ENVIRONMENTAL STUDIES";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }

}
