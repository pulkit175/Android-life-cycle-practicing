package com.example.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView randomDisplay=(TextView)findViewById(R.id.random);
        TextView result=(TextView)findViewById(R.id.bankBalance);
        Intent i= getIntent();
        int random=new Random().nextInt((100-1)+1)+1;
        int add=i.getIntExtra("addition",0);
        int sub=i.getIntExtra("subtraction",0);
        randomDisplay.setText(""+random);
        result.setText(""+(random+add-sub));
    }
}
