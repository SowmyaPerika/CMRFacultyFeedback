package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Branch extends AppCompatActivity {

    private Button mcse,mece,mmech,mcivil;
    public static int branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        setTitle("Branch");
        mcse=(Button)findViewById(R.id.cse);
        mece=(Button)findViewById(R.id.ece);
        mmech=(Button)findViewById(R.id.mech);
        mcivil=(Button)findViewById(R.id.civil);
        final String rollnum=getIntent().getExtras().getString("roll");
        mcse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rollnum.substring(7,8).equals("5")) {
                    branch=1;
                    Intent mainIntent = new Intent(Branch.this, YearActivity.class);
                    mainIntent.putExtra("roll", rollnum);
                    startActivity(mainIntent);
                    finish();
                }else
                {
                    Toast.makeText(Branch.this, "Incorrect Branch", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rollnum.substring(7,8).equals("4")) {
                    branch=2;
                    Intent mainIntent = new Intent(Branch.this, YearActivity.class);
                    mainIntent.putExtra("roll", rollnum);
                    startActivity(mainIntent);
                    finish();
                }else
                {
                    Toast.makeText(Branch.this, "Incorrect Branch", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mmech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rollnum.substring(7,8).equals("3")) {
                    branch=3;
                    Intent mainIntent = new Intent(Branch.this, YearActivity.class);
                    mainIntent.putExtra("roll", rollnum);
                    startActivity(mainIntent);
                    finish();
                }else
                {
                    Toast.makeText(Branch.this, "Incorrect Branch", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mcivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rollnum.substring(7,8).equals("1")) {
                    branch=4;
                    Intent mainIntent = new Intent(Branch.this, YearActivity.class);
                    mainIntent.putExtra("roll", rollnum);
                    startActivity(mainIntent);
                    finish();
                }else
                {
                    Toast.makeText(Branch.this, "Incorrect Branch", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    public static String getbranch()
    {
        switch (branchId()){
            case 4:
                return "CIVIL" ;
            case 3:
                return "MECH";
            case 2:
                return "ECE";
            case 1:
                return "CSE";

        }
        return null;


    }
    public static int branchId()
    {
        return branch;
    }
}
