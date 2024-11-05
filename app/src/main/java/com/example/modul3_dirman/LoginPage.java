package com.example.modul3_dirman;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText user = findViewById(R.id.user);
        EditText pass = findViewById(R.id.inputpass);
        Button kembali = findViewById(R.id.btnKembali);
        Button login = findViewById(R.id.btnLogin);




    login.setOnClickListener(v -> {
        String username = user.getText().toString();
        String password = pass.getText().toString();
        if(username.equals("admin")&& password.equals("admin")){
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "gagal", Toast.LENGTH_SHORT).show();
        }
    });

        kembali.setOnClickListener(v -> {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        });
    }
}