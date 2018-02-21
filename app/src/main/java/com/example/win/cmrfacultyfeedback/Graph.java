package com.example.win.cmrfacultyfeedback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Graph extends AppCompatActivity {
        float b[] = new float[10];

    String name[]={"LP","CC","DP","DWDM","MC","IRS","DWDM LAB","LINUX LAB"};
    String second[]={"M-IV","DS through C++","MFCS","DLD","OOP through java","DS LAB","IT WORKSHOP","JAVA LAB","ES"};
    String third[]={"PPL","SE","CD","OS","OS LAB","CD LAB","CN","IPR"};
    String first[]={"M-I","EC","EP-I","PCE","EM","BEE","ENGLISH LAB","E WORKSHOP"};
    String ecefirst[]={"M-I","EC","EP-I","PCE","EM","BEE","ENGLISH LAB","E WORKSHOP"};
    String ecesecond[]={"M-III","PTSP","STLD","EC","EDC","EDC LAB","SS","BS LAB"};
    String ecethird[]={"CSE","COOS","AWP","EMI","AC LAB","IC/HDL LAB","AC","LDIP"};
    String ecefourth[]={"MS","ME","CN","CMC","DIP","ESD","ACS LAB","MEDC LAB"};
    String mechfirst[]={"M-I","EC","EP-I","PCE","EM","BEE","ENGLISH LAB","E WORKSHOP"};
    String mechsecond[]={"PS","EEE","MS","THERMO","MMS","EEE LAB","MMS LAB","ES"};
    String mechthird[]={"MEFA","EM","DM","MT","MTM LAB","TE LAB","DMM-I","TE-II"};
    String mechfourth[]={"OR","PPE","CAD & CAM","ICS","ROBOTICS","UMP","CADM LAB","PDPI LAB"};
    String civilfirst[]={"M-I","EC","EP-I","PCE","EM","BEE","ENGLISH LAB","E WORKSHOP"};
    String civilsecond[]={"M-IV","SM-I","FM-I","BMCP","SURVEYING","GS LAB","CD-I LAB","SURVEY LAB-I","STM LAB"};
    String civilthird[]={"CT","RCSDD","EG","GE","FMHM LAB","EG LAB","WRE-I","IPR"};
    String civilfourth[]={"RSG","TE","ES","WRE","WM","IWWT","CHM LAB","EE LAB"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        setTitle("Pie Diagram");
            Firebase.setAndroidContext(this);

        final String yr=getIntent().getExtras().getString("year");
        final String br=getIntent().getExtras().getString("branch");
        Toast.makeText(Graph.this, ""+br, Toast.LENGTH_SHORT).show();
        b[0]= Float.parseFloat(getIntent().getExtras().getString("percentage"));
        b[1]= Float.parseFloat(getIntent().getExtras().getString("cc"));
        b[2]= Float.parseFloat(getIntent().getExtras().getString("dp"));
        b[3]= Float.parseFloat(getIntent().getExtras().getString("dwdm"));
        b[4]= Float.parseFloat(getIntent().getExtras().getString("mc"));
        b[5]= Float.parseFloat(getIntent().getExtras().getString("irs"));
        b[6]= Float.parseFloat(getIntent().getExtras().getString("dl"));
        b[7]= Float.parseFloat(getIntent().getExtras().getString("ll"));

        if(br.equals("CSE")&&yr.equals("II year")) {
            b[8] = Float.parseFloat(getIntent().getExtras().getString("opt"));
        }
        if(br.equals("CIVIL")&&yr.equals("II year")){
            b[8]= Float.parseFloat(getIntent().getExtras().getString("opt"));
        }

        List<PieEntry> entry=new ArrayList<>();
        if(br.equals("CSE")) {
            if (yr.equals("IV year")) {
                for (int i = 0; i <= 7; i++) {
                    entry.add(new PieEntry(b[i], name[i]));
                }
            } else {
                if (yr.equals("III year")) {
                    for (int i = 0; i <= 7; i++) {
                        entry.add(new PieEntry(b[i], third[i]));
                    }
                } else {
                    if (yr.equals("II year")) {
                        for (int i = 0; i <= 8; i++) {
                            entry.add(new PieEntry(b[i], second[i]));
                        }
                    } else {
                        if (yr.equals("I year")) {
                            for (int i = 0; i <= 7; i++) {
                                entry.add(new PieEntry(b[i], first[i]));
                            }
                        } else {
                            Toast.makeText(Graph.this, "No Graph", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }
        if(br.equals("ECE"))
        {
            if (yr.equals("IV year")) {
                for (int i = 0; i <= 7; i++) {
                    entry.add(new PieEntry(b[i], ecefourth[i]));
                }
            } else {
                if (yr.equals("III year")) {
                    for (int i = 0; i <= 7; i++) {
                        entry.add(new PieEntry(b[i], ecethird[i]));
                    }
                } else {
                    if (yr.equals("II year")) {
                        for (int i = 0; i <= 7; i++) {
                            entry.add(new PieEntry(b[i], ecesecond[i]));
                        }
                    } else {
                        if (yr.equals("I year")) {
                            for (int i = 0; i <= 7; i++) {
                                entry.add(new PieEntry(b[i], ecefirst[i]));
                            }
                        } else {
                            Toast.makeText(Graph.this, "No Graph", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }
        if(br.equals("MECH"))
        {
            if (yr.equals("IV year")) {
                for (int i = 0; i <= 7; i++) {
                    entry.add(new PieEntry(b[i], mechfourth[i]));
                }
            } else {
                if (yr.equals("III year")) {
                    for (int i = 0; i <= 7; i++) {
                        entry.add(new PieEntry(b[i], mechthird[i]));
                    }
                } else {
                    if (yr.equals("II year")) {
                        for (int i = 0; i <= 7; i++) {
                            entry.add(new PieEntry(b[i], mechsecond[i]));
                        }
                    } else {
                        if (yr.equals("I year")) {
                            for (int i = 0; i <= 7; i++) {
                                entry.add(new PieEntry(b[i], mechfirst[i]));
                            }
                        } else {
                            Toast.makeText(Graph.this, "No Graph", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }
        if(br.equals("CIVIL"))
        {
            if (yr.equals("IV year")) {
                for (int i = 0; i <= 7; i++) {
                    entry.add(new PieEntry(b[i], civilfourth[i]));
                }
            } else {
                if (yr.equals("III year")) {
                    for (int i = 0; i <= 7; i++) {
                        entry.add(new PieEntry(b[i], civilthird[i]));
                    }
                } else {
                    if (yr.equals("II year")) {
                        for (int i = 0; i <= 8; i++) {
                            entry.add(new PieEntry(b[i], civilsecond[i]));
                        }
                    } else {
                        if (yr.equals("I year")) {
                            for (int i = 0; i <= 7; i++) {
                                entry.add(new PieEntry(b[i], civilfirst[i]));
                            }
                        } else {
                            Toast.makeText(Graph.this, "No Graph", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }

        PieDataSet set=new PieDataSet(entry,"subjects");
        set.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData dta=new PieData(set);
        dta.setValueTextSize(35f);
        PieChart chart=(PieChart)findViewById(R.id.pie);
        chart.setData(dta);
        chart.setCenterTextSize(20);
        chart.setCenterTextSizePixels(20);
        chart.animateY(1000);
        chart.invalidate();
        }
}


