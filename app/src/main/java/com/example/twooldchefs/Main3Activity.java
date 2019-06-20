package com.example.twooldchefs;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://documentcloud.adobe.com/link/track?uri=urn%3Aaaid%3Ascds%3AUS%3A99986d72-cc69-4952-8eab-202d7fc90b98"));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://documentcloud.adobe.com/link/track?uri=urn%3Aaaid%3Ascds%3AUS%3A7bb78894-4527-4375-9a77-230c7353922c"));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://documentcloud.adobe.com/link/track?uri=urn%3Aaaid%3Ascds%3AUS%3A4958c538-9ee8-4521-8f4d-521a2d6d315a"));
                startActivity(i);
            }
        });
    }
}
