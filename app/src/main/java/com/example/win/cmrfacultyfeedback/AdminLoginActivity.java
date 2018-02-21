package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminLoginActivity extends AppCompatActivity {
    private Button button;
    private EditText madmin_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        setTitle("Admin login");
        madmin_id=(EditText)findViewById(R.id.admin_id);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et=madmin_id.getText().toString();
                if(TextUtils.isEmpty(et)){
                    madmin_id.setError("please fill the field");
                    return;

                }
                if(et.equals("srujanraju")){

                    Intent intent=new Intent(AdminLoginActivity.this,Select.class);
                    startActivity(intent);
                    finish();
                }else{
                    madmin_id.setError("Enter Correct Password");
                }

            }
        });

    }
}
