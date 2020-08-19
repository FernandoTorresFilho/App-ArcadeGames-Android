package com.example.arcadegamesbancodedados;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LojasCategory extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listConsole = getListView();
        ArrayAdapter<Console> listAdapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1, Lojas.loja);
        listConsole.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(LojasCategory.this, LojasDetalhes.class);
        intent.putExtra(LojasDetalhes.EXTRA_LOJASNO, (int) id);
        startActivity(intent);
    }

//        setContentView(R.layout.activity_console_category);
}

