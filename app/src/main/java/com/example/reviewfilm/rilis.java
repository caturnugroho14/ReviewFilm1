package com.example.reviewfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rilis extends AppCompatActivity implements View.OnClickListener {
    private Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rilis);

        btnexit = (Button) findViewById(R.id.btnexit);
        btnexit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnexit:
                startActivity(new Intent(this,home.class));
                break;
    }
}
}
