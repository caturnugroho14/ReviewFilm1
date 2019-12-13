package com.example.reviewfilm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity implements View.OnClickListener{
        private LinearLayout btn1, btn2, btn3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void gmail (View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_EMAIL, new String[] { "yohanes.nugraha40@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"email dari aplikasi android");

        try{
            startActivity(Intent.createChooser(intent,"ingin kirim email?"));

        }catch (android.content.ActivityNotFoundException ex){

        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn1:
                    startActivity(new Intent(this,MainActivity.class));
                    break;


            }
            switch (view.getId()){
                case R.id.btn2:
                    startActivity(new Intent(this,rilis.class));

            }



    }
}
