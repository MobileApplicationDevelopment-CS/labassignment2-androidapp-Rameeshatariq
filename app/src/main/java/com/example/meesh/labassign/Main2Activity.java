package com.example.meesh.labassign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extra = getIntent().getExtras(); //wahan se jo put yahan par get
        if(extra != null){//check k null tou nai hai
            String uname = extra.getString("my msg");
            Toast.makeText(Main2Activity.this, "Welcome  " +
                    "" + uname, Toast.LENGTH_LONG).show(); // jo wahan par username hai wo show
        }


    }
}
