package com.example.tugas06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        String nama = getIntent().getStringExtra("NAMA");
        String deskripsi = getIntent().getStringExtra("DESKRIPSI");
        String bahan = getIntent().getStringExtra("BAHAN");
        String harga = getIntent().getStringExtra("HARGA");
        int gambar = getIntent().getIntExtra("GAMBAR", 0);

        TextView tvNama = findViewById(R.id.tvfuneral);
        TextView tvDeskripsi = findViewById(R.id.tvdeskripsi);
        TextView tvBahan = findViewById(R.id.tvbahan);
        TextView tvHarga = findViewById(R.id.tvharga);
        ImageView ivGambar = findViewById(R.id.ivfuneral);

        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        tvBahan.setText(bahan);
        tvHarga.setText(harga);
        ivGambar.setImageResource(gambar);

    }
}