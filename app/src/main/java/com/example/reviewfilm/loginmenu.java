package com.example.reviewfilm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginmenu extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginmenu);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernamekey = username.getText().toString();
                String passwordkey = password.getText().toString();

                if (usernamekey.equals("admin")&& passwordkey.equals("admin")){
                    //login sukses
                    Toast.makeText(getApplicationContext(),"login sukses",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(loginmenu.this, home.class);
                    loginmenu.this.startActivity(intent);
                    finish();
                }
            }
        });
    }
}
