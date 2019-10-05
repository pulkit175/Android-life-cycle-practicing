 package com.example.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numberTexr=(EditText) findViewById(R.id.number);
        final EditText passwordText=(EditText)findViewById(R.id.password);
        final EditText additionInput=(EditText)findViewById(R.id.addition);
        final EditText subtractionText=(EditText)findViewById(R.id.subtraction);
        Button loginButton=(Button) findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordText.getText().toString().equals("123"))
                {
                    Intent i= new Intent(MainActivity.this,Second.class);
                    i.putExtra("addition",Integer.parseInt(additionInput.getText().toString()));
                    i.putExtra("subtraction",Integer.parseInt(subtractionText.getText().toString()));
                    startActivity(i);
                }
            }
        });
    }
}
