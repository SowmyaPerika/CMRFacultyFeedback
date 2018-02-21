package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    private Button bt;
    private TextView textView4,textView5,textView6 ;
    private Spinner myearspinner,msectionspinner,mbranchspinner;
    String y,sec,sub,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        setTitle("Details");

        bt=(Button)findViewById(R.id.button3);
        myearspinner=(Spinner)findViewById(R.id.yearspinner);
        msectionspinner=(Spinner)findViewById(R.id.sectionspinner);
        mbranchspinner=(Spinner)findViewById(R.id.branchspinner);


        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(Details.this,
                R.array.yearspinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myearspinner.setAdapter(adapter);
        myearspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                y=(String) parent.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Details.this,"Please select any subject",Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(Details.this,
                R.array.sectionspinner,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        msectionspinner.setAdapter(adapter2);
        msectionspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                sec=(String) parent.getItemAtPosition(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Details.this,"Please select any subject",Toast.LENGTH_LONG).show();

            }
        });
        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(Details.this,
                R.array.branchspinner,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mbranchspinner.setAdapter(adapter1);
        mbranchspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                b=(String) parent.getItemAtPosition(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Details.this,"Please select any Branch",Toast.LENGTH_LONG).show();

            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b.equals("CSE")) {
                    if (y.equals("IV year")) {
                        Intent i = new Intent(Details.this, Report.class);
                        i.putExtra("branch", b);
                        i.putExtra("year", y);
                        i.putExtra("section", sec);
                        startActivity(i);
                    } else {
                        if (y.equals("III year")) {
                            Intent i = new Intent(Details.this, Thirdyearreport.class);
                            i.putExtra("branch", b);
                            i.putExtra("year", y);
                            i.putExtra("section", sec);
                            startActivity(i);
                        } else {
                            if (y.equals("II year")) {
                                Intent i = new Intent(Details.this, Secondyearreport.class);
                                i.putExtra("year", y);
                                i.putExtra("branch", b);
                                i.putExtra("section", sec);
                                startActivity(i);
                            } else {
                                Intent i = new Intent(Details.this, Firstyearreport.class);
                                i.putExtra("branch", b);

                                i.putExtra("year", y);
                                i.putExtra("section", sec);
                                startActivity(i);
                            }
                        }

                    }
                }
                if(b.equals("ECE")) {
                    if (y.equals("IV year")) {
                        Intent i = new Intent(Details.this, EceReport.class);
                        i.putExtra("branch", b);
                        i.putExtra("year", y);
                        i.putExtra("section", sec);
                        startActivity(i);
                    } else {
                        if (y.equals("III year")) {
                            Intent i = new Intent(Details.this, EceThirdReport.class);
                            i.putExtra("branch", b);
                            i.putExtra("year", y);
                            i.putExtra("section", sec);
                            startActivity(i);
                        } else {
                            if (y.equals("II year")) {
                                Intent i = new Intent(Details.this, EceSecondReport.class);
                                i.putExtra("year", y);
                                i.putExtra("branch", b);
                                i.putExtra("section", sec);
                                startActivity(i);
                            } else {
                                Intent i = new Intent(Details.this, Firstyearreport.class);

                                i.putExtra("branch",b);
                                i.putExtra("year", y);
                                i.putExtra("section", sec);
                                startActivity(i);
                            }
                        }

                    }
                }
                if(b.equals("MECH")) {
                    if (y.equals("IV year")) {
                        Intent i = new Intent(Details.this, MechReport.class);
                        i.putExtra("branch", b);
                        i.putExtra("year", y);
                        i.putExtra("section", sec);
                        startActivity(i);
                    } else {
                        if (y.equals("III year")) {
                            Intent i = new Intent(Details.this, MechThirdReport.class);
                            i.putExtra("branch", b);
                            i.putExtra("year", y);
                            i.putExtra("section", sec);
                            startActivity(i);
                        } else {
                            if (y.equals("II year")) {
                                Intent i = new Intent(Details.this, MechSecondReport.class);
                                i.putExtra("year", y);
                                i.putExtra("branch", b);
                                i.putExtra("section", sec);
                                startActivity(i);
                            } else {
                                Intent i = new Intent(Details.this, Firstyearreport.class);
                                i.putExtra("branch", b);

                                i.putExtra("year", y);
                                i.putExtra("section", sec);
                                startActivity(i);
                            }
                        }

                    }
                }
                if(b.equals("CIVIL")) {
                    if (y.equals("IV year")) {
                        Intent i = new Intent(Details.this, CivilReport.class);
                        i.putExtra("branch", b);
                        i.putExtra("year", y);
                        i.putExtra("section", sec);
                        startActivity(i);
                    } else {
                        if (y.equals("III year")) {
                            Intent i = new Intent(Details.this, CivilThirdReport.class);
                            i.putExtra("branch", b);
                            i.putExtra("year", y);
                            i.putExtra("section", sec);
                            startActivity(i);
                        } else {
                            if (y.equals("II year")) {
                                Intent i = new Intent(Details.this, CivilSecondReport.class);
                                i.putExtra("year", y);
                                i.putExtra("branch", b);
                                i.putExtra("section", sec);
                                startActivity(i);
                            } else {
                                Intent i = new Intent(Details.this, Firstyearreport.class);
                                i.putExtra("branch", b);
                                i.putExtra("year", y);
                                i.putExtra("section", sec);
                                startActivity(i);
                            }
                        }

                    }
                }



            }
        });
    }
}
