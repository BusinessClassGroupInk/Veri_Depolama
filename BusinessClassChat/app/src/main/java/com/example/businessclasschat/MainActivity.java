package com.example.businessclasschat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLog , bNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLog = (Button) findViewById(R.id.login);
        bNew = (Button) findViewById(R.id.new_account);

        bLog.setOnClickListener(this);
        bNew.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        if(v.getId()==bLog.getId()){
        Intent intentLogin = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intentLogin);
    }

    else if(v.getId()==bNew.getId()){
        Intent intentNew = new Intent(MainActivity.this,NewAccountActivity.class);
        startActivity(intentNew);
    }
    }

}
