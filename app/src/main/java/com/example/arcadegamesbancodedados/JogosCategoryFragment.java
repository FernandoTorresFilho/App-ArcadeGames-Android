package com.example.arcadegamesbancodedados;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JogosCategoryFragment extends AppCompatActivity implements JogosCategoryListFragment.Listener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos_category_fragment);
    }

    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {

            JogosDetalhesFragment details = new JogosDetalhesFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setJogoId(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_CONSOLE_ID, (int) id);
            startActivity(intent);
        }
    }
}