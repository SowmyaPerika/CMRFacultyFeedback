package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class EceSubjects extends AppCompatActivity {
    private Button b_ms,b_me,b_cnet,b_cmc,b_elective1,b_elective2,b_acslab,b_medclab,b_es;
    private TextView textView;
    private static int sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_subjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_ms=(Button)findViewById(R.id.ms);
        b_me=(Button)findViewById(R.id.me);
        b_cnet=(Button)findViewById(R.id.cnet);
        b_cmc=(Button)findViewById(R.id.cmc);
        b_acslab=(Button)findViewById(R.id.acslab);
        b_medclab=(Button)findViewById(R.id.medclab);
        b_elective1=(Button)findViewById(R.id.elective1);
        b_elective2=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);

        b_ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=1;
                Intent four=new Intent(EceSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_acslab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(EceSubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(EceSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(EceSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(EceSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_medclab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(EceSubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_elective1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(EceSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_elective2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(EceSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "MANAGEMENT SCIENCE";
            case 2:
                return "ACS LAB";
            case 3:
                return "MICROWAVE ENGINEERING";
            case 4:
                return "COMPUTER NETWORKS";
            case 5:
                return "CELLULAR AND MOBILE COMMUNICATIONS";
            case 6:
                return "MEDC LAB";
            case 7:
                return "DIGITAL IMAGE PROCESSING";
            case 8:
                return "EMBEDDED SYSTEMS DESIGN";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
    }

