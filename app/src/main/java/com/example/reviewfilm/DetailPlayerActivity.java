package com.example.reviewfilm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPlayerActivity extends AppCompatActivity {

    public static String EXTRA_PLAYER = "extra_player";
    TextView tvNo, tvNama,gambar ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        tvNo = findViewById(R.id.tvNo);
        tvNama = findViewById(R.id.tvNama);


        PlayerItem playerItem =  getIntent().getParcelableExtra(EXTRA_PLAYER);

        String no = playerItem.getNo();
        String name = playerItem.getName();

        tvNo.setText(no);
        tvNama.setText(name);


    }
}
