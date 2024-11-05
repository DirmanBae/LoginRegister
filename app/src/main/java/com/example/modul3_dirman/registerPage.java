package com.example.modul3_dirman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnRegis = findViewById(R.id.btnRegister);
        Button kembali = findViewById(R.id.btnKembali);

        EditText email = findViewById(R.id.email);
        EditText pass = findViewById(R.id.user);
        EditText user = findViewById(R.id.pass);




                kembali.setOnClickListener(v -> {
                    Intent i = new Intent(this,MainActivity.class);
                    startActivity(i);
                });

    }
}