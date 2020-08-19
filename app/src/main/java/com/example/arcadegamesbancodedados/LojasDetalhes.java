package com.example.arcadegamesbancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class LojasDetalhes extends AppCompatActivity {

    public static final String EXTRA_LOJASNO = "lojasNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lojas_detalhes);

        int lojasNo = (Integer)getIntent().getExtras().get(EXTRA_LOJASNO);
        Lojas lojas = Lojas.loja[lojasNo];

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(lojas.getImageResourceId());
        photo.setContentDescription(lojas.getName());

        TextView name = findViewById(R.id.name);
        name.setText(lojas.getName());

        TextView description = findViewById(R.id.description);
        description.setText(lojas.getDescription());

    }
}