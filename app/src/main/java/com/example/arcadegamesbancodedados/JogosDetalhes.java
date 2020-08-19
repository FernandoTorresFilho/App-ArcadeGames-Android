package com.example.arcadegamesbancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class JogosDetalhes extends AppCompatActivity {

    public static final String EXTRA_CONSOLENO = "consoleNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console_detalhes);

        int JogosNo = (Integer)getIntent().getExtras().get(EXTRA_CONSOLENO);
        Jogos jogos = Jogos.jogo[JogosNo];

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(jogos.getImageResourceId());
        photo.setContentDescription(jogos.getName());

        TextView name = findViewById(R.id.name);
        name.setText(jogos.getName());

        TextView description = findViewById(R.id.description);
        description.setText(jogos.getDescription());

    }
}