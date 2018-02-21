package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class Section extends AppCompatActivity {
    private Button A,B,C,D;
    private static int sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        Firebase.setAndroidContext(this);
        setTitle("Sections");
        A=(Button)findViewById(R.id.a_btn);
        B=(Button)findViewById(R.id.b_btn);
        C=(Button)findViewById(R.id.c_btn);
        D=(Button)findViewById(R.id.d_btn);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sec=1;
                select();
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sec=2;
                select();
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sec=3;
                select();
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sec=4;
                select();
            }
        });
    }

    public void select() {

        int year = YearActivity.getId();
        String rollnum = getIntent().getExtras().getString("roll");
        if (rollnum.substring(7, 8).equals("5")) {
            if (year == 4) {
                Intent asec = new Intent(Section.this, Fourthyearsubjects.class);
                asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                startActivity(asec);
                finish();
            } else {
                if (year == 3 || year == 5) {
                    Intent asec = new Intent(Section.this, Thirdyearsubjects.class);
                    asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                    startActivity(asec);
                    finish();
                } else {
                    if (year == 2 || year == 6) {
                        Intent asec = new Intent(Section.this, Secondyearsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    } else {

                        Intent asec = new Intent(Section.this, Firstyearsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    }
                }
            }
        }
        if (rollnum.substring(7, 8).equals("4")) {
            if (year == 4) {
                Intent asec = new Intent(Section.this, EceSubjects.class);
                asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                startActivity(asec);
                finish();
            } else {
                if (year == 3 || year == 5) {
                    Intent asec = new Intent(Section.this, Ecethirdsubjects.class);
                    asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                    startActivity(asec);
                    finish();
                } else {
                    if (year == 2 || year == 6) {
                        Intent asec = new Intent(Section.this, Ecesecondsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    } else {

                        Intent asec = new Intent(Section.this, Firstyearsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    }
                }
            }
        }
        if (rollnum.substring(7, 8).equals("3")) {
            if (year == 4) {
                Intent asec = new Intent(Section.this, MechSubjects.class);
                asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                startActivity(asec);
                finish();
            } else {
                if (year == 3 || year == 5) {
                    Intent asec = new Intent(Section.this, Mechthirdsubjects.class);
                    asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                    startActivity(asec);
                    finish();
                } else {
                    if (year == 2 || year == 6) {
                        Intent asec = new Intent(Section.this, Mechsecondsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    } else {

                        Intent asec = new Intent(Section.this, Firstyearsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    }
                }
            }
        }
        if (rollnum.substring(7, 8).equals("1")) {
            if (year == 4) {
                Intent asec = new Intent(Section.this, CivilSubjects.class);
                asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                startActivity(asec);
                finish();
            } else {
                if (year == 3 || year == 5) {
                    Intent asec = new Intent(Section.this, Civilthirdsubjects.class);
                    asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                    startActivity(asec);
                    finish();
                } else {
                    if (year == 2 || year == 6) {
                        Intent asec = new Intent(Section.this, Civilsecondsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    } else {

                        Intent asec = new Intent(Section.this, Firstyearsubjects.class);
                        asec.putExtra("roll", getIntent().getExtras().getString("roll"));
                        startActivity(asec);
                        finish();
                    }
                }
            }
        }
    }



    public static String getSection(){
        switch (getSecId()){
            case 4:
                return "D" ;
            case 3:
                return "C";
            case 2:
                return "B";
            case 1:
                return "A";

        }
        return null;
    }
    public static int getSecId(){
        return sec;
    }
}




