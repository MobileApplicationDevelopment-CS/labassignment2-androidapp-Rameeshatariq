package com.example.meesh.labassign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class firstpage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        Button signup = (Button)findViewById(R.id.btn);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(firstpage.this, "Account Created",Toast.LENGTH_LONG).show();
        Intent i=new Intent(firstpage.this, MainActivity.class);
        startActivity(i);
    }

    public void sign(View v)
    {
        Intent inn=new Intent();
        inn.setClass(this,MainActivity.class);
        startActivity(inn);
    }


}
