package com.example.arcadegamesbancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_CONSOLE_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        JogosDetalhesFragment frag = (JogosDetalhesFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int jogoId = (int)getIntent().getExtras().get(EXTRA_CONSOLE_ID);
        frag.setJogoId(jogoId);
    }
}


