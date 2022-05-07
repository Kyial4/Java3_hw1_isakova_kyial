package com.geektech.java3_hw1_isakova_kyial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button send;
    private EditText email;
    private EditText theme;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        theme = findViewById(R.id.theme);
        text = findViewById(R.id.et_text);

        send = findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+ email.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT, theme.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, text.getText().toString());
                startActivity(intent);
            }
        });
    }
}