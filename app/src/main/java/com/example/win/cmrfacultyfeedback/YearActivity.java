package com.example.win.cmrfacultyfeedback;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

/**
 * Created by win on 28/09/2017.
 */

public class YearActivity extends AppCompatActivity {
    private Button year,mece,mmech,mcivil;
    private  static int id;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        Firebase.setAndroidContext(this);
        setTitle("Year");
        mece=(Button)findViewById(R.id.ece);
        mece.setVisibility(View.INVISIBLE);
        mmech=(Button)findViewById(R.id.mech);
        mmech.setVisibility(View.INVISIBLE);
        mcivil=(Button)findViewById(R.id.civil);
        mcivil.setVisibility(View.INVISIBLE);
        year=(Button)findViewById(R.id.cse);
        final String rollnum=getIntent().getExtras().getString("roll").trim().toLowerCase();
        if(rollnum.equals("147r1a05c2")){
            id=5;
            year.setText("III");
        }else {
            if (rollnum.equals("157r1a0519") || rollnum.equals("157r1a0521") || rollnum.equals("157r1a0540") ||
                    rollnum.equals("157r1a0577") || rollnum.equals("157r1a05b7") ) {
                id=6;
                year.setText("II");

            } else {
                if (rollnum.equals("157r5a0501") || rollnum.equals("157r5a0502") || rollnum.equals("157r5a0503") ||
                        rollnum.equals("157r5a0504")||rollnum.equals("137r1a0540") || rollnum.startsWith("147")) {
                    id = 4;
                    year.setText("IV");
                } else {
                    if (rollnum.equals("15n41a0505") || rollnum.equals("15401a0510") || rollnum.equals("15401a0521") ||
                            rollnum.equals("167r5a0501") || rollnum.equals("167r5a0502") || rollnum.equals("167r5a0503") ||
                            rollnum.equals("167r5a0504") || rollnum.equals("167r5a0505") || rollnum.equals("167r5a0506") ||
                            rollnum.equals("167r5a0507") || rollnum.equals("167r5a0508") || rollnum.equals("167r5a0509") ||
                            rollnum.equals("167r5a0510") || rollnum.startsWith("157")) {

                        id = 3;
                        year.setText("III");
                    } else {
                        if (rollnum.equals("177r5a0501") || rollnum.equals("177r5a0502") || rollnum.equals("177r5a0503") ||
                                rollnum.equals("177r5a0504") || rollnum.equals("177r5a0505") || rollnum.equals("177r5a0506") ||
                                rollnum.equals("177r5a0507") || rollnum.startsWith("167")) {
                            id = 2;
                            year.setText("II");
                        } else {
                            id = 1;
                            year.setText("I");

                        }
                    }
                }
            }
        }

        year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(YearActivity.this,Section.class);
                mainIntent.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(mainIntent);
                finish();

            }
        });
    }
    public static String getYear(){
        switch (getId()){
            case 4:

                return "IV year" ;
            case 3:
                return "III year";
            case 2:
                return "II year";
            case 1:
                return "I year";
            case 5:
                return "III year";
            case 6:
                return "II year";


        }
        return null;
    }
    public static int getId(){
        return id;
    }

}




