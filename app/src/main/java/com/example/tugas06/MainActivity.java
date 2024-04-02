package com.example.tugas06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Detail{

    private RecyclerView recyclerView;
    private FuneralAdapter funeralAdapter;
    private ArrayList<FuneralModel> funeralModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        funeralAdapter = new FuneralAdapter(funeralModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(funeralAdapter);
    }

    private void getData() {
        funeralModel = new ArrayList<>();
        funeralModel.add(new FuneralModel("Guci", R.drawable.gucibiasa));
        funeralModel.add(new FuneralModel("Guci Hitam", R.drawable.gucihitam));
        funeralModel.add(new FuneralModel("Guci Tradisional", R.drawable.gucikerajaan));
        funeralModel.add(new FuneralModel("Guci Antik", R.drawable.gucimahal));
        funeralModel.add(new FuneralModel("Guci Putih", R.drawable.gucimurah));
        funeralModel.add(new FuneralModel("Peti Kayu", R.drawable.petibiasa));
        funeralModel.add(new FuneralModel("Peti Antik", R.drawable.peticina));
        funeralModel.add(new FuneralModel("Peti Pajangan", R.drawable.petimahal));
        funeralModel.add(new FuneralModel("Peti Putih", R.drawable.petisedang));
        funeralModel.add(new FuneralModel("Peti", R.drawable.petimurah));
        funeralModel.add(new FuneralModel("Batu Nisan", R.drawable.batunisan));
        funeralModel.add(new FuneralModel("Kayu Nisan", R.drawable.kayunisan));
        funeralModel.add(new FuneralModel("Nisan Hias", R.drawable.nisanhias));
        funeralModel.add(new FuneralModel("Nisan Keramik", R.drawable.nisankeramik));
        funeralModel.add(new FuneralModel("Bunga Hias", R.drawable.bungahias));
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, DetailItem.class);

        intent.putExtra("NAMA", funeralModel.get(position).getJenisFuneral());
        intent.putExtra("DESKRIPSI", funeralModel.get(position).getJenisFuneral());
        intent.putExtra("BAHAN", funeralModel.get(position).getJenisFuneral());
        intent.putExtra("HARGA", funeralModel.get(position).getJenisFuneral());
        intent.putExtra("GAMBAR", funeralModel.get(position).getJenisFuneral());
        intent.putExtra("BAHAN", funeralModel.get(position).getJenisFuneral());

        startActivity(intent);

    }
}